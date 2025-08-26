package br.com.devsdoagi.exercPolimorfismo.ex002;

public class CDB extends Investimento{
    public CDB(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        return getValorAplicado()*0.01;
    }
}
