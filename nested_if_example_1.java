
public class nested_if_example_1 {
    public static void main(String[] args) {

        int age = 25;
        boolean isMember = true;

        if (age >= 18) {

            if (isMember) {
                System.out.println("You are eligible for the discount.");
                System.out.println("You get a 20% member discount.");
            }
            else {
                System.out.println("You are eligible to enter.");
                System.out.println("But you are not a member.");
            }

        }
        else {
            System.out.println("You are under 18.");
            System.out.println("You are not eligible.");
        }
    }
}
