package br.com.devsdoagi.exercMetodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaMovel {

    public static List<Double> calcularMediaMovel(List<Double> precos, int intervalo) {
        List<Double> mediasMoveis = new ArrayList<>();

        if (precos == null || precos.size() < intervalo || intervalo <= 0) {
            System.out.println("Intervalo inválido ou lista muito pequena.");
            return mediasMoveis;
        }

        double soma = 0.0;

        for (int i = 0; i < precos.size(); i++) {
            soma += precos.get(i);

            if (i >= intervalo) {
                soma -= precos.get(i - intervalo);
            }

            if (i >= intervalo - 1) {
                mediasMoveis.add(soma / intervalo);
            }
        }

        return mediasMoveis;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> precos = new ArrayList<>();

        System.out.println("Quantos preços deseja inserir?");
        int qtd = scanner.nextInt();

        System.out.println("Digite os preços:");
        for (int i = 0; i < qtd; i++) {
            precos.add(scanner.nextDouble());
        }

        System.out.print("Digite o intervalo da média móvel: ");
        int intervalo = scanner.nextInt();

        List<Double> resultado = calcularMediaMovel(precos, intervalo);

        System.out.println("Médias móveis:");
        for (Double media : resultado) {
            System.out.printf("%.2f ", media);
        }

    }
}
