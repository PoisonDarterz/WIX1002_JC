package L4Q3;

import java.util.Scanner;
import java.lang.Math;

public class l4q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score, minscore = 9999, maxscore = -1, count = 0; //2146483647, -2147483648 (2^31-1, -2^31)
        int sum = 0, sumsquare = 0;
        double avg, stddev;
        do {
            System.out.print("Enter a score: ");
            score = sc.nextInt();
            if (score < 0) {
                break;
            }
            if (score < minscore) {
                minscore = score;
            } else if (score > maxscore) {
                maxscore = score;
            }
            sum += score;
            sumsquare += Math.pow(score, 2);
            count++;
        } while (true);
        avg = (double) sum / count;
        stddev = Math.sqrt((sumsquare - (Math.pow(sum, 2) / count)) / count-1);
        System.out.println("The minimum score is " + minscore);
        System.out.println("The maximum score is " + maxscore);
        System.out.println("The average score is " + avg);
        System.out.printf("The standard deviation is %.2f", stddev);
    }
}
