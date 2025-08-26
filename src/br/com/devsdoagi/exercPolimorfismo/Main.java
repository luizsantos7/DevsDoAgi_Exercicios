package br.com.devsdoagi.exercPolimorfismo;

import br.com.devsdoagi.exercPolimorfismo.ex001.Pagamento;
import br.com.devsdoagi.exercPolimorfismo.ex001.PagamentoCartaoCredito;
import br.com.devsdoagi.exercPolimorfismo.ex001.PagamentoPix;
import br.com.devsdoagi.exercPolimorfismo.ex002.CDB;
import br.com.devsdoagi.exercPolimorfismo.ex002.Investimento;
import br.com.devsdoagi.exercPolimorfismo.ex002.Poupanca;
import br.com.devsdoagi.exercPolimorfismo.ex003.Emprestimo;
import br.com.devsdoagi.exercPolimorfismo.ex003.EmprestimoEmpresarial;
import br.com.devsdoagi.exercPolimorfismo.ex003.EmprestimoPessoal;
import br.com.devsdoagi.exercPolimorfismo.ex004.ContaBancaria;
import br.com.devsdoagi.exercPolimorfismo.ex004.ContaCorrente;
import br.com.devsdoagi.exercPolimorfismo.ex004.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        /*Pagamento[] vetorPagamento = {
                new Pagamento(3333),
                new PagamentoPix(303030,"92999999"),
                new PagamentoCartaoCredito(30,900000)
        };

        for(var pag: vetorPagamento){
            pag.processarPagamento();
        }
        Investimento[] vetorInvestimento = {
                new Investimento(4000),
                new Poupanca(1888),
                new CDB(919)
        };
        for(var inv: vetorInvestimento){
            System.out.printf("Valor aplicado: %.2f | Rendimento: %.2f%n",
                    inv.getValorAplicado(),
                    inv.calcularRendimento());
        }
        Emprestimo[] emprestimos = {
                new EmprestimoPessoal(12000),
                new EmprestimoEmpresarial(50000)
        };

        for (Emprestimo e : emprestimos) {
            System.out.println("Parcela em 12 meses: R$" + e.calcularParcela(12));
        }*/

        ContaBancaria[] contas = {
                new ContaCorrente(5000,"Luizão"),
                new ContaPoupanca(60060, "Marcelin"),
                new ContaBancaria(100,"Jennifi")
        };

        for (ContaBancaria c : contas) {
            c.gerarRelatorio();
        }


    }
}
