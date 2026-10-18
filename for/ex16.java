package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
 Fibonacci Sequence (Simplified)
Display the first 10 numbers of the Fibonacci sequence.
 */

public class ex16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int fib = 0;
        int a = 1;
        int b = 0;
        for (int i = 1; i <= 10; i++){
            fib = a + b;
            b = a;
            a = fib;
            System.out.printf("%dº Fibonacci sequence: %d%n", i, fib);
        }
        sc.close();
    }
}
