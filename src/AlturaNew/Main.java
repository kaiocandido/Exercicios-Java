package AlturaNew;

import Program.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int pessoas;
        System.out.println("Quantas pessoas vão ser adicionadas: ");
        pessoas = sc.nextInt();

        Infos[] vect = new Infos[pessoas];

        for (int i = 0; i < vect.length; i ++){
            System.out.println("Dados do usuario:");
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Infos(name, idade, altura);
        }

        double media = 0;

        for (int i = 0; i < vect.length; i++){
            media += vect[i].altura / vect.length;
        }

        System.out.printf("Altura media é: %.2f%n", media);

        double contaIdade = 0;

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getIdade() < 16){
                contaIdade++;
                System.out.print(vect[i].getName());
            }
        }
        double porcentagemMenores = ((double) contaIdade / vect.length) * 100;
        System.out.println(" " + porcentagemMenores);


    }
}
