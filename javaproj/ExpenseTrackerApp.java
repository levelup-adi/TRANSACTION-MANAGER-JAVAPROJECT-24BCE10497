package javaproj;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ExpenseTrackerApp {
    private final TransactionManager manager;
    private final Scanner consoleInput;

    public ExpenseTrackerApp() {
        this.manager = new TransactionManager();
        this.consoleInput = new Scanner(System.in);
    }

    private void printMenu() {
        System.out.println("\n-------------------------------------------");
        System.out.println("       Personal Finance Tracker");
        System.out.println("-------------------------------------------");
        System.out.println("1. Log New Income");
        System.out.println("2. Log New Expense");
        System.out.println("3. Show All Recorded Transactions");
        System.out.println("4. Check Account Balance & Summary");
        System.out.println("5. Remove a Transaction (by ID)");
        System.out.println("6. Exit Application (Data is auto-saved)");
        System.out.println("-------------------------------------------");
        System.out.print("What would you like to do? (1-6): ");
    }

    public void run() {
        int choice;
        do {
            printMenu();
            String input = consoleInput.nextLine();
            
            try {
                choice = Integer.parseInt(input.trim());
                
                switch (choice) {
                    case 1:
                        logTransaction(TransactionType.INCOME);
                        break;
                    case 2:
                        logTransaction(TransactionType.EXPENSE);
                        break;
                    case 3:
                        displayTransactions();
                        break;
                    case 4:
                        manager.displaySummary();
                        break;
                    case 5:
                        deleteTransaction();
                        break;
                    case 6:
                        System.out.println("\nThanks for managing your finances! See you soon.");
                        manager.saveTransactions(); 
                        break;
                    default:
                        System.out.println("❌ Oops, that choice isn't on the menu. Try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number for your choice (1-6).");
                choice = 0; 
            }
        } while (choice != 6);
    }

    private void logTransaction(TransactionType type) {
        System.out.println("\n--- Entering New " + type + " Record ---");
        try {
            System.out.print("Enter Amount (e.g., 125.75): ₹");
            double amount = Double.parseDouble(consoleInput.nextLine());
            
            if (amount <= 0) {
                System.out.println("Amount must be greater than zero. Transaction cancelled.");
                return;
            }

            System.out.print("Enter Category (e.g., Food, Rent, Salary): ");
            String category = consoleInput.nextLine().trim();

            System.out.print("Add a brief Description/Note: ");
            String description = consoleInput.nextLine().trim();

            manager.addTransaction(type, amount, category, description, LocalDate.now());
            
        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid input for Amount. Please enter a numerical value.");
        }
    }

    private void displayTransactions() {
        List<Transaction> transactions = manager.getAllTransactions();
        if (transactions.isEmpty()) {
            System.out.println("\n-- No records found. Start by logging an Income or Expense! --");
            return;
        }

        System.out.println("\n--- All Transactions (" + transactions.size() + " total) ---");
        transactions.forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
    }

    private void deleteTransaction() {
        System.out.print("\nEnter the ID of the transaction to delete: ");
        try {
            int id = Integer.parseInt(consoleInput.nextLine());
            manager.deleteTransaction(id);
        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid ID format. Please enter the number ID (e.g., 5).");
        }
    }

    public static void main(String[] args) {
        ExpenseTrackerApp app = new ExpenseTrackerApp();
        app.run();
    }
}