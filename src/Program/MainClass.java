package Program;

import java.util.Locale;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = null;

        int add;
        int remove;
        int i = 0;

        while (i < 2){
            System.out.println("Escolha as opções sendo:\n" +
                    "1- para adicionar produto\n" +
                    "2- para adicionar uma nova quantidade\n" +
                    "3- para remover\n" +
                    "4- para encerrar");
            int option = sc.nextInt();
            switch (option){
                case 1 -> {
                    System.out.println("Enter product data: ");
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    product = new Product(name, price, quantity);
                    System.out.println(product);
                    break;
                }

                case 2 -> {
                    System.out.print("Enter the number of products to be add in stock: ");
                    add = sc.nextInt();
                    product.addProducts(add);
                    break;
                }
                case 3 -> {
                    System.out.print("Enter the number of products to be removed in stock: ");
                    remove = sc.nextInt();
                    product.removeProducts(remove);
                    break;
                }
                case 4 -> {
                    System.out.println(product);
                    i += 2;
                    break;
                }
            }
        }




        sc.close();
    }
}
