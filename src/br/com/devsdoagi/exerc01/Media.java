package br.com.devsdoagi.exerc01;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor");
        float valor = sc.nextFloat();

        System.out.println("Digite a média");
        float media = sc.nextFloat();

        float total = (valor/media) *100;

        System.out.printf("Diferença de %.2f%% em relação a média", total);
    }
}
