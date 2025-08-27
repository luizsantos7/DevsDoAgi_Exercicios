package br.com.devsdoagi.exercCollection.Map;

import java.util.HashMap;
import java.util.Map;

public class SaldoCliente {
    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<>();

        adicionarCliente(contas, "123", 1000.0);
        adicionarCliente(contas, "456", 500.0);
        adicionarCliente(contas, "789", 250.0);

        // Exibindo saldos iniciais
        exibirSaldos(contas);

        // Realizando depósitos
        depositar(contas, "123", 200.0);
        depositar(contas, "456", 300.0);
        depositar(contas, "999", 100.0); // conta inexistente

        // Exibindo saldos atualizados
        exibirSaldos(contas);

    }
    public static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial){
        contas.put(numeroConta,saldoInicial);
    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double valor){
        if(!contas.containsKey(numeroConta)){
            System.out.println("Conta não existe!");
        }else{
            double saldoAtual = contas.get(numeroConta);
            double saldototal = saldoAtual+valor;
            contas.put(numeroConta,saldototal);
        }

    }


    public static void exibirSaldos(Map<String, Double> contas){
        if (contas.isEmpty())
            System.out.println("a lista esta vazia1");
        else{
            System.out.println("Saldo das Contas!\n");
            for (var entry : contas.entrySet()) {
                System.out.println("Conta: " + entry.getKey() + " | Saldo: R$ " + entry.getValue());
            }
        }
    }
}
