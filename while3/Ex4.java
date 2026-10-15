package listaWhile_3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double n;
        double s=0;
        double c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número.");
        n = sc.nextDouble();
        while (n > 0){
            s += n;
            c += 1;
            System.out.println("Insira um número.");
            n = sc.nextDouble();
        }
        System.out.println("A média dos valores é: " + s/c);
        sc.close();
    }
}
