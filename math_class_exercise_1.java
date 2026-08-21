import  java.util.Scanner;
public class math_class_exercise_1 {
    public static void main(String[] args) {
       // Hypotenuse c=Math.sqrt(a² + b²)

       Scanner scanner=new Scanner(System.in);

       double a;
       double b;
       double c;

       System.out.print("\nEnter the length of side A: ");
       a= scanner.nextDouble();

       System.out.print("\nEnter the length of side B: ");
       b= scanner.nextDouble();

      c= Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
      System.out.println("\nThe hypotenuse (side c) is: "+c);




        scanner.close();
    }
    
}
