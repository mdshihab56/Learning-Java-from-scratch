import java.util.Scanner;
public class enhanced_switch {
    public static void main(String[] args) {
        
        //enhanced switch= a replacement to many elfe if statement
        // java14 feature

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String day= scanner.nextLine();

        
        switch(day){
            case "Monday" -> System.out.println("It is a weekday ");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend ");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day");
        }



        scanner.close();

    }
    
}
