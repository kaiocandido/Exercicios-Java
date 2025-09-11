package Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.print("Enter account number: ");
        int contaNumber = sc.nextInt();
        conta.setNumeroConta(contaNumber);
        System.out.print("Enter account holder: ");
        String holder = sc.next();
        conta.setName(holder);

        System.out.print("Is there an initial deposit (y/n)? ");
        String option = sc.next();

        if (option.trim().equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            double value = sc.nextDouble();
            conta.setDepositoInicial(value);
        }

        System.out.println("Account data: ");
        System.out.println(conta.toString());

        System.out.print("Enter deposite value: ");
        double valueDeposito = sc.nextDouble();
        conta.Deposito(valueDeposito);
        System.out.println(conta.toString());

        System.out.print("Enter a withdraw value: ");
        double valueSaque = sc.nextDouble();
        conta.Saque(valueSaque);
        System.out.println(conta.toString());

        sc.close();
    }
}
