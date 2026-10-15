package listaWhile_3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double n;
        double s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número.");
        n = sc.nextDouble();
        while (n != 0){
            if (n % 3 == 0) {
                s = s + n;
            }else {
            }
            System.out.println("Insira um número.");
            n = sc.nextDouble();
        }
        System.out.println("Soma dos valores múltiplos de 3: " + s);
        sc.close();
    }
}
