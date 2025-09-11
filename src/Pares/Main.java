package Pares;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vão ser digitados: ");
        int numeros = sc.nextInt();

        int[] vect = new int[numeros];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite o numero: ");
            vect[i] = sc.nextInt();
        }

        int contador = 0;
        System.out.println("Numeros Pares: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                System.out.print(" " + vect[i]);
                contador++;
            }
        }
        System.out.println("Quantidade de numeros pares é: " + contador);
    }
}
