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

export interface TransactionFormData {
  accountId: number;
  categoryId?: number;
  amount: number;
  description: string;
  type: 'INCOME' | 'EXPENSE';
  transactionDate: string;
}