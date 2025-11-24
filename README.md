# TRANSACTION-MANAGER-JAVAPROJECT-24BCE10497
Simple transaction manager in java, which manages the overall in and out of the money.

**[PROJECT TITLE] - Simple Personal Finance Tracker**

🌟 Overview of the Project

This is a lightweight, console-based application designed to help users track their personal finances, specifically logging income and expenses. Built entirely in Java, the application provides core functionality for financial management, including real-time balance calculation and persistent data storage.

It serves as an excellent demonstration of object-oriented principles, data persistence using file I/O (Serialization), and standard Java utilities for date and console management.

**✨ Features**

The application provides the following functional modules and capabilities:
Log New Income: Record a positive transaction amount with a category and description.
Log New Expense: Record a negative transaction amount with a category and description.
View All Transactions: Display a detailed, sequential list of all recorded income and expense items.
Display Financial Summary: Calculates and shows the Total Income, Total Expenses, and the Net Balance in real-time.
Remove Transaction: Allows the user to permanently delete a transaction record by its unique system ID.
Data Persistence: All transactions are automatically saved to the transactions.ser file upon modification and are loaded automatically upon application start.

**🛠️ Technologies/Tools Used**
Language: Java (JDK 8 or higher)

Core Concepts:
Object-Oriented Programming (OOP)
Data Serialization (java.io.Serializable) for persistence.
Date and Time API (java.time.LocalDate)
Standard Console I/O (java.util.Scanner)

**🚀 Setup & Running the Project
Prerequisites**

Ensure you have the following installed:
Java Development Kit (JDK): Version 8 or newer.
A Java Compiler (usually included with the JDK).
Installation & Execution
Clone the Repository:
git clone [YOUR_REPOSITORY_URL]
cd [PROJECT_TITLE_DIRECTORY]

Compile the Java Files:
Navigate to the directory containing all the .java files (ExpenseTrackerApp.java, TransactionManager.java, Transaction.java, TransactionType.java) and compile them:

javac *.java


Run the Application:
Execute the main class:

java ExpenseTrackerApp

The console menu will appear, prompting you for action.

**🧪 Instructions for Testing**

Follow these steps to verify the core functionality and data persistence:

Test 1: Core Functionality & Summary

Run the application.

Select option 1. Log New Income (e.g., 5000.00, Salary, Monthly Pay).

Select option 2. Log New Expense (e.g., 150.00, Food, Dinner).

Select option 3. Show All Recorded Transactions and verify both entries are present.

Select option 4. Check Account Balance & Summary and confirm the Net Balance is calculated correctly (5000.00 - 150.00 = 4850.00).

Test 2: Data Persistence

Select option 6. Exit Application.

Immediately run the application again: java ExpenseTrackerApp.

Select option 3. Show All Recorded Transactions and confirm the previously entered Income and Expense records are still loaded and displayed.

Test 3: Deletion

Identify the ID of a transaction (e.g., ID 2 for the Dinner expense).

Select option 5. Remove a Transaction (by ID) and enter the ID.

Select option 3. Show All Recorded Transactions to confirm the transaction is gone.

Select option 4. Check Account Balance & Summary and confirm the net balance has been updated to reflect the deletion.

**Screenshots**
