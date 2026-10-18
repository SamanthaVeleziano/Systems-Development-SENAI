package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Count from 1 to 10
Display the numbers from 1 to 10 using the “For” statement.
 */

public class ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
