package br.com.devsdoagi.exercheranca.ex005;

public class Investimento {
    private String codigo;
    private double valorInicial;

    public Investimento(String codigo, double valorInicial) {
        this.codigo = codigo;
        this.valorInicial = valorInicial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
}
