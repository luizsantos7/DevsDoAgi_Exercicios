package br.com.devsdoagi.exerc01;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float altura = leia.nextFloat();

        System.out.println("Digite seu peso em KG:");
        float peso = leia.nextFloat();

        float imc = peso/(altura*altura);

        System.out.printf("seu IMC é: %.2f ", imc);

    }
}
