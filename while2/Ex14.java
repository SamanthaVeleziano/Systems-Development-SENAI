package listaWhile_2;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número.");
        n = sc.nextInt();
        while (n!=0) {
            System.out.println("Insira outro número.");
            n = sc.nextInt();
        }sc.close();
    }
}
