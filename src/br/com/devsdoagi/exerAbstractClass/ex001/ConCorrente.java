package br.com.devsdoagi.exerAbstractClass.ex001;

public class ConCorrente extends Conta{
    public ConCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void atualizarMensal() {
        setSaldo(getSaldo()-15); // desconto da taxa fixa
        if (getSaldo() < 0) setSaldo(0);
    }
}
