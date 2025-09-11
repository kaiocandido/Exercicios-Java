package Salario;

public class Funcionario {
    private Integer id;
    private String name;
    private Double salario;

    public Funcionario(Integer id, String name, Double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalary(Double salary) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salário: " + String.format("%.2f", salario);
    }

    public void newSalario(int n){
        salario += salario * ( 1 + n / 100.0);
    }
}
