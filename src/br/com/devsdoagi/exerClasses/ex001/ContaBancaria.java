package br.com.devsdoagi.exerClasses.ex001;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double deposito){
        if(deposito>0){
            this.saldo += deposito;
        }else{
            System.out.println("Valor de depósito inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double saque){
        if(saque <=this.saldo){
            this.saldo -= saque;
        }
        else{
            System.out.println("Valor inválido!");
        }
    }

    public void extrato(){
        System.out.println("Titular da conta: " +titular);
        System.out.println("Numeração da Conta: " + numeroConta);
        System.out.println("Saldo da Conta: " + saldo);

    }
}
