package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Count from 0 to N
Read a number N and display the numbers from 0 to N.
 */

public class ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any number: ");
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
