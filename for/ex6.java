package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Sum of 1 through 10
Calculate and display the sum of the numbers from 1 through 10.
 */

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.printf("Sum of 1 through 10: %d", sum);
        sc.close();
    }
}
