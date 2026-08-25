public class printf_statement {
    public static void main(String[] args) {


    // printf() = used to format output

    // %[flags][width][.presion][specifier-charecter]


    String name="Shihab";
    char firstLetter='S';
    int age=30;
    double height=60.5;
    boolean isEmployed=true;
    

    // string output
   System.out.printf("Hello %s\n",name);
   // char output
   System.out.printf("Your name starts with a %c\n", firstLetter);
   // integer output
   System.out.printf("You are %d years old\n", age);
   // double output
   System.out.printf("You are %f inches tall\n",height);
   // double output with precision
   System.out.printf("You are %.2f inches tall\n",height);
   // boolean output
   System.out.printf("Employed: %b\n", isEmployed);
   // string and integer output
   System.out.printf("%s is %d years old\n",name,age);


    
   // includes flags

    // [flags]
    // +=output a plus
    // , =comma grouping separator
    // ( = negative number are enclosed in ()
    // space = display a minus if negative,space if positive

    double price1=9654.99;
    double price2=10870.15;
    double price3=-54684.01;
    double price4=-9865.02;

   // output as plue +
   System.out.printf("%+.1f\n", price1);
   // output as comma separeted
   System.out.printf("%,.2f\n", price2);
   // negative number are enclosed as ()
   System.out.printf("%(.2f\n", price3);
   // space display a minus if a number is negative
   System.out.printf("% .2f\n", price4);

   // width

    //[width]
    // 0= zero padding
    // number = right justified padding
    // negative number = left justified padding

    int id1=1;
    int id2=23;
    int id3=456;
    int id4=7890;

    System.out.printf("%04d\n",id1);
    System.out.printf("%4d\n",id2);
    System.out.printf("%-4d\n",id3);
    System.out.printf("%d\n",id4);
        
    }
    
    
}
