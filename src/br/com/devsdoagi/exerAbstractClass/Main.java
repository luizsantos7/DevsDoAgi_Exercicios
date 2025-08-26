package br.com.devsdoagi.exerAbstractClass;

import br.com.devsdoagi.exerAbstractClass.ex002.Cartao;
import br.com.devsdoagi.exerAbstractClass.ex002.CartaoDebito;
import br.com.devsdoagi.exerAbstractClass.ex002.CartaoCredito;
import br.com.devsdoagi.exerAbstractClass.ex003.Investimento;
import br.com.devsdoagi.exerAbstractClass.ex003.RendaFixa;
import br.com.devsdoagi.exerAbstractClass.ex003.RendaVariavel;

public class Main {
    public static void main(String[] args) {
       /* Conta cc = new ConCorrente("1001", 500);
        Conta cp = new ConPoupanca("201", 500);

        exibirConta("Antes da atualização:", cc, cp);

        cc.atualizarMensal();
        cp.atualizarMensal();

        exibirConta("\nDepois da atualização:", cc, cp);
    }

    private static void exibirConta(String titulo, Conta... contas) {
        System.out.println(titulo);
        for (Conta c : contas) {
            System.out.println(c);
        }

        Cartao cc = new CartaoDebito(900,"1000",300);
        Cartao cb = new CartaoCredito(400,"2323");

        cc.processarConta(300);
        cb.processarConta(300);

        */
        Investimento rendaFixa = new RendaFixa(1000.0);
        Investimento rendaVariavel = new RendaVariavel(1000.0);

        System.out.println("rendimento" + rendaFixa.calcularRendimento());
        System.out.println("rendimento"+rendaVariavel.calcularRendimento());



    }
}
