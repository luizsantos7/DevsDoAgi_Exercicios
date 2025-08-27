package br.com.devsdoagi.extrycatch.ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite os preços separados por vírgula (ex: 100,102,101,103,105):");
            String input = sc.nextLine();

            String[] partes = input.split(",");
            double[] precos = new double[partes.length];

            for (int i = 0; i < partes.length; i++) {
                precos[i] = Double.parseDouble(partes[i].trim());
            }

            if (precos.length < 3) {
                throw new IllegalArgumentException("É necessário pelo menos 3 valores para calcular a média móvel.");
            }

            for (int i = 2; i < precos.length; i++) {
                double mm = (precos[i] + precos[i - 1] + precos[i - 2]) / 3.0;
                System.out.printf("Média Móvel (dia %d): %.1f%n", i + 1, mm);
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: você digitou um valor inválido. Use apenas números separados por vírgula.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
