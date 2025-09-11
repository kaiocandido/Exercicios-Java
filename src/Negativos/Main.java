package Negativos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite seu numero:");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0){
                System.out.println("O numero negativo é " + vetor[i]);
            }
        }
    }
}
