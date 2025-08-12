package br.com.devsdoagi.exercmatrizvetor;

import java.util.Scanner;

public class PotencialAcumulado {
    public static void main(String[] args) {
        double[] ativo = {10.5f, 20.3f, 15.7f, 30.1f, 25.0f};

        System.out.printf("%.2f",calcularCrescimentoAcumulado(ativo));
    }

    public static double calcularCrescimentoAcumulado(double[] precos){
        double valorInicial = precos[0];
        double valorFinal = precos[precos.length - 1];

        double crescimentoPercentual = ((valorFinal - valorInicial) / valorInicial) * 100;

        return crescimentoPercentual;
    }
}
