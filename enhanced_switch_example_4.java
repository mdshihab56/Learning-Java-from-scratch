
import java.util.Scanner;

public class bank_account {
    public static void main(String[] args) {

        // Enhanced switch = cleaner alternative to many else-if statements
        // Java 14 feature

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("       BANK ACCOUNT SYSTEM");
        System.out.println("==============================");

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Student Account");
        System.out.println("4. Business Account");

        System.out.print("Choose account type: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1 -> {
                System.out.println("Account Type: Savings Account");
                System.out.println("Interest Rate: 5%");
                System.out.println("Minimum Balance: Tk 1,000");
            }

            case 2 -> {
                System.out.println("Account Type: Current Account");
                System.out.println("Interest Rate: 0%");
                System.out.println("Minimum Balance: Tk 5,000");
            }

            case 3 -> {
                System.out.println("Account Type: Student Account");
                System.out.println("Interest Rate: 4%");
                System.out.println("Minimum Balance: Tk 500");
            }

            case 4 -> {
                System.out.println("Account Type: Business Account");
                System.out.println("Interest Rate: 3%");
                System.out.println("Minimum Balance: Tk 10,000");
            }

            default -> {
                System.out.println("Invalid account type!");
                System.out.println("Please choose between 1 and 4.");
            }
        }

        System.out.println("==============================");

        scanner.close();
    }
}
