package br.com.devsdoagi.exercInterface.ex001;

public class Main {
    public static void main(String[] args) {
        IPagamento boleto = new PagamentoBoleto();
        IPagamento cartao = new PagamentoCartao();

        boleto.processarPagamento(150.0);
        cartao.processarPagamento(300.0);
    }
}
