package listaWhile_3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número.");
        n = sc.nextInt();
        while (n != 0){
            System.out.println("O dobro de " + n + " é " + n*2);
            System.out.println("Insira um número.");
            n = sc.nextInt();
        }sc.close();
    }
}
