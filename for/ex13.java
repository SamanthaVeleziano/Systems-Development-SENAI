package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Count the Even Numbers Entered
Read 10 numbers and count how many are even.
 */

public class ex13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int even = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Type any number: ");
            double a = sc.nextDouble();
            if (a % 2 == 0){
                even += 1;
            }
        }
        System.out.printf("number of even numbers: %d", even);
        sc.close();
    }
}
