package br.com.devsdoagi.exercPolimorfismo.ex001;

public class PagamentoCartaoCredito extends  Pagamento{
    private int numeroCartao;

    public PagamentoCartaoCredito(double valor, int numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.printf("Pagamento feito via Crédito!\nValor: %.2f\nNumero Cartão:%d",getValor(),getNumeroCartao());
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
