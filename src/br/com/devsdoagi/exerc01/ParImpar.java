package br.com.devsdoagi.exerc01;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = leia.nextInt();

        if(num%2 == 0)
            System.out.println("numero par");
        else
            System.out.println("numero impar");
    }
}
