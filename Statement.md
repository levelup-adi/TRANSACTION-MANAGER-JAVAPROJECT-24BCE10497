Project Statement - Simple Personal Finance Tracker

1. Problem Statement

Managing personal finances manually using physical notebooks or spreadsheets is often tedious, error-prone, and lacks immediate insight into spending habits. Individuals frequently struggle to keep an accurate running total of their net balance or lose track of specific expenditures over time. There is a need for a simple, automated tool that eliminates the manual arithmetic of budgeting and provides a reliable, persistent record of financial activity without requiring complex accounting knowledge or internet connectivity.

2. Scope of the Project

The scope of this project is defined by the following boundaries:

In-Scope

Transaction Management: The system will allow users to create, read, and delete financial records.

Categorization: Transactions will be classified as either "Income" or "Expense" and tagged with specific categories (e.g., Food, Salary, Rent).

Automated Calculation: The system will automatically calculate total income, total expenses, and the resulting net balance in real-time.

Data Persistence: All records will be saved to a local file, ensuring data survives application restarts.

Console Interface: The interaction will occur via a text-based menu system.

Out-of-Scope

Multi-User Support: The system is designed for a single user; no login/authentication is provided.

External Integration: The system will not connect to bank APIs or cloud storage.

Visualizations: No graphical charts or dashboards will be generated (text-based reporting only).

Multi-Currency: The system assumes a single currency for all transactions.

3. Target Users

Students: Who need to manage monthly allowances and track discretionary spending.

Freelancers: Who need a quick way to log sporadic income payments and deductible business expenses.

Budget-Conscious Individuals: Anyone looking for a lightweight, offline alternative to complex budgeting apps to maintain simple financial discipline.

4. High-Level Features

Transaction Logging: Simple interface to input amount, category, and description for both income and expenses.

Financial Dashboard: Immediate view of the current financial health (Total Income vs. Total Expenses).

History Review: A sequential list of all past transactions to review spending patterns.

Data Persistence: Automatic saving and loading of transaction data using Java Serialization.

Record Management: Ability to remove incorrect or obsolete transactions by ID.
