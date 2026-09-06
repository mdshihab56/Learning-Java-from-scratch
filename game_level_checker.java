
import java.util.Scanner;

public class game_level_checker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score;
        String result;
        String level;

        System.out.println("==============================");
        System.out.println("       GAME SCORE SYSTEM");
        System.out.println("==============================");

        System.out.print("Enter your score: ");
        score = scanner.nextInt();

        // Ternary operator
        // (condition) ? true : false

        result = (score >= 50) ? "You Passed!" : "Game Over!";

        level = (score >= 90) ? "Expert" :
                (score >= 70) ? "Advanced" :
                (score >= 50) ? "Intermediate" :
                "Beginner";

        System.out.println();
        System.out.println("--------- Game Result ---------");
        System.out.println("Score  : " + score);
        System.out.println("Result : " + result);
        System.out.println("Level  : " + level);

        System.out.println("==============================");

        scanner.close();
    }
}
