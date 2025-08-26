package br.com.devsdoagi.exercPolimorfismo.ex002;

public class Investimento {
    private double valorAplicado;

    public Investimento(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double calcularRendimento(){
        return 0;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }
}
