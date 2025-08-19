package br.com.devsdoagi.exercheranca.ex004;

public class ClienteVip extends Cliente{
    private int nivel;
    private double descontoPorcentual;

    public ClienteVip(String cpf, String nome, double descontoPorcentual, int nivel) {
        super(cpf, nome);
        this.descontoPorcentual = descontoPorcentual;
        this.nivel = nivel;
    }

    public double calcularPrecoComDesconto(double preco) {
        return preco * (1 - (descontoPorcentual / 100));
    }

    public double getDescontoPorcentual() {
        return descontoPorcentual;
    }

    public void setDescontoPorcentual(double descontoPorcentual) {
        this.descontoPorcentual = descontoPorcentual;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
