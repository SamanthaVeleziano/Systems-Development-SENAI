package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Sum from 1 to N
Read a number N and calculate the sum from 1 to N.
 */

public class ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Type any number: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++){
            sum += i;
        }
        System.out.printf("Sum of 1 through 10: %d", sum);
        sc.close();
    }
}
