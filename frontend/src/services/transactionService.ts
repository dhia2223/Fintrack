import api from './api';

export interface Transaction {
  id: number;
  accountId: number;
  accountName: string;
  categoryId?: number;
  categoryName?: string;
  categoryColor?: string;
  amount: number;
  description: string;
  type: 'INCOME' | 'EXPENSE';
  transactionDate: string;
  createdAt: string;
  updatedAt: string;
}

export interface TransactionRequest {
  accountId: number;
  categoryId?: number;
  amount: number;
  description: string;
  type: 'INCOME' | 'EXPENSE';
  transactionDate: string;
}

export interface TransactionFilters {
  accountId?: number;
  categoryId?: number;
  type?: 'INCOME' | 'EXPENSE';
  startDate?: string;
  endDate?: string;
  page?: number;
  size?: number;
}

export const transactionService = {
  async getTransactions(filters: TransactionFilters = {}): Promise<{
    content: Transaction[];
    totalElements: number;
    totalPages: number;
    size: number;
    number: number;
  }> {
    const response = await api.get('/transactions', { params: filters });
    return response.data;
  },

  async getTransaction(id: number): Promise<Transaction> {
    const response = await api.get<Transaction>(`/transactions/${id}`);
    return response.data;
  },

  async createTransaction(transaction: TransactionRequest): Promise<Transaction> {
    const response = await api.post<Transaction>('/transactions', transaction);
    return response.data;
  },

  async updateTransaction(id: number, transaction: TransactionRequest): Promise<Transaction> {
    const response = await api.put<Transaction>(`/transactions/${id}`, transaction);
    return response.data;
  },

  async deleteTransaction(id: number): Promise<void> {
    await api.delete(`/transactions/${id}`);
  },

  async getTotalIncome(startDate?: string, endDate?: string): Promise<number> {
    const response = await api.get<number>('/transactions/summary/income', {
      params: { startDate, endDate },
    });
    return response.data;
  },

  async getTotalExpenses(startDate?: string, endDate?: string): Promise<number> {
    const response = await api.get<number>('/transactions/summary/expenses', {
      params: { startDate, endDate },
    });
    return response.data;
  },
};

export default transactionService;