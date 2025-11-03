import api from './api';

export interface Category {
  id: number;
  name: string;
  description?: string;
  color: string;
  system: boolean;
  createdAt: string;
  updatedAt: string;
}

export const categoryService = {
  async getCategories(): Promise<Category[]> {
    const response = await api.get<Category[]>('/categories');
    return response.data;
  },

  async getCustomCategories(): Promise<Category[]> {
    const response = await api.get<Category[]>('/categories/custom');
    return response.data;
  },

  async createCategory(name: string, description?: string, color?: string): Promise<Category> {
    const response = await api.post<Category>('/categories', null, {
      params: { name, description, color },
    });
    return response.data;
  },

  async deleteCategory(id: number): Promise<void> {
    await api.delete(`/categories/${id}`);
  },
};

export default categoryService;