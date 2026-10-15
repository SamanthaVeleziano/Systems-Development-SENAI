package listaWhile_2;

import java.util.Locale;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double n;
        double s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor.");
        n = sc.nextDouble();
        while (n>0) {
            s += n;
            System.out.println("Insira outro valor.");
            n = sc.nextDouble();
        }
        System.out.println("O valor total da compra é de :" + s);
        sc.close();
    }
}
