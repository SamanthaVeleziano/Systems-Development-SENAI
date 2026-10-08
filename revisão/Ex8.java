package listaRevisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double p,h,imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o peso. ");
        p = sc.nextDouble();
        System.out.println("Insira a altura. ");
        h = sc.nextDouble();
        imc = (p/(h*h));
        if (imc<18.5) {
            System.out.println("Abaixo do Peso");
        } else if (imc<25) {
            System.out.println("Peso Adequado");            
        } else if (imc<30) {
            System.out.println("Sobrepeso");
        }else {
            System.out.println("Obesidade");
    }sc.close();
    }
}
