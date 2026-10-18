package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Display only even numbers from 0 to 20
Use the “Para” function to display only even numbers.
 */

public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 20; i+=2){
            System.out.println(i);
        }
        sc.close();
    }
}
