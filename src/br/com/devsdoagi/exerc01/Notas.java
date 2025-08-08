package br.com.devsdoagi.exerc01;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua nota final para saber seu resultado: ");
        float nota =leia.nextFloat();

        if(nota>=6)
            System.out.println("APROVADO");
        else if(nota<4)
            System.out.println("REPROVADO");
        else
            System.out.println("ESTÁ DE RECUPERAÇÃO");
    }
}
