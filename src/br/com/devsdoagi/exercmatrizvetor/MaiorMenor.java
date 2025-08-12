package br.com.devsdoagi.exercmatrizvetor;

import java.util.Random;

public class MaiorMenor {

    public static void main(String[] args) {
        double[] valores = new double[100];
        Random random = new Random();

        double valorAtual = 0;

        for (int i = 0; i < valores.length; i++) {
            // Gera um salto aleatório entre 1000 e 10.000
            double salto = 1000 + random.nextDouble() * 9000;

            valorAtual += salto;
            valores[i] = valorAtual;
        }

        System.out.printf("maior valor: %.2f\n", maiorPreco(valores));
        System.out.printf("menor valor: %.2f\n", menorPreco(valores));
    }

    public static double maiorPreco(double[] precos) {
        double maior = precos[0];
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > maior) {
                maior = precos[i];
            }
        }
        return maior;
    }

    public static double menorPreco(double[] precos) {
        double menor = precos[0];
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] < menor) {
                menor = precos[i];
            }
        }
        return menor;

        
    }
}
