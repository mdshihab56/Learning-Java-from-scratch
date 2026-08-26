import java.util.Scanner;
public class compound_interest_calculator {
    public static void main(String[] args) {
        
        // Compound interest calculator

        Scanner scanner=new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.err.print("\nEnter the amount of principal: ");
        principal=scanner.nextDouble();

        System.err.print("\nEnter the interest rate (in %): ");
        rate=scanner.nextDouble()/100;

        System.err.print("\nEnter the number of times compounded per year: ");
        timesCompounded=scanner.nextInt();

        System.out.print("\nEnter the number of years: ");
        years=scanner.nextInt();

        amount=principal * Math.pow(1+rate/timesCompounded,timesCompounded * years);
        System.out.printf("\nThe amount after %d  years is $%.2f",years,amount);


        scanner.close();

    }
    
}
