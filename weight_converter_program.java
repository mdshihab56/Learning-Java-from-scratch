import java.util.Scanner;
public class weight_converter_program {
    public static void main(String[] args) {
        
        //weight converter program
         //declare variables
        // welcome message
        // prom[pt for user input
        // option 1 convert lbs to kgs
        // opstion 2 convert kgs to lbs

        // else print not a valid choice

        Scanner scanner= new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.println("Choose an option: ");
        choice=scanner.nextInt();

        if(choice==1){
            System.out.println("Enter the weight in lbs: ");
            weight=scanner.nextDouble();
            newWeight=weight * 0.453592;
            System.out.printf("the new weight in Kgs is: %.2f",newWeight);
        }
        else if (choice==2){
            System.out.println("Enter the weight in kgs: ");
            weight=scanner.nextDouble();
            newWeight=weight * 2.20462;
            System.out.printf("the new weight in lbs is: %.2f",newWeight);
        }
        else{
            System.out.println("That was not a valid choice");
        }

       
        scanner.close();

    }
    
}
