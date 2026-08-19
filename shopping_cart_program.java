import java.util.Scanner;

public class shopping_cart_program {
    public static void main(String[] args) {

        //shopping cart program

        Scanner scanner=new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='$';
        double total;

        //prints and takes item input
        System.out.print("\nWhat item would you like to buy?: ");
        item=scanner.nextLine();

         //prints and takes price input
        System.out.print("What is the price for each?: ");
        price=scanner.nextDouble();

         //prints and takes quantity input
        System.out.print("How many would you like?: ");
        quantity=scanner.nextInt();

        //multiplies price and quantity for total
        total= price * quantity;


        //prints output with a string , quantity and price
        System.out.println("\nYou have brought "+quantity+""+item+"/s");

         //prints string with currency sign and total amount
        System.out.println("Yout total is "+currency+total);
        




        scanner.close();
    }
    
}
