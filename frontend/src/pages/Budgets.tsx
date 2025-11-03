import { useState, useEffect } from 'react';
import { budgetService, type Budget, type BudgetRequest } from '../services/budgetService';
import { categoryService, type Category } from '../services/categoryService';
import LoadingSpinner from '../components/ui/LoadingSpinner';

const Budgets = () => {
  const [budgets, setBudgets] = useState<Budget[]>([]);
  const [categories, setCategories] = useState<Category[]>([]);
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState('');
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [isSubmitting, setIsSubmitting] = useState(false);
  const [selectedMonth, setSelectedMonth] = useState(getCurrentMonth());

  const [formData, setFormData] = useState<BudgetRequest>({
    categoryId: 0,
    amount: 0,
    month: getCurrentMonth()
  });

  useEffect(() => {
    loadData();
  }, [selectedMonth]);

  const loadData = async () => {
    try {
      setIsLoading(true);
      setError('');
      
      const [budgetsData, categoriesData] = await Promise.all([
        budgetService.getBudgets({ month: selectedMonth }),
        categoryService.getCategories()
      ]);

      setBudgets(budgetsData);
      setCategories(categoriesData);
    } catch (err: unknown) {
      const errorMessage = err instanceof Error ? err.message : 'Failed to load budgets';
      setError(errorMessage);
    } finally {
      setIsLoading(false);
    }
  };

  function getCurrentMonth(): string {
    const now = new Date();
    return now.toISOString().split('T')[0].substring(0, 7) + '-01';
  }

  function formatMonth(monthString: string): string {
    const date = new Date(monthString);
    return date.toLocaleDateString('en-US', { year: 'numeric', month: 'long' });
  }

  const openCreateModal = () => {
    setFormData({
      categoryId: 0,
      amount: 0,
      month: selectedMonth
    });
    setIsModalOpen(true);
  };

  const closeModal = () => {
    setIsModalOpen(false);
    setFormData({
      categoryId: 0,
      amount: 0,
      month: selectedMonth
    });
  };

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    try {
      setIsSubmitting(true);
      setError('');

      if (formData.categoryId === 0) {
        setError('Please select a category');
        return;
      }

      if (formData.amount <= 0) {
        setError('Amount must be greater than 0');
        return;
      }

      await budgetService.createBudget(formData);
      await loadData();
      closeModal();
    } catch (err: unknown) {
      const errorMessage = err instanceof Error ? err.message : 'Failed to create budget';
      setError(errorMessage);
    } finally {
      setIsSubmitting(false);
    }
  };

  const handleDelete = async (id: number) => {
    if (!confirm('Are you sure you want to delete this budget?')) {
      return;
    }

    try {
      setError('');
      await budgetService.deleteBudget(id);
      await loadData();
    } catch (err: unknown) {
      const errorMessage = err instanceof Error ? err.message : 'Failed to delete budget';
      setError(errorMessage);
    }
  };

  const formatCurrency = (amount: number): string => {
    return new Intl.NumberFormat('en-US', {
      style: 'currency',
      currency: 'USD',
    }).format(amount);
  };

  const getProgressBarColor = (percentage: number): string => {
    if (percentage <= 60) return 'bg-green-500';
    if (percentage <= 85) return 'bg-yellow-500';
    return 'bg-red-500';
  };

  const getAvailableCategories = () => {
    const budgetedCategoryIds = new Set(budgets.map(budget => budget.categoryId));
    return categories.filter(category => !budgetedCategoryIds.has(category.id));
  };

  if (isLoading) {
    return (
      <div className="space-y-6">
        <div className="flex items-center justify-between">
          <h2 className="text-3xl font-bold text-gray-900">Budgets</h2>
        </div>
        <div className="flex items-center justify-center h-64">
          <LoadingSpinner size="lg" />
        </div>
      </div>
    );
  }

  return (
    <div className="space-y-6">
      {/* Header */}
      <div className="flex items-center justify-between">
        <h2 className="text-3xl font-bold text-gray-900">Budgets</h2>
        <button
          onClick={openCreateModal}
          className="bg-primary-500 text-white px-6 py-3 rounded-lg hover:bg-primary-600 transition-colors shadow-sm font-medium"
        >
          Add Budget
        </button>
      </div>

      {/* Month Selector */}
      <div className="bg-white p-4 rounded-lg shadow-sm border border-gray-200">
        <label htmlFor="month-select" className="block text-sm font-medium text-gray-700 mb-2">
          View budgets for:
        </label>
        <input
          type="month"
          id="month-select"
          value={selectedMonth.substring(0, 7)}
          onChange={(e) => setSelectedMonth(e.target.value + '-01')}
          className="px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
        />
      </div>

      {/* Error Display */}
      {error && (
        <div className="bg-red-50 border border-red-200 text-red-700 px-4 py-3 rounded-lg">
          {error}
        </div>
      )}

      {/* Budgets List */}
      <div className="bg-white rounded-xl shadow-sm border border-gray-200">
        <div className="p-6 border-b border-gray-200">
          <h3 className="text-lg font-semibold text-gray-900">
            Budgets for {formatMonth(selectedMonth)}
          </h3>
          <p className="text-sm text-gray-600 mt-1">
            Track your spending against your budget goals
          </p>
        </div>
        
        {budgets.length === 0 ? (
          <div className="p-8 text-center">
            <div className="text-6xl mb-4">🎯</div>
            <h4 className="text-lg font-semibold text-gray-900 mb-2">No budgets set for this month</h4>
            <p className="text-gray-600 mb-4">
              Create your first budget to start tracking your spending goals.
            </p>
            <button
              onClick={openCreateModal}
              className="bg-primary-500 text-white px-6 py-3 rounded-lg hover:bg-primary-600 transition-colors"
            >
              Create Your First Budget
            </button>
          </div>
        ) : (
          <div className="p-6 space-y-6">
            {budgets.map((budget) => (
              <div
                key={budget.id}
                className="border border-gray-200 rounded-lg p-6 hover:shadow-md transition-shadow"
              >
                <div className="flex items-center justify-between mb-4">
                  <div className="flex items-center space-x-3">
                    <div
                      className="w-4 h-4 rounded-full"
                      style={{ backgroundColor: budget.categoryColor }}
                    ></div>
                    <div>
                      <h4 className="font-semibold text-gray-900">{budget.categoryName}</h4>
                      <p className="text-sm text-gray-600">
                        Budget: {formatCurrency(budget.amount)}
                      </p>
                    </div>
                  </div>
                  <button
                    onClick={() => handleDelete(budget.id)}
                    className="text-red-600 hover:text-red-800 text-sm font-medium"
                  >
                    Delete
                  </button>
                </div>

                {/* Progress Bar */}
                <div className="space-y-2">
                  <div className="flex justify-between text-sm">
                    <span className="text-gray-600">Spent: {formatCurrency(budget.spentAmount)}</span>
                    <span className="text-gray-600">Remaining: {formatCurrency(budget.remainingAmount)}</span>
                  </div>
                  <div className="w-full bg-gray-200 rounded-full h-2">
                    <div
                      className={`h-2 rounded-full ${getProgressBarColor(budget.percentageUsed)}`}
                      style={{ width: `${Math.min(budget.percentageUsed, 100)}%` }}
                    ></div>
                  </div>
                  <div className="flex justify-between text-sm">
                    <span className="text-gray-500">0%</span>
                    <span className="font-medium" style={{ color: budget.categoryColor }}>
                      {budget.percentageUsed.toFixed(1)}%
                    </span>
                    <span className="text-gray-500">100%</span>
                  </div>
                </div>

                {/* Status Message */}
                {budget.percentageUsed >= 100 && (
                  <p className="text-red-600 text-sm font-medium mt-3">
                    ⚠️ Budget exceeded! You've spent {formatCurrency(budget.spentAmount - budget.amount)} over your budget.
                  </p>
                )}
                {budget.percentageUsed >= 85 && budget.percentageUsed < 100 && (
                  <p className="text-yellow-600 text-sm font-medium mt-3">
                    ⚠️ Approaching budget limit. You have {formatCurrency(budget.remainingAmount)} remaining.
                  </p>
                )}
                {budget.percentageUsed <= 60 && (
                  <p className="text-green-600 text-sm font-medium mt-3">
                    ✅ On track! You have {formatCurrency(budget.remainingAmount)} remaining.
                  </p>
                )}
              </div>
            ))}
          </div>
        )}
      </div>

      {/* Summary Card */}
      {budgets.length > 0 && (
        <div className="bg-white rounded-xl shadow-sm border border-gray-200 p-6">
          <h4 className="text-lg font-semibold text-gray-900 mb-4">Budget Summary</h4>
          <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
            <div className="text-center p-4 bg-blue-50 rounded-lg">
              <p className="text-sm text-blue-600 font-medium">Total Budget</p>
              <p className="text-2xl font-bold text-blue-700">
                {formatCurrency(budgets.reduce((sum, budget) => sum + budget.amount, 0))}
              </p>
            </div>
            <div className="text-center p-4 bg-green-50 rounded-lg">
              <p className="text-sm text-green-600 font-medium">Total Spent</p>
              <p className="text-2xl font-bold text-green-700">
                {formatCurrency(budgets.reduce((sum, budget) => sum + budget.spentAmount, 0))}
              </p>
            </div>
            <div className="text-center p-4 bg-purple-50 rounded-lg">
              <p className="text-sm text-purple-600 font-medium">Remaining</p>
              <p className="text-2xl font-bold text-purple-700">
                {formatCurrency(budgets.reduce((sum, budget) => sum + budget.remainingAmount, 0))}
              </p>
            </div>
          </div>
        </div>
      )}

      {/* Create Budget Modal */}
      {isModalOpen && (
        <div className="fixed inset-0 bg-black bg-opacity-50 flex items-center justify-center p-4 z-50">
          <div className="bg-white rounded-xl shadow-lg max-w-md w-full">
            <div className="p-6 border-b border-gray-200">
              <h3 className="text-lg font-semibold text-gray-900">Create New Budget</h3>
            </div>

            <form onSubmit={handleSubmit} className="p-6 space-y-4">
              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Category *
                </label>
                <select
                  value={formData.categoryId}
                  onChange={(e) => setFormData({ ...formData, categoryId: parseInt(e.target.value) })}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                  required
                >
                  <option value={0}>Select a category</option>
                  {getAvailableCategories().map((category) => (
                    <option key={category.id} value={category.id}>
                      {category.name}
                    </option>
                  ))}
                </select>
              </div>

              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Monthly Budget Amount *
                </label>
                <input
                  type="number"
                  step="0.01"
                  min="0.01"
                  value={formData.amount || ''}
                  onChange={(e) => setFormData({ ...formData, amount: parseFloat(e.target.value) || 0 })}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                  placeholder="0.00"
                  required
                />
              </div>

              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Month *
                </label>
                <input
                  type="month"
                  value={formData.month.substring(0, 7)}
                  onChange={(e) => setFormData({ ...formData, month: e.target.value + '-01' })}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                  required
                />
              </div>

              <div className="flex space-x-3 pt-4">
                <button
                  type="button"
                  onClick={closeModal}
                  className="flex-1 px-4 py-2 border border-gray-300 text-gray-700 rounded-lg hover:bg-gray-50 transition-colors"
                >
                  Cancel
                </button>
                <button
                  type="submit"
                  disabled={isSubmitting || formData.categoryId === 0 || formData.amount <= 0}
                  className="flex-1 bg-primary-500 text-white px-4 py-2 rounded-lg hover:bg-primary-600 transition-colors disabled:opacity-50"
                >
                  {isSubmitting ? <LoadingSpinner size="sm" /> : 'Create Budget'}
                </button>
              </div>
            </form>
          </div>
        </div>
      )}
    </div>
  );
};

export default Budgets;