package Matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.print("Qual a quantidade:");
        int n = sc.nextInt();
        System.out.println("----------------");
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print("Quais os numeros: ");
                mat[i][j] = sc.nextInt();

            }
            System.out.println("----------------");
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i< n; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("Numeros negativos");
        int cont = 0;
        for (int i =0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    cont++;
                }
            }
        }

        System.out.println(cont);
        sc.close();
    }
}
