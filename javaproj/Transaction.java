package javaproj;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private static int idCounter = 1; 

    private final int id;
    private final TransactionType type;
    private final double amount;
    private final String category;
    private final String description;
    private final LocalDate date;

    public Transaction(TransactionType type, double amount, String category,
                       String description, LocalDate date) {
        this.id = idCounter++; 
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    public int getId() { return id; }
    public TransactionType getType() { return type; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }
    
    public static void updateIdCounter(int maxId) {
        if (maxId >= idCounter) {
            idCounter = maxId + 1;
        }
    }

    @Override
    public String toString() {
        return String.format(" [ID %d] %s: ₹%.2f | Category: %s | Date: %s | Note: %s",
            id, 
            type.toString().toUpperCase(), 
            amount, 
            category, 
            date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), 
            description.length() > 30 ? description.substring(0, 30) + "..." : description);
    }
}