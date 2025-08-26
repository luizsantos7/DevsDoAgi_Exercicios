package br.com.devsdoagi.exercInterface.ex001;

public class PagamentoCartao implements IPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$"+valor+" realizado via cartao de crédito.");
    }
}
