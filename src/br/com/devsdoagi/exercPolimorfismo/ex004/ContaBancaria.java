package br.com.devsdoagi.exercPolimorfismo.ex004;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void gerarRelatorio(){
        System.out.println("Relatorio Genérico");
        System.out.println("Titular: "+ getTitular());
        System.out.printf("Saldo atual: %.2f\n\n",getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
