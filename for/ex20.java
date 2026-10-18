package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Class Grade Simulator
Read 10 student grades and:
 count how many passed (grade ≥ 7)
 count how many failed
 */

public class ex20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int apr = 0;
        int rep = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Enter your test score: ");
            double a = sc.nextDouble();
            while (a < 0 || a > 10) {
                if (a < 0 || a > 10) {
                    System.out.println("invalid test score");
                    System.out.println("Enter a valid test score: ");
                    a = sc.nextDouble();
                }
            }
            if (a >= 7){
                apr += 1;
            }
            else{
                rep += 1;
            }
        }
        System.out.printf("number of students who passed: %d%n", apr);
        System.out.printf("number of students who failed: %d", rep);
        sc.close();
    }
}
