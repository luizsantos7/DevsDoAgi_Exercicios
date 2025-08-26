package br.com.devsdoagi.exercPolimorfismo.ex001;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }
    public void processarPagamento(){
        System.out.println("Processando pagamento genérico no valor de: R$"+valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
