package br.com.devsdoagi.extrycatch.ex001;

import java.util.Scanner;

public class SaldoContasTC {
    public static void main(String[] args) {
        double[] saldoContas = {150.75, 250.00, 999.99, 1200.50, 50.0, 80.25, 430.00, 600.40, 15.99, 9999.99};
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o indice do valor que deseja buscar:");
        int resultado = leia.nextInt();

        try{
            System.out.println("O valor do saldo é: R$"+saldoContas[resultado]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Digita uma indice válida!");
        }
    }
}
