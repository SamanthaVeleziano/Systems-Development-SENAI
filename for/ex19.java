package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

/*
Countdown with a final message
Count down from 10 to 0, and at the end, display: “Posting authorized!”
 */

public class ex19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Lançamento autorizado!");
        sc.close();
    }
}
