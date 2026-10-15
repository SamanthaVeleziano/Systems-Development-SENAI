package listaWhile_2;

import java.util.Scanner;

public class Ex12   {
    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a senha.");
        s = sc.nextInt();
        while (s!=1234){
            System.out.println("Senha incorreta, tente novamente.");
            s = sc.nextInt();
        }sc.close();
    }
}
