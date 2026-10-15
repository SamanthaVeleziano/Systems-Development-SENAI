package listaWhile_3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int l, n;
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor limite.");
        l = sc.nextInt();
        while (s<l){
            System.out.println("Insira um valor.");
            n = sc.nextInt();
            s += n;
        }
        System.out.println(s);
        sc.close();
    }
}
