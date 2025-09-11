package Soma;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Quantos numeros vão ser digitados: ");
        int numbers = sc.nextInt();

        double[] vect = new double[numbers];
        System.out.println("======================");
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite seu numero: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println("======================");
        for (int i =0; i < vect.length; i++){
            System.out.print(" " + vect[i]);
        }

        double media = 0;
        System.out.println("");
        System.out.println("======================");
        for (int i = 0; i < vect.length; i++){
            media += vect[i] / vect.length;
        }
        System.out.println("Media: " + media);
        System.out.println("======================");
        double soma = 0;

        for (int i = 0; i < vect.length; i++){
            soma += vect[i];
        }
        System.out.println("Soma: " + soma);

    }
}
