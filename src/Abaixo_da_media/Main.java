package Abaixo_da_media;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i ++){
            System.out.println("Digite o numero: ");
            vect[i] = sc.nextDouble();
        }

        double media = 0.0;

        for (int x = 0; x < vect.length; x++){
            media += vect[x] / vect.length;
        }
        int contador = 0;

        for (double v : vect) {
            if (v < media) {
                contador++;
            }
        }

        double[] result = new double[contador];
        int index = 0;

        for (int y = 0; y < vect.length; y++) {
            if (vect[y] < media) {
                result[index] = vect[y];
                index++;
            }
        }


        System.out.println("Media do vetor: " + media);
        System.out.println("Abaixos da media: \n" + Arrays.toString(result));


    }
}
