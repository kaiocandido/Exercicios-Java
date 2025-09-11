package Conta;

public class Conta {
    private int numeroConta;
    private String name;
    private double depositoInicial;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public Conta() {
        this.depositoInicial = 0;
        this.saldo = 0;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Deposito(double saldo){
        this.saldo += saldo;
    }


    public void Saque(double saque){
        this.saldo -= saque;
    }

    @Override
    public String toString() {
        return  "numeroConta=" + numeroConta +
                ", name='" + name + '\'' +
                ", depositoInicial=" + depositoInicial +
                ", saldo=" + saldo;
   }

}
