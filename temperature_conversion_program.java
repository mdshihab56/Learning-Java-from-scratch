import java.util.Scanner;

public class temperature_conversion_program {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temerature: ");
        temp=scanner.nextDouble();

         System.out.println("Convert to Celcius or Fahrenheit? (C of F): ");
         unit=scanner.next().toUpperCase();

        System.out.println(temp);
         System.out.println(unit);

         // (condition) ? true : false

         newTemp=(unit.equals("C"))? (temp-32)*5/9:(temp*5/9)+32;

        System.out.printf("%.2f Degree %s" ,newTemp,unit);



        scanner.close();
    }
}
