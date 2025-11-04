# FinTrack – Personal Finance Platform (Spring Boot + React)

Take control of your finances with smart tracking, budgeting and insights — all in one place.

FinTrack is a modern, full-stack personal finance platform designed to help users manage their money with clarity and control. It provides a clean and intuitive interface for tracking expenses, income, accounts, categories, and financial activity — supported by a robust Spring Boot backend and a responsive React + Tailwind UI.

---

## 🚀 Features

### ✅ Core Functionality
- **Expense & Income Tracking** – Log transactions with categories, accounts, dates, and notes  
- **Multi-Account Support** – Manage balances across different wallets, cards or bank accounts  
- **Category Management** – Organize spending with custom categories  
- **Smart Filtering & Sorting** – Quickly find transactions using custom filters  
- **Real-Time Balance Sync** – Account balances update automatically with each transaction  
- **Responsive & Intuitive UI** – Built with Tailwind and optimized for a clean user experience  

### 🔐 Authentication & Security
- Secure **JWT-based authentication** (register, login, protected routes)
- Role-based authorization (future-ready)

### 🧩 Tech Highlights
- Form validation with **React Hook Form + Zod**
- Modular and scalable **service-based architecture**
- Reusable UI components and clean routing structure
- RESTful backend with DTOs, service layer, and exception handling

---

## 🛠️ Tech Stack

### **Frontend**
| Technology | Purpose |
|------------|----------|
| React + TypeScript | Component-based UI |
| Vite | Fast dev & build tooling |
| Tailwind CSS v4 | Modern utility-first styling |
| React Router | Frontend routing |
| React Hook Form + Zod | Form handling & validation |
| Axios | API communication |

### **Backend**
| Technology | Purpose |
|------------|----------|
| Spring Boot 3 | REST API backend |
| Java | Language |
| Spring Security + JWT | Authentication & Authorization |
| Spring Data JPA | Database persistence |
| PostgreSQL | Main database |
| Swagger/OpenAPI | API documentation (if enabled in project) |

### **Infrastructure**
| Tool | Purpose |
|------|----------|
| Docker & Docker Compose | Containerized development environment |
| pgAdmin (optional) | DB management UI |

---

## 📂 Monorepo Structure

fintrack/
│
├─ backend/ # Spring Boot API
│ ├─ src/
│ ├─ Dockerfile
│ └─ pom.xml
│
├─ frontend/ # React + Vite + Tailwind
│ ├─ src/
│ ├─ Dockerfile
│ └─ package.json
│
├─ docker-compose.yml # Local full-stack environment
└─ README.md

yaml
Copy code

---

## 🧱 Architecture Overview

FinTrack follows a clean, maintainable monorepo architecture:

[ React + Tailwind ] → [ Spring Boot REST API ] → [ PostgreSQL DB ]
│ │ │
└── Docker/Compose orchestrates full-stack environment ───┘

yaml
Copy code

- **Frontend** communicates with the backend via secure REST endpoints  
- **Backend** handles business logic, validation, JWT auth & DB operations  
- **PostgreSQL** stores accounts, categories, and transactions  

---

## ⚙️ Getting Started (Local Development)

### ✅ Prerequisites
Make sure you have installed:
- Node.js (LTS)
- Java 17+ or 21
- Docker & Docker Compose

---

### 🧑‍💻 Run with Docker (Recommended)

```bash
docker compose up --build
This will start:

Backend at http://localhost:8080

Frontend at http://localhost:3000

PostgreSQL DB

🖥️ Run Frontend Manually
bash
Copy code
cd frontend
npm install
npm run dev
🧵 Run Backend Manually
bash
Copy code
cd backend
./mvnw spring-boot:run
🧭 Roadmap
Planned improvements to evolve FinTrack into a more powerful finance assistant:

📊 Advanced analytics & dashboards

💡 Budgeting goals and monthly spending insights

🔔 Smart alerts & notifications

🌍 Multi-currency support

🤖 (Optional) AI-powered financial recommendations

☁️ Deployment to cloud (Render / Railway / AWS)

🤝 Contributing
Contributions are welcome!
Feel free to fork this repo and submit a pull request.

📜 License
This project is licensed under the MIT License.