package br.com.devsdoagi.exercPolimorfismo.ex004;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public void gerarRelatorio() {
        double rendimento = getSaldo() * 0.005;

        System.out.println("Relatorio Conta Poupança");
        System.out.println("Titular: "+ getTitular());
        System.out.printf("Saldo atual: %.2f\n",getSaldo());
        System.out.printf("Rendimento Previsto: %.2f\n\n", rendimento);
    }

}
