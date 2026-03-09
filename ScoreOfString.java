import java.util.Scanner;

public class ScoreOfString {

    public static int scoreOfString(String s) {

        int score = 0;

        for(int i = 1; i < s.length(); i++){
            score += Math.abs(s.charAt(i) - s.charAt(i-1));
        }

        return score;
    }

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = scoreOfString(s);

        System.out.println("Score = " + result);
    }
}