import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        
    //takes input from console
    Scanner scanner = new Scanner(System.in);


    //takes string as input from console and show output
    System.out.print("Enter your name: ");
    String name= scanner.nextLine();


    //takes integer as input from console and show output
    System.out.print("Enter your age: ");
    int age=scanner.nextInt();


    //takes double  as input from console and show output
    System.out.print("What is your GPA: ");
    double gpa=scanner.nextDouble();

    //takes boolean as input from the console and show output
    System.out.println("Are you a student? (true/false:):  ");
    boolean isStudent=scanner.nextBoolean();


   
    //Concatanates string + values  from input
    System.out.println("Hellow "+name);
    System.out.println("You are "+age+" years old");
    System.out.println("Your GPA is: "+gpa);
   // System.out.println("Student: "+ isStudent);

    if(isStudent){
        System.out.println("You are enrolled as student");
    }
    else{
        System.out.println("You are not enrolled  student");
    }
   
    //close scanner after taking input to avoid unusual behaviour of scanner function
    scanner.close();
     

    }
    
}
