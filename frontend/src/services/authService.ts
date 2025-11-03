import api from './api';
import type { LoginRequest, RegisterRequest, AuthResponse, User } from '../types/auth';

// Named export for authService
export const authService = {
  async login(credentials: LoginRequest): Promise<AuthResponse> {
    const response = await api.post<AuthResponse>('/auth/login', credentials);
    return response.data;
  },

  async register(userData: RegisterRequest): Promise<{ message: string }> {
    const response = await api.post<{ message: string }>('/auth/register', userData);
    return response.data;
  },

  async getCurrentUser(): Promise<User> {
    const response = await api.get<AuthResponse>('/auth/me');
    const { email, firstName, lastName } = response.data;
    return { email, firstName, lastName };
  },

  // Utility functions for token management
  saveAuthData(token: string, user: User): void {
    localStorage.setItem('authToken', token);
    localStorage.setItem('user', JSON.stringify(user));
  },

  getStoredAuthData(): { token: string | null; user: User | null } {
    const token = localStorage.getItem('authToken');
    const userStr = localStorage.getItem('user');
    const user = userStr ? JSON.parse(userStr) : null;
    return { token, user };
  },

  clearAuthData(): void {
    localStorage.removeItem('authToken');
    localStorage.removeItem('user');
  },
};

// Default export for backward compatibility
export default authService;