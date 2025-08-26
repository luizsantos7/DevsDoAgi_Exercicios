package br.com.devsdoagi.exerAbstractClass.ex003;

public abstract class Investimento {
    private double valorAplicado;

    public Investimento(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public abstract double calcularRendimento();

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }
}
