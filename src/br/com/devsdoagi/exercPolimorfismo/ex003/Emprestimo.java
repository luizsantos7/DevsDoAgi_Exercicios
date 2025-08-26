package br.com.devsdoagi.exercPolimorfismo.ex003;

public class Emprestimo {
    private double valorEmprestado;

    public Emprestimo(double valorEmprestado) {
        this.valorEmprestado = valorEmprestado;
    }

    public double calcularParcela(int meses){
        return getValorEmprestado()/meses;
    }

    public double getValorEmprestado() {
        return valorEmprestado;
    }

    public void setValorEmprestado(double valorEmprestado) {
        this.valorEmprestado = valorEmprestado;
    }
}
