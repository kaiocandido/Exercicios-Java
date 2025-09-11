package Funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class MainFuncionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionarios funcionarios = new Funcionarios();


        System.out.println("Qual nome do funcionario: ");
        funcionarios.name = sc.nextLine();
        System.out.println("Qual salario bruto: ");
        funcionarios.grossSalary = sc.nextDouble();
        System.out.println("Qual a taxa: ");
        funcionarios.tax = sc.nextDouble();

        System.out.println(funcionarios.name + ", $" + funcionarios.NetSalary());

        System.out.println("Qual a porcentagem de aumento: ");
        double aumento = sc.nextDouble();
        System.out.println("Update data: " + funcionarios.name + ", $" + funcionarios.IncreseSalary(aumento));

        sc.close();

    }
}
