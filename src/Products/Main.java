package Products;

import Program.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o nome do produto");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Digite o preço produto");
            double preco = sc.nextDouble();

            vect[i] = new Product(name, preco);
        }
        double media = 0;
        for (int i =0; i < n; i++){
            media += vect[i].getPrice();
        }
        System.out.println("Media é: " + (media / n));

        sc.close();
    }
}
