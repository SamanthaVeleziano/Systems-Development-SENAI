package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Average of 5 numbers
Read 5 numbers and calculate the average.
 */

public class ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("Type any number: ");
            double a = sc.nextDouble();
            sum += a;
        }
        sum /= 5;
        System.out.printf("average of the 5 numbers: %.2f", sum);
        sc.close();
    }
}
