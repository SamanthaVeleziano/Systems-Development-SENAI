package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Smallest of 5 numbers
Read 5 numbers and pick the smallest one.
 */

public class ex12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any number: ");
        double a = sc.nextDouble();
        double sma = a;
        for (int i = 2; i <= 5; i++){
            System.out.println("Type any number: ");
            a = sc.nextDouble();
            if (a < sma){
                sma = a;
            }
        }
        System.out.printf("smallest value: %.2f", sma);
        sc.close();
    }
}
