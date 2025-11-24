package javaproj;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TransactionManager {
    private List<Transaction> transactions;
    private static final String DATA_FILE = "transactions.ser";

    public TransactionManager() {
        this.transactions = loadTransactions().orElseGet(ArrayList::new);
        
        updateIdCounterAfterLoad();
    }

    private void updateIdCounterAfterLoad() {
        int maxId = transactions.stream()
                .mapToInt(Transaction::getId)
                .max()
                .orElse(0); 
        Transaction.updateIdCounter(maxId);
    }

    public void addTransaction(TransactionType type, double amount, String category,
                                 String description, LocalDate date) {
        Transaction newTransaction = new Transaction(type, amount, category, description, date);
        transactions.add(newTransaction);
        System.out.println("-> Success! Added ID: " + newTransaction.getId());
        saveTransactions();
    }

    public boolean deleteTransaction(int id) {
        boolean removed = transactions.removeIf(t -> t.getId() == id);
        if (removed) {
            saveTransactions();
            System.out.println("-> Success! Transaction ID " + id + " has been deleted.");
        } else {
            System.out.println("-> Error: Could not find transaction with ID " + id + ".");
        }
        return removed;
    }

    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions); 
    }
    
    public void displaySummary() {
        double totalIncome = 0;
        double totalExpense = 0;

        for (Transaction t : transactions) {
            if (t.getType() == TransactionType.INCOME) {
                totalIncome += t.getAmount();
            } else {
                totalExpense += t.getAmount();
            }
        }
        
        double netBalance = totalIncome - totalExpense;

        System.out.println("\n===== 🏦 Current Financial Summary =====");
        System.out.printf("   Total Income:  ₹%,.2f\n", totalIncome);
        System.out.printf("   Total Expenses: ₹%,.2f\n", totalExpense);
        System.out.println(" ---------------------------------------");
        System.out.printf("   Net Balance:   ₹%,.2f\n", netBalance);
        System.out.println("=========================================");
    }

    void saveTransactions() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(transactions);
        } catch (IOException e) {
            System.err.println("FATAL ERROR: Could not save data! " + e.getMessage());
        }
    }

    private Optional<List<Transaction>> loadTransactions() {
        File file = new File(DATA_FILE);
        if (!file.exists()) {
            return Optional.empty();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            @SuppressWarnings("unchecked") 
            List<Transaction> loadedList = (List<Transaction>) ois.readObject();
            System.out.println("Welcome back! Loaded " + loadedList.size() + " transactions from " + DATA_FILE);
            return Optional.of(loadedList);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Warning: Failed to load previous data. Starting fresh. Error: " + e.getMessage());
            return Optional.empty();
        }
    }
}