public class nested_if_exam_result {
    public static void main(String[] args) {

        int marks = 75;
        boolean attendedExam = true;

        if (attendedExam) {

            if (marks >= 80) {
                System.out.println("Excellent!");
                System.out.println("Grade: A+");
            }
            else if (marks >= 60) {
                System.out.println("Good job!");
                System.out.println("Grade: A");
            }
            else {
                System.out.println("You passed.");
                System.out.println("Keep improving.");
            }

        }
        else {
            System.out.println("You did not attend the exam.");
            System.out.println("Result: Absent");
        }
    }
}