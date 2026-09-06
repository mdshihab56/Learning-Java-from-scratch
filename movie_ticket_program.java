
import java.util.Scanner;

public class movie_ticket_program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        boolean isStudent;
        double price;

        System.out.println("==============================");
        System.out.println("     MOVIE TICKET SYSTEM");
        System.out.println("==============================");

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        // Ternary operator
        // (condition) ? true : false

        price = (age < 13) ? 5.00 : 10.00;

        // Apply student discount
        price = isStudent ? price * 0.80 : price;

        System.out.println();
        System.out.println("--------- Ticket Details ---------");

        System.out.println("Age: " + age);
        System.out.println("Student: " + isStudent);

        System.out.printf("Ticket Price: $%.2f%n", price);

        System.out.println("==================================");

        scanner.close();
    }
}
