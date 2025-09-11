package Maior_posição;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vai ser digitado: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite o numero: ");
            vect[i] = sc.nextDouble();
        }

        double maior = 0;
        double posi = 0;

        for (int i =0; i < vect.length; i++){
            if (vect[i] > maior){
                maior = vect[i];
                posi = i;
            }
        }
    System.out.println("Teste " + maior + " na posição " + posi);

    }
}
