package br.com.devsdoagi.exercPolimorfismo.ex004;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatorio Conta Corrente");
        System.out.println("Titular: "+ getTitular());
        setSaldo(getSaldo()-20);
        System.out.printf("Saldo: %.2f\n",getSaldo());
        System.out.println("Desconto de Taxa de Manutenção R$20 Mensais\n");
    }
}
