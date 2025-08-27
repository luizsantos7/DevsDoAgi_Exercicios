package br.com.devsdoagi.exercCollection.list;

import java.util.ArrayList;
import java.util.List;

public class HistoricoTransacao {
    public static void registrarTransacao(List<String> historico, String transacao) {
        historico.add(transacao);
    }

    public static boolean buscarTransacao(List<String> historico, String transacao) {
        return historico.contains(transacao);
    }

    // mostrando duas formas de fazer a mesma coisa
    public static void exibirHistorico(List<String> historico) {
        // usando referência a metodo
        historico.forEach(System.out::println);
        // usando lambda
        historico.forEach(x -> System.out.println(x));
    }

    public static void main(String[] args) {
        List<String> historico = new ArrayList<>();
        registrarTransacao(historico, "Depósito: 500.00");
        registrarTransacao(historico, "Saque: 200.00");
        exibirHistorico(historico);
        System.out.println("Existe 'Saque: 200.00'? " + buscarTransacao(historico, "Saque: 200.00"));
    }
}
