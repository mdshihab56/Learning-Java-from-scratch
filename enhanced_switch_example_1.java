
import java.util.Scanner;

public class enhanced_switch_example_1 {
    public static void main(String[] args) {

        // Enhanced switch = a cleaner replacement for many else-if statements
        // Java 14 feature

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("       FOOD ORDER SYSTEM");
        System.out.println("==============================");

        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Fried Chicken");
        System.out.println("4. Pasta");
        System.out.println("5. Sandwich");

        System.out.print("Choose your food: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("You selected Burger - $5.00");
            case 2 -> System.out.println("You selected Pizza - $8.00");
            case 3 -> System.out.println("You selected Fried Chicken - $6.00");
            case 4 -> System.out.println("You selected Pasta - $7.00");
            case 5 -> System.out.println("You selected Sandwich - $4.00");
            default -> System.out.println("Invalid food selection!");
        }

        scanner.close();
    }
}

