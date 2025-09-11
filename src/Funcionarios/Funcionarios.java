package Funcionarios;

public class Funcionarios {
    String name;
    double grossSalary;
    double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public double IncreseSalary(double porc){
        double finalSalary;
        finalSalary = (grossSalary * porc) / 100;
        return (finalSalary + grossSalary) - tax;
    }

}
