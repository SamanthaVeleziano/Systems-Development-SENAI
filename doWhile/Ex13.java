package listaDoWhile;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c, mult;
        n = 0;
        c = 0;
        mult = 0;

        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            c += 1;

            if (n % 4 == 0) {
                mult += 1;
            }else {
            }
        } while (c < 15);
        System.out.println("Quantidade de múltiplos de 4: " + mult);
        sc.close();
    }
}
