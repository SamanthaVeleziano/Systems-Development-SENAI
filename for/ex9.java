package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Cumulative Multiplication (Simple Factorial)
Enter a number and calculate its factorial.
 */

public class ex9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int fat = 1;
        System.out.println("Type any number: ");
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--){
            fat *= i;
        }
        if (N >= 0) {
            System.out.printf("factorial value: %d", fat);
        }
        else {
            System.out.println("There is no factorial of a negative number.");
        }
        sc.close();
    }
}
