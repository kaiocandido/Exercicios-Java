package Soma_de_vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor: ");
        int qtd = sc.nextInt();

        int[] a = new int[qtd];
        int[] b = new int[qtd];
        int[] result = new int[qtd];

        System.out.println("==================================");
        for (int i = 0; i < a.length; i++){
            System.out.println("Digite os valores do vetor A: ");
            a[i] = sc.nextInt();
        }

        System.out.println("==================================");
        for (int i = 0; i < b.length; i++){
            System.out.println("Digite os valores do vetor B: ");
            b[i] = sc.nextInt();
        }

        System.out.println("==================================");

        for (int i=0; i< result.length; i++) {
            result[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i=0; i<qtd; i++) {
            System.out.printf("%d\n", result[i]);
        }

        sc.close();

    }
}
