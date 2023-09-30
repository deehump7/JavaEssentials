import java.util.Scanner;
public class Quix {

    private static final int NUM_ITEMS = 15;
    private static final int NUM_ORDERS = 20;
    private static final String[] MENU = {
            "Appetizers:",
            "1. Mozzarella Sticks ($6)",
            "2. Blooming Onion ($5)",
            "3. Calamari ($7)",
            "4. Shrimp Cocktail ($8)",
            "5. Queso Dip ($9)",
            "Entrees:",
            "6. Burger ($10)",
            "7. Chicken Sandwich ($11)",
            "8. Steak ($12)",
            "9. Fish and Chips ($13)",
            "10. Shrimp Pasta ($14)",
            "Desserts:",
            "11. Chocolate Cake ($15)",
            "12. Ice Cream ($16)",
            "13. Cheesecake ($17)",
            "14. Apple Pie ($18)",
            "15. Tiramisu ($19)"
    };
    private static int[] orders = new int[NUM_ITEMS];

    public static void main(String[] args) {
        System.out.println("Welcome to Quix Restaurant! Have a look at our menu, it's our pleasure to serve you.");

        Scanner scanner = new Scanner(System.in);

        // Take orders
        for (int i = 0; i < NUM_ORDERS; i++) {
            System.out.println("Customer " + (i + 1) + ", What would you like to order?");
            displayMenu();

            int itemNumber = scanner.nextInt();

            // Validate the item number
            if (itemNumber < 1 || itemNumber > NUM_ITEMS) {
                System.out.println("Invalid item number. Please try again.");
                continue;
            }

            // Increment the order count for the item
            orders[itemNumber - 1]++;

            // Display the summary after all 20 orders have been taken
            if (i == NUM_ORDERS - 1) {
                displaySummary();
            }
        }
    }

    // Display the menu
    private static void displayMenu() {
        for (int i = 0; i < MENU.length; i++) {
            System.out.println(MENU[i]);
        }
    }

    private static double calculateTotalMoneyMade() {
        double totalMoneyMade = 0;
        for (int i = 0; i < NUM_ITEMS; i++) {
            totalMoneyMade += orders[i] * getUnitPrice(i);
        }
        return totalMoneyMade;
    }

    private static double calculatePercentageOfSales(int itemNumber) {
        return ((double) orders[itemNumber] / NUM_ORDERS) * 100;
    }

    private static double getUnitPrice(int itemNumber) {
        return itemNumber + 5;
    }

    private static void displaySummary() {
        System.out.println("Summary:");
        System.out.println("Total money made: $" + calculateTotalMoneyMade());
        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.println(MENU[i] + " - " + calculatePercentageOfSales(i) + "%");
        }
    }
}
