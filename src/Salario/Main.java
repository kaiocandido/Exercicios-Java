package Salario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionarios vão ser: ");
        int n = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Emploey");
            System.out.println("Qual o ID: ");
            Integer id = sc.nextInt();
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.next();
            System.out.println("Salario: ");
            Double salario = sc.nextDouble();
            Funcionario func = new Funcionario(id, name, salario);
            list.add(func);
        }

        System.out.println("------------------------------------");
        System.out.println("Qual vai ser o ID do funcionarioque vai receber aumento: ");
        int idSalario = sc.nextInt();

        Funcionario func = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);

        if (func == null){
            System.out.println("Usuario não existe");
        }else{
            System.out.println("Qual a porcentagem: ");
            int por = sc.nextInt();
            func.newSalario(por);
        }

        System.out.println("-------------------------------------");
        System.out.println("Lista de funcionarios");
        for (Funcionario f : list){
            System.out.println(f);
        }

        sc.close();


    }
}
