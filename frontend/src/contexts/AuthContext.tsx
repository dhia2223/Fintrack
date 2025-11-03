import React, { createContext, useContext, useState, useEffect, type ReactNode } from 'react';
import type { AuthContextType, User, LoginRequest, RegisterRequest } from '../types/auth';
import { authService } from '../services/authService'; // Fixed import

const AuthContext = createContext<AuthContextType | undefined>(undefined);

interface AuthProviderProps {
  children: ReactNode;
}

export const AuthProvider: React.FC<AuthProviderProps> = ({ children }) => {
  const [user, setUser] = useState<User | null>(null);
  const [token, setToken] = useState<string | null>(null);
  const [isLoading, setIsLoading] = useState(true);

  // Initialize auth state from localStorage
  useEffect(() => {
    const initializeAuth = async () => {
      const { token: storedToken, user: storedUser } = authService.getStoredAuthData();
      
      if (storedToken && storedUser) {
        setToken(storedToken);
        setUser(storedUser);
        
        // Verify token is still valid by fetching current user
        try {
          await authService.getCurrentUser();
        } catch {
          // Token is invalid, clear stored data
          authService.clearAuthData();
          setToken(null);
          setUser(null);
        }
      }
      
      setIsLoading(false);
    };

    initializeAuth();
  }, []);

  const login = async (credentials: LoginRequest): Promise<void> => {
    const response = await authService.login(credentials);
    const { token: authToken, email, firstName, lastName } = response;
    
    const userData = { email, firstName, lastName };
    
    setToken(authToken);
    setUser(userData);
    authService.saveAuthData(authToken, userData);
  };

  const register = async (userData: RegisterRequest): Promise<void> => {
    await authService.register(userData);
  };

  const logout = (): void => {
    setUser(null);
    setToken(null);
    authService.clearAuthData();
    window.location.href = '/login';
  };

  const value: AuthContextType = {
    user,
    token,
    isLoading,
    login,
    register,
    logout,
    isAuthenticated: !!token && !!user,
  };

  return <AuthContext.Provider value={value}>{children}</AuthContext.Provider>;
};

export const useAuth = (): AuthContextType => {
  const context = useContext(AuthContext);
  if (context === undefined) {
    throw new Error('useAuth must be used within an AuthProvider');
  }
  return context;
};