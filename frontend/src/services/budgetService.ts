import api from './api';

export interface Budget {
  id: number;
  categoryId: number;
  categoryName: string;
  categoryColor: string;
  amount: number;
  month: string;
  spentAmount: number;
  remainingAmount: number;
  percentageUsed: number;
  createdAt: string;
  updatedAt: string;
}

export interface BudgetRequest {
  categoryId: number;
  amount: number;
  month: string;
}

export interface BudgetFilters {
  month?: string;
}

export const budgetService = {
  async getBudgets(filters: BudgetFilters = {}): Promise<Budget[]> {
    const response = await api.get<Budget[]>('/budgets', { params: filters });
    return response.data;
  },

  async getBudget(id: number): Promise<Budget> {
    const response = await api.get<Budget>(`/budgets/${id}`);
    return response.data;
  },

  async createBudget(budget: BudgetRequest): Promise<Budget> {
    const response = await api.post<Budget>('/budgets', budget);
    return response.data;
  },

  async updateBudget(id: number, amount: number): Promise<Budget> {
    const response = await api.put<Budget>(`/budgets/${id}`, null, {
      params: { amount }
    });
    return response.data;
  },

  async deleteBudget(id: number): Promise<void> {
    await api.delete(`/budgets/${id}`);
  },

  async getTotalBudgetForMonth(month?: string): Promise<number> {
    const response = await api.get<number>('/budgets/total', {
      params: { month }
    });
    return response.data;
  },
};

export default budgetService;