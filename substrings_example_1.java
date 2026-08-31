
import java.util.Scanner;

public class substrings_example_1 {
    public static void main(String[] args) {

        // substring() = A method to extract a portion of a string

        Scanner scanner = new Scanner(System.in);

        String url;
        String website;
        String page;

        System.out.println("Enter a URL: ");

        url = scanner.nextLine();

        if (url.contains("/")) {

            website = url.substring(0, url.indexOf("/"));
            page = url.substring(url.indexOf("/") + 1);

            System.out.println("Website: " + website);
            System.out.println("Page: " + page);

        }
        else {
            System.out.println("URL must contain /");
        }

        scanner.close();
    }
}

