package listaDoWhile;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,d;
        n = 0;
        d = 0;
        char s;
        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            System.out.print("Digite um divisor: ");
            d = sc.nextInt();

            System.out.println("O resultado da divisão é: " + n/d);

            System.out.print("Deseja continuar (s/n): ");
            s = sc.next().charAt(0);

        } while (s != n);
        sc.close();
    }
}
