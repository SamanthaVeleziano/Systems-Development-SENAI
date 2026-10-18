package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Multiplication Table for a Number
Read a number and display its multiplication table from 1 to 10.
 */

public class ex8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.println("Type any number: ");
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            res = N * i;
            System.out.printf("%d * %d: %d%n", N, i, res);
        }
        sc.close();
    }
}
