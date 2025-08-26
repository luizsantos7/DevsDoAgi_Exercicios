package br.com.devsdoagi.exerAbstractClass.ex003;

public class RendaFixa extends Investimento{
    public RendaFixa(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        double rendimento;
        rendimento =  getValorAplicado() * 0.05;
        return rendimento;
    }
}
