package br.com.devsdoagi.exerAbstractClass.ex001;

public class ConPoupanca extends Conta{
    public ConPoupanca(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void atualizarMensal() {
        setSaldo(getSaldo()*0.005);// aumento de 0,5%
    }
}
