package Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter reactangle width and height: ");
        retangulo.width = sc.nextDouble();
        retangulo.heigth = sc.nextDouble();

        System.out.println(retangulo);

        sc.close();
    }

}
