package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Counting Numbers Greater Than 50
Read 8 numbers and say how many of them are greater than 50.
 */

public class ex15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cou = 0;
        for (int i = 1; i <= 8; i++){
            System.out.println("Type any number: ");
            double a = sc.nextDouble();
            if (a > 50){
                cou += 1;
            }
        }
        System.out.printf("number of numbers greater than 50: %d", cou);
        sc.close();
    }
}
