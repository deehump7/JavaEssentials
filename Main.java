import java.util.ArrayList;
import java.util.List;

class Person {
    private final String name;
    private final int age;
    private final String address;
    private final List<String> purchasedBooks;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.purchasedBooks = new ArrayList<>();
    }

    public final String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getPurchasedBooks() {
        return purchasedBooks;
    }

    public void purchaseBook(String bookTitle) {
        purchasedBooks.add(bookTitle);
        System.out.println(name + " purchased the book: " + bookTitle);
    }

    public void displayPurchasedBooks() {
        System.out.println("Books purchased by " + name + ": " + purchasedBooks);
    }

    // Other methods for interacting with the bookstore can be added here
}

class Bookstore {
    private final String name;
    private final List<String> availableBooks;
    private double revenue;

    public Bookstore(String name, List<String> availableBooks) {
        this.name = name;
        this.availableBooks = availableBooks;
        this.revenue = 0.0;
    }

    public void displayAvailableBooks() {
        System.out.println("Available books at " + name + ": " + availableBooks);
    }

    public void sellBook(String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            revenue += 10.0; // Assuming a fixed price of $10 per book
            System.out.println("Book sold: " + bookTitle);
        } else {
            System.out.println("Book not available: " + bookTitle);
        }
    }

    public double getRevenue() {
        return revenue;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a bookstore
        List<String> availableBooks = new ArrayList<>();
        availableBooks.add("Book 1");
        availableBooks.add("Book 2");
        availableBooks.add("Book 3");
        Bookstore bookstore = new Bookstore("My Bookstore", availableBooks);

        // Create a customer
        Person customer = new Person("John Doe", 30, "123 Main St");

        //Display customer information
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer age: " + customer.getAge());
        System.out.println("Customer address: " + customer.getAddress());
        System.out.println("Hello, " + customer.getName() + " you purchased: " + customer.getPurchasedBooks() + " books.");


        // Display available books
        bookstore.displayAvailableBooks();

        // Customer purchases a book
        customer.purchaseBook("Book 1");
        bookstore.sellBook("Book 1");

        // Display purchased books for the customer
        customer.displayPurchasedBooks();

        System.out.println("Bookstore revenue: $" + bookstore.getRevenue());

    }
}
