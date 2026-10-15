package listaWhile_3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n;
        int s = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número.");
        n = sc.nextInt();
        while (n!=0){
           if (n>10){
               c += 1;
           }else {
           }
            System.out.println("Insira um número.");
            n = sc.nextInt();

        }
        System.out.println("Quantidade de números maiores que 10: " + c);
        sc.close();
    }
}
