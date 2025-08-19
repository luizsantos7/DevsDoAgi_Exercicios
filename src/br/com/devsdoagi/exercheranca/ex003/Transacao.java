package br.com.devsdoagi.exercheranca.ex003;

public class Transacao {
    private int id;
    private double valor;
    private String data;

    public Transacao(String data, int id, double valor) {
        this.data = data;
        this.id = id;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
