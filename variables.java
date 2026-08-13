public class variables {
    public static void main(String[] args) {
       
         //variable= a reusable container for a value

    //premitive= simple value stored directly in memory
    //reference= memory address stack that points to the heap

    // primitive vs reference
    //int           string
    //double        array
    //char          object
    //boolean

    //Creating variables
    //1. declaration
    //2.assignment



    //primitive variables
    int age=21;
    int year=2026;
    int quantity=1;
    double my_age=21.5;
    double gpa=3.5;
    char grade='A';
    char symbol='!';
    char currency='$';
    boolean isStudent=true;
    boolean forSale=false;
    boolean isOnline=true;


    //if else boolean check
    if(isStudent){
        System.out.println("You are a student");
    }
    else{
        System.out.println("You are not a student");
    }



    //outputs of primitive variables
    System.out.println("My age is "+age);
    System.out.println("The year is "+year);
    System.out.println("The amount is "+quantity);
    System.out.println("Her age is "+my_age);
    System.out.println(grade);
    System.out.println(symbol);
    System.out.println(currency);
    System.out.println(isStudent);
    System.out.println(forSale);
    System.out.println(isOnline);
 
    //for line gap in output
    System.out.println("      ");

//--------------------------------------------

    //reference variables
    String name="Shihab ";
    String name2 ="Shihab ";
    String food="pizza";
    String email="fake123@domain.com";
    String car="Mustang";
    String color="red";


    //outputs of reference variables
    System.out.println(name);
    System.out.println("hellow "+name2);
    System.out.println("Your favorite food is "+food);
    System.out.println("your email is "+email);


    System.out.println("hellow "+name);
    System.out.println("You are "+age+"years old");
    System.out.println("Your GPA is: "+gpa);
    System.out.println("Your average leter grade is: "+grade );

    //combining multiple variables in output to get single line output
    System.out.println("Your choice is a "+ color+" "+year+" "+car);


    //if else output boolean check
    if(forSale){
        System.out.println("There is a "+car+" for sale");
    }
    else{
        System.out.println("The "+car+" is not for sale");
    }

    }
   
}
