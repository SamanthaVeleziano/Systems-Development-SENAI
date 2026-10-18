package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Count from 10 to 1
Display the numbers from 10 to 1 (in descending order).
 */

public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        sc.close();
    }
}
