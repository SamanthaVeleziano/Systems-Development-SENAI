package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Divisors of a Number
Read a number and list all its divisors.
 */

public class ex17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any number: ");
        double e = sc.nextDouble();
        for (int i = 1; i <= e; i++){
            if (e % i == 0){
                System.out.printf("%d is a divisor of %.2f%n", i, e);
            }
        }
        sc.close();
    }
}
