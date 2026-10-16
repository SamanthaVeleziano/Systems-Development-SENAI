package listaDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c;
        c = 0;
        do {
            System.out.print("Digite um número:");
            n = sc.nextInt();
            c += 1;

            if (n % 2 == 0) {
                System.out.println("O número " + n + " é par.");
            }else {
                System.out.println("O número " + n + " é ímpar.");
            }
        } while (c < 20);
        sc.close();
    }
}

