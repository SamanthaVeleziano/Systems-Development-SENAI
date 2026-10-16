package listaDoWhile;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c,p,i;
        n = 0;
        c = 0;
        p = 0;
        i = 0;

        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            c += 1;

            if (n % 2 == 0) {
                p += 1;
            }else {
                i += 1;
            }
        } while (c < 12);
        System.out.println("Quantidade de pares " + p);
        System.out.println("Quantidade de ímpares " + i);
        sc.close();
    }

}
