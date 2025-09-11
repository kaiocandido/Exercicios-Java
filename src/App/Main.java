package App;

import Entites.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Triangulo x , y;
        x = new Triangulo();
        y = new Triangulo();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entites.Triangulo X");
        System.out.println("Digite o valor de A: ");
        x.a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        x.b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        x.c = sc.nextDouble();
        System.out.println("=====================");
        System.out.println("Entites.Triangulo X");
        System.out.println("Digite o valor de A: ");
        y.a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        y.b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        y.c = sc.nextDouble();
        System.out.println("=====================");
        System.out.println("Tringulo X Area " + x.Area());
        System.out.println("Tringulo Y Area " + y.Area());
        System.out.println("=====================");

        double trinaguloX = x.Area();
        double trinaguloY = y.Area();

        if (trinaguloX > trinaguloY){
            System.out.println("O maior é X");
        }else {
            System.out.println("O maior é o Y");
        }

        sc.close();
    }
}
