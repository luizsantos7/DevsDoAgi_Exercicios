package br.com.devsdoagi.exercPolimorfismo.ex002;

public class Poupanca extends Investimento{

    public Poupanca(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        return getValorAplicado()*0.005;
    }
}
