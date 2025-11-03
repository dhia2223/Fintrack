import { z } from 'zod';

export const transactionSchema = z.object({
  accountId: z.number().min(1, 'Account is required'),
  categoryId: z.number().optional(),
  amount: z.number().min(0.01, 'Amount must be greater than 0'),
  description: z.string().min(1, 'Description is required').max(500, 'Description too long'),
  type: z.enum(['INCOME', 'EXPENSE'] as const),
  transactionDate: z.string().min(1, 'Date is required'),
});

export type TransactionFormData = z.infer<typeof transactionSchema>;