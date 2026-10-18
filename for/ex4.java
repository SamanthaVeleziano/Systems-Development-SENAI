package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Count from 0 to 100 in increments of 5
Display the numbers from 0 to 100, skipping every 5.
 */

public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 100; i+=5){
            System.out.println(i);
        }
        sc.close();
    }
}
