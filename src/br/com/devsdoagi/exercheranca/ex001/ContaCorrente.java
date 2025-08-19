package br.com.devsdoagi.exercheranca.ex001;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldo, String titulo, double limiteChequeEspecial) {
        super(numeroConta, saldo, titulo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void sacarComChequeEspecial(double valor){
        if (valor<= getLimiteChequeEspecial()){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque realizado com sucesso\nSaldo atual: "+getSaldo());
        }else {
            System.out.println("Saque maior que o limite, tente novamente!");
        }
    }
}
