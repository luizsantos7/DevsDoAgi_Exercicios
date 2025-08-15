package br.com.devsdoagi.exerPOO.ex002;

public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    public ContaBancaria(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double deposito){
        if (deposito>0){
            saldo = saldo + deposito;
            System.out.printf("\nAdicionado %.2f a seu saldo!\n", deposito);
        }
        else
            System.out.println("Deposito Invalido!");
    }
    public void sacar(double saque){
        if (saldo>0) {
            saldo = saldo - saque;
            System.out.printf("\nFoi realizado o saque de %.2f!\n", saque);
        }else
            System.out.println("Saldo negativo, saque inválido!");
    }
    public void exibirSaldo(){
        System.out.println("Saldo atual:" +saldo);
    }

}
