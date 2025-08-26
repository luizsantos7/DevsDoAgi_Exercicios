package br.com.devsdoagi.exerAbstractClass.ex002;

public abstract class Cartao {
    private String numero;
    private double limite;

    public Cartao(double limite, String numero) {
        this.limite = limite;
        this.numero = numero;
    }

    public abstract void processarConta(double valor);

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
