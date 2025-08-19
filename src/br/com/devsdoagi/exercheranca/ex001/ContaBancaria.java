package br.com.devsdoagi.exercheranca.ex001;

public class ContaBancaria {
    private String titulo;
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String numeroConta, double saldo, String titulo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titulo = titulo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
