package br.com.devsdoagi.exercmatrizvetor.matriz;

import java.util.Scanner;

public class EX001 {

    public static void main(String[] args) {
        double[][] dados = new double[2][2];

        preencherMatriz(dados);

        System.out.printf("%.2f",calcularSomaTotal(dados));

    }

    static void preencherMatriz(double[][] matriz){
        Scanner leia = new Scanner(System.in);
        for (int linha=0; linha<2; linha++){
            for (int coluna=0; coluna<2; coluna++){
                System.out.println("Digite o valor q deseja inserir:");
                double valor = leia.nextDouble();
                matriz[linha][coluna] = valor;
            }
        }
    }
    static double calcularSomaTotal(double[][] matriz){
        double soma = 0;
        for (int linha=0; linha<2; linha++){
            for (int coluna=0; coluna<2; coluna++){
                soma = soma + matriz[linha][coluna];
            }
        }
        return soma;
    }
}
