package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Check if a Number Is Prime
Read a number and check if it is prime.
 */

public class ex18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any number: ");
        double e = sc.nextDouble();
        int cou = 0;
        for (int i = 1; i <= e; i++){
            if (e % i == 0){
                cou += 1;
            }
        }
        if (cou == 2){
            System.out.println("The number is prime.");
        }
        else {
            System.out.println("The number isn't prime.");
        }
        sc.close();
    }
}
