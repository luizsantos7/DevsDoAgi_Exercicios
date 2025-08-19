package br.com.devsdoagi.exercheranca;

import br.com.devsdoagi.exercheranca.ex001.ContaCorrente;
import br.com.devsdoagi.exercheranca.ex002.ProdutoPerecivel;
import br.com.devsdoagi.exercheranca.ex003.TransferenciaBancaria;
import br.com.devsdoagi.exercheranca.ex004.ClienteVip;
import br.com.devsdoagi.exercheranca.ex005.InvestimentoRendaFixa;

public class main {
    public static void main(String[] args) {
        /*ContaCorrente cc = new ContaCorrente("12345-6", 1000.0, "João Silva", 500.0);

        System.out.println("Conta: " + cc.getTitulo() + " | Nº: " + cc.getNumeroConta());
        System.out.println("Saldo: " + cc.getSaldo() + " | Limite: " + cc.getLimiteChequeEspecial());
        System.out.println("--------------------------------");

        cc.sacarComChequeEspecial(300.0);
        cc.sacarComChequeEspecial(600.0);
        cc.sacarComChequeEspecial(500.0);

        System.out.println("--------------------------------");
        System.out.println("Saldo final: " + cc.getSaldo());

        ProdutoPerecivel leite = new ProdutoPerecivel(
                "001",
                "Leite Integral",
                6.50,
                "2025-08-15"
        );

        String hoje = "2025-08-19";

        System.out.println("Produto: " + leite.getNome());
        System.out.println("Preço: " + leite.getPreco());
        System.out.println("Validade: " + leite.getDataValidade());
        System.out.println("Está vencido em " + hoje + "? " + leite.estaVencido(hoje));

        TransferenciaBancaria transferencia = new TransferenciaBancaria("2025-08-19", 12345, 1500.50, "98765-4", "12345-6");
        transferencia.resumoTransferencia(transferencia.getValor());

        ClienteVip clienteVip = new ClienteVip("Maria Souza", "987.654.321-11", 5, 15);
        double precoOriginal = 100.00;
        double precoComDesconto = clienteVip.calcularPrecoComDesconto(precoOriginal);

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Preço com desconto: R$" + precoComDesconto);*/

        InvestimentoRendaFixa investimento = new InvestimentoRendaFixa("RF001", 1000.00, 5, 24);
        double valorFinal = investimento.calcularValorFinal();
        System.out.println("O valor final do investimento é: R$" + valorFinal);
    }

}
