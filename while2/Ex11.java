package listaWhile_2;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota. ");
        n = sc.nextInt();
        while (n<0 || n>10){
            System.out.println("Insira uma nota válida.");
            n = sc.nextInt();
        }sc.close();
    }

}
