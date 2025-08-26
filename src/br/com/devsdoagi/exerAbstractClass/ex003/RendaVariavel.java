package br.com.devsdoagi.exerAbstractClass.ex003;

public class RendaVariavel extends Investimento{
    public RendaVariavel(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        double rendimento;
        rendimento =  getValorAplicado() * 0.1;
        return rendimento;
    }
}
