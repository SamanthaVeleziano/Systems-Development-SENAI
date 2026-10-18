package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Add Only Positive Numbers
Read 6 numbers and add only the positive ones.
 */

public class ex14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 6; i++){
            System.out.println("Type any number: ");
            double a = sc.nextDouble();
            if (a > 0){
                sum += a;
            }
        }
        System.out.printf("sum of positive numbers: %d", sum);
        sc.close();
    }
}
