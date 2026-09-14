
import java.util.Scanner;

public class traffic_light {
    public static void main(String[] args) {

        // Enhanced switch = cleaner alternative to many else-if statements
        // Java 14 feature

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("      TRAFFIC LIGHT SYSTEM");
        System.out.println("==============================");

        System.out.println("1. Red");
        System.out.println("2. Yellow");
        System.out.println("3. Green");

        System.out.print("Enter traffic light: ");
        int light = scanner.nextInt();

        switch (light) {

            case 1 -> {
                System.out.println("Traffic Light: RED");
                System.out.println("Action: STOP!");
                System.out.println("Please wait until the light changes.");
            }

            case 2 -> {
                System.out.println("Traffic Light: YELLOW");
                System.out.println("Action: GET READY!");
                System.out.println("Slow down and prepare to stop.");
            }

            case 3 -> {
                System.out.println("Traffic Light: GREEN");
                System.out.println("Action: GO!");
                System.out.println("Proceed carefully.");
            }

            default -> {
                System.out.println("Invalid traffic light!");
                System.out.println("Please enter 1, 2, or 3.");
            }
        }

        System.out.println("==============================");

        scanner.close();
    }
}
