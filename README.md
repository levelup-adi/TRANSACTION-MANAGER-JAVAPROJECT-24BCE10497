<h1>[PROJECT TITLE] - Simple Personal Finance Tracker</h1>


<h1>🌟 Overview of the Project</h1>

This project made by **ADITYA RAJ SHARMA** **(24BCE10497)** for the VITYARTHI course.

This is a lightweight, console-based application designed to help users track their personal finances, specifically logging income and expenses. Built entirely in Java, the application provides core functionality for financial management, including real-time balance calculation and persistent data storage.

It serves as an excellent demonstration of object-oriented principles, data persistence using file I/O (Serialization), and standard Java utilities for date and console management.


<h1>📂 Project Structure</h1>

<img width="2816" height="1536" alt="Gemini_Generated_Image_ez0ek0ez0ek0ez0e" src="https://github.com/user-attachments/assets/48b3387b-68d2-48b1-a55f-8a87ff8402ea" />



<h1>✨ Features</h1>

The application provides the following functional modules and capabilities:

Log New Income: Record a positive transaction amount with a category and description.

Log New Expense: Record a negative transaction amount with a category and description.

View All Transactions: Display a detailed, sequential list of all recorded income and expense items.

Display Financial Summary: Calculates and shows the Total Income, Total Expenses, and the Net Balance in real-time.

Remove Transaction: Allows the user to permanently delete a transaction record by its unique system ID.

Data Persistence: All transactions are automatically saved to the transactions.ser file upon modification and are loaded automatically upon application start.

<h1>⚙️ Non-Functional Requirements</h1>

The application adheres to the following quality attributes:

Performance: The system is designed to be lightweight with minimal memory footprint (O(1) to O(n) operations). Transaction processing and balance calculations occur instantly without network latency, as all data is handled locally.

Security: Data is stored locally using Java Serialization (.ser), which provides a binary format that is not human-readable via standard text editors, offering basic obfuscation. File access is governed by the operating system's user permission protocols.

Usability: The interface utilizes a clear, menu-driven console structure. It employs ANSI color coding (Green for Income, Red for Expense) to enhance readability and provides immediate feedback for all user actions.

Reliability: The application features robust exception handling (e.g., catching NumberFormatException for invalid amounts) to prevent runtime crashes. Data persistence ensures that records are saved automatically after every addition or deletion, protecting against data loss.

<h1>🛠️ Technologies/Tools Used</h1>

Language: Java (JDK 8 or higher)

Core Concepts:

Object-Oriented Programming (OOP)

Data Serialization (java.io.Serializable) for persistence.

Date and Time API (java.time.LocalDate)

Standard Console I/O (java.util.Scanner)

<h1>🚀 Setup & Running the Project</h1>

Prerequisites

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

<h1>🧪 Instructions for Testing</h1>

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


<h1>**📸 Screenshots**</h1>

<img width="1013" height="721" alt="image" src="https://github.com/user-attachments/assets/4f9ce002-7745-41a0-acf3-c7297d281848" />
<br>

<img width="577" height="391" alt="image" src="https://github.com/user-attachments/assets/4d0312f0-2c14-429f-9e8b-b5b6ad2c621a" />
<br>

<img width="541" height="195" alt="image" src="https://github.com/user-attachments/assets/be4f3184-ed8f-4f28-ae84-f2fd144f4981" />
<br>


