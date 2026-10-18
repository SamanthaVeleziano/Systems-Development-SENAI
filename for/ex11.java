package JavaListExercises.Exercises9_For;

import java.util.Locale;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any number: ");
        double a = sc.nextDouble();
        double gre = a;
        for (int i = 2; i <= 5; i++){
            System.out.println("Type any number: ");
            a = sc.nextDouble();
            if (a > gre){
                gre = a;
            }
        }
        System.out.printf("highest value: %.2f", gre);
        sc.close();
    }
}
