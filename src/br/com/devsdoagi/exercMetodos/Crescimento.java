package br.com.devsdoagi.exercMetodos;

import java.util.Scanner;

public class Crescimento {
    public static float crescimento(float valor1, float valor2){
        float crescimentoMensal = ((valor1-valor2)/valor1)/100;
        return crescimentoMensal;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do dia 1:");
        float dia1 = leia.nextFloat();
        System.out.println("Digite o valor do dia 2:");
        float dia2 = leia.nextFloat();
        System.out.println("Crescimento: %"+ crescimento(dia1,dia2));
    }
}
