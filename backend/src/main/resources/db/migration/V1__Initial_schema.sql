-- Users table
CREATE TABLE users (
                       id BIGSERIAL PRIMARY KEY,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       password_hash VARCHAR(255) NOT NULL,
                       first_name VARCHAR(100) NOT NULL,
                       last_name VARCHAR(100) NOT NULL,
                       enabled BOOLEAN NOT NULL DEFAULT TRUE,
                       created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- Categories table - user_id can be NULL for system categories
CREATE TABLE categories (
                            id BIGSERIAL PRIMARY KEY,
                            user_id BIGINT,
                            name VARCHAR(100) NOT NULL,
                            description TEXT,
                            color VARCHAR(7) DEFAULT '#3B82F6',
                            is_system BOOLEAN DEFAULT FALSE,
                            created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                            updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                            FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                            CONSTRAINT unique_category_name_per_user UNIQUE (user_id, name)
);

-- Accounts table (bank accounts, cash, credit cards)
CREATE TABLE accounts (
                          id BIGSERIAL PRIMARY KEY,
                          user_id BIGINT NOT NULL,
                          name VARCHAR(100) NOT NULL,
                          type VARCHAR(50) NOT NULL CHECK (type IN ('CHECKING', 'SAVINGS', 'CREDIT_CARD', 'CASH', 'INVESTMENT')),
                          balance DECIMAL(15,2) NOT NULL DEFAULT 0.00,
                          currency VARCHAR(3) DEFAULT 'USD',
                          is_active BOOLEAN DEFAULT TRUE,
                          created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                          FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

-- Transactions table
CREATE TABLE transactions (
                              id BIGSERIAL PRIMARY KEY,
                              user_id BIGINT NOT NULL,
                              account_id BIGINT NOT NULL,
                              category_id BIGINT,
                              amount DECIMAL(15,2) NOT NULL,
                              type VARCHAR(20) NOT NULL CHECK (type IN ('INCOME', 'EXPENSE')),
                              description VARCHAR(500) NOT NULL,
                              transaction_date DATE NOT NULL,
                              created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                              updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                              FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                              FOREIGN KEY (account_id) REFERENCES accounts(id) ON DELETE CASCADE,
                              FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE SET NULL
);

-- Budgets table
CREATE TABLE budgets (
                         id BIGSERIAL PRIMARY KEY,
                         user_id BIGINT NOT NULL,
                         category_id BIGINT NOT NULL,
                         amount DECIMAL(15,2) NOT NULL,
                         month DATE NOT NULL,
                         created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                         FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                         FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE CASCADE,
                         UNIQUE(user_id, category_id, month)
);

-- Indexes for performance
CREATE INDEX idx_transactions_user_date ON transactions(user_id, transaction_date);
CREATE INDEX idx_transactions_account ON transactions(account_id);
CREATE INDEX idx_transactions_category ON transactions(category_id);
CREATE INDEX idx_categories_user ON categories(user_id);
CREATE INDEX idx_accounts_user ON accounts(user_id);
CREATE INDEX idx_budgets_user_month ON budgets(user_id, month);

-- Insert system categories (user_id is NULL for system categories)
INSERT INTO categories (user_id, name, description, color, is_system) VALUES
                                                                          (NULL, 'Food & Dining', 'Groceries, restaurants, food delivery', '#3B82F6', true),
                                                                          (NULL, 'Transportation', 'Gas, public transport, rideshare', '#8B5CF6', true),
                                                                          (NULL, 'Entertainment', 'Movies, concerts, hobbies', '#EC4899', true),
                                                                          (NULL, 'Utilities', 'Electricity, water, internet, phone', '#06B6D4', true),
                                                                          (NULL, 'Healthcare', 'Medical expenses, insurance', '#10B981', true),
                                                                          (NULL, 'Shopping', 'Clothing, electronics, household items', '#F59E0B', true),
                                                                          (NULL, 'Income', 'Salary, bonuses, investments', '#10B981', true),
                                                                          (NULL, 'Other', 'Miscellaneous expenses', '#6B7280', true);