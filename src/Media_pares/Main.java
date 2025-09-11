package Media_pares;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter: ");
        int n = sc.nextInt();

        int[] pares = new int[n];

        // Leitura dos números
        for (int i = 0; i < pares.length; i++) {
            System.out.println("Digite um numero: ");
            pares[i] = sc.nextInt();
        }

        int contador = 0;
        // Contando os números pares
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] % 2 == 0) {
                contador++;
            }
        }

        int[] finalNumbers = new int[contador];
        int index = 0;

        // Preenchendo o vetor finalNumbers com os números pares
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] % 2 == 0) {
                finalNumbers[index] = pares[i];
                index++;
            }
        }

        // Verificando se há números pares
        if (finalNumbers.length > 0) {
            int soma = 0;
            // Calculando a soma dos números pares
            for (int i = 0; i < finalNumbers.length; i++) {
                soma += finalNumbers[i];
            }

            // Calculando a média dos números pares
            int media = soma / finalNumbers.length;
            System.out.println("Média dos pares: " + media);
            System.out.println("Pares: " + Arrays.toString(finalNumbers));
        } else {
            System.out.println("Números ímpares");
        }
    }
}
