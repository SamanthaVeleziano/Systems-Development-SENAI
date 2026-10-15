package listaWhile_2;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int n;
        int c = 0;
        int neg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número.");
        n = sc.nextInt();
        c += 1;
        while (c<10){
            if (n<0) {
                neg += 1;
            }else {
            }
            System.out.println("Insira outro número.");
            n = sc.nextInt();
            c += 1;
        }
        System.out.println("Quantidade de números negativos exibidos: " + neg);
        sc.close();
    }
}
