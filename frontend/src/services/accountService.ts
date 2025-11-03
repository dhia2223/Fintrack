import api from './api';

export interface Account {
  id: number;
  name: string;
  type: 'CHECKING' | 'SAVINGS' | 'CREDIT_CARD' | 'CASH' | 'INVESTMENT';
  balance: number;
  currency: string;
  active: boolean;
  createdAt: string;
  updatedAt: string;
}

export const accountService = {
  async getAccounts(): Promise<Account[]> {
    const response = await api.get<Account[]>('/accounts');
    return response.data;
  },

  async getAccount(id: number): Promise<Account> {
    const response = await api.get<Account>(`/accounts/${id}`);
    return response.data;
  },

  async getTotalBalance(): Promise<number> {
    const response = await api.get<number>('/accounts/balance/total');
    return response.data;
  },

  async createAccount(accountData: {
    name: string;
    type: Account['type'];
    initialBalance?: number;
    currency?: string;
  }): Promise<Account> {
    const response = await api.post<Account>('/accounts', accountData);
    return response.data;
  },
};