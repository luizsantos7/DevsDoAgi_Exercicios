package br.com.devsdoagi.exercheranca.ex005;

public class InvestimentoRendaFixa extends Investimento{
    private double taxaAnual;
    private int periodoMeses;

    public InvestimentoRendaFixa(String codigo, double valorInicial, int periodoMeses, double taxaAnual) {
        super(codigo, valorInicial);
        this.periodoMeses = periodoMeses;
        this.taxaAnual = taxaAnual;
    }

    public double calcularValorFinal() {
        return getValorInicial() * (1 + (taxaAnual / 100) * (periodoMeses / 12.0));
    }
    public int getPeriodoMeses() {
        return periodoMeses;
    }

    public void setPeriodoMeses(int periodoMeses) {
        this.periodoMeses = periodoMeses;
    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public void setTaxaAnual(double taxaAnual) {
        this.taxaAnual = taxaAnual;
    }
}
