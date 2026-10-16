package listaDoWhile;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c, lim;
        n = 0;
        c = 0;
        System.out.print("Digite o número limite: ");
        lim = sc.nextInt();
        do {
            n += 1;
            c += 1;

            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("O número " + n + " é múltiplo de 3 e 5.");
            }else {
            }
        } while (n < lim);
        sc.close();
    }
}
