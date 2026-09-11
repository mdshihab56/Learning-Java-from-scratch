
import java.util.Scanner;

public class enhanced_switch_example_3 {
    public static void main(String[] args) {

        // Enhanced switch = cleaner alternative to many else-if statements
        // Java 14 feature

        Scanner scanner = new Scanner(System.in);

        double balance = 15000.00;

        System.out.println("==============================");
        System.out.println("          ATM SYSTEM");
        System.out.println("==============================");

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1 -> System.out.printf(
                    "Your current balance is: Tk %.2f%n", balance);

            case 2 -> {
                System.out.print("Enter deposit amount: ");
                double deposit = scanner.nextDouble();

                balance += deposit;

                System.out.printf(
                        "Tk %.2f deposited successfully.%n", deposit);
                System.out.printf(
                        "New balance: Tk %.2f%n", balance);
            }

            case 3 -> {
                System.out.print("Enter withdrawal amount: ");
                double withdraw = scanner.nextDouble();

                if (withdraw <= balance) {
                    balance -= withdraw;

                    System.out.printf(
                            "Tk %.2f withdrawn successfully.%n", withdraw);
                    System.out.printf(
                            "Remaining balance: Tk %.2f%n", balance);
                }
                else {
                    System.out.println("Insufficient balance!");
                }
            }

            case 4 -> System.out.println(
                    "Thank you for using the ATM!");

            default -> System.out.println(
                    "Invalid option! Please choose 1-4.");
        }

        scanner.close();
    }
}
