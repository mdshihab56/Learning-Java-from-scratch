
import java.util.Scanner;

public class enhanced_switch_example_2 {
    public static void main(String[] args) {

        // Enhanced switch = cleaner alternative to many else-if statements
        // Java 14 feature

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("       WEATHER CHECKER");
        System.out.println("==============================");

        System.out.println("1. Sunny");
        System.out.println("2. Rainy");
        System.out.println("3. Cloudy");
        System.out.println("4. Stormy");
        System.out.println("5. Snowy");

        System.out.print("Enter weather choice: ");
        int weather = scanner.nextInt();

        switch (weather) {
            case 1 -> System.out.println("It is sunny. Perfect day for a walk!");
            case 2 -> System.out.println("It is rainy. Don't forget your umbrella!");
            case 3 -> System.out.println("It is cloudy. The sky is covered with clouds.");
            case 4 -> System.out.println("It is stormy. Stay indoors and be safe!");
            case 5 -> System.out.println("It is snowy. Wear warm clothes!");
            default -> System.out.println("Invalid weather choice!");
        }

        scanner.close();
    }
}
