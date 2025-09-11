package Altura;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas vão ser? ");
        int inputPeoples = sc.nextInt();
        double[] vector = new double[inputPeoples];

        for (int i = 0; i < inputPeoples; i++){
            System.out.println("Coloque a altura: ");
            vector[i] = sc.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < inputPeoples; i++){

            media += vector[i];

        }
        double finalMedia = media / inputPeoples;
        System.out.printf("A media é %.2f%n", finalMedia);

        sc.close();
    }
}
