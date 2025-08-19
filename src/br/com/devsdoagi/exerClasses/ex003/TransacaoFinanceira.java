package br.com.devsdoagi.exerClasses.ex003;

public class TransacaoFinanceira {
    private String id;
    private String tipo;
    private double valor;

    public TransacaoFinanceira(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.valor = 0;
    }
    public TransacaoFinanceira(String id, String tipo, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public TransacaoFinanceira() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
