package alura.practice.model;

public class ContaBancaria {
    private String conta;
    private double saldo;

    public ContaBancaria(String conta) {
        this.conta = conta;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor){
        setSaldo(valor);
    }
}
