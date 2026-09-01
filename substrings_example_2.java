
import java.util.Scanner;

public class substrings_example_2 {
    public static void main(String[] args) {

        // substring() = A method to extract a portion of a String
        // substring(start, end)
        // indexOf() = Returns the position of a character or String
        // contains() = Checks whether a String contains a specific character or text

        Scanner scanner = new Scanner(System.in);

        String fullName;
        String firstName;
        String middleName;
        String lastName;

        System.out.println("================================");
        System.out.println("       NAME INFORMATION");
        System.out.println("================================");

        System.out.print("Enter your full name: ");
        fullName = scanner.nextLine();

        // Check if the name contains a space
        if (fullName.contains(" ")) {

            // Find the position of the first space
            int firstSpace = fullName.indexOf(" ");

            // Extract the first name
            firstName = fullName.substring(0, firstSpace);

            // Remove the first name from the full name
            String remainingName = fullName.substring(firstSpace + 1);

            // Check if there is another space
            if (remainingName.contains(" ")) {

                // Find the position of the second space
                int secondSpace = remainingName.indexOf(" ");

                // Extract the middle name
                middleName = remainingName.substring(0, secondSpace);

                // Extract the last name
                lastName = remainingName.substring(secondSpace + 1);

                System.out.println();
                System.out.println("--------- Name Details ---------");
                System.out.println("Full Name   : " + fullName);
                System.out.println("First Name  : " + firstName);
                System.out.println("Middle Name : " + middleName);
                System.out.println("Last Name   : " + lastName);

            }
            else {

                // If there is only one space,
                // the name contains only first and last name

                lastName = remainingName;

                System.out.println();
                System.out.println("--------- Name Details ---------");
                System.out.println("Full Name  : " + fullName);
                System.out.println("First Name : " + firstName);
                System.out.println("Last Name  : " + lastName);
                System.out.println("Middle Name: Not provided");
            }

        }
        else {

            System.out.println();
            System.out.println("Invalid name format.");
            System.out.println("Please enter at least a first name and last name.");
        }

        System.out.println();
        System.out.println("================================");

        scanner.close();
    }
}
