package br.com.devsdoagi.exercMetodos;

import java.util.Scanner;

public class JurosAnos {

    public static float jurosAnual(float deposito, float jurosAnual, int anos){
        return deposito*(jurosAnual*anos);
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o capital inicial:");
        float capital = leia.nextFloat();
        System.out.println("Digite a taxa anual:");
        float taxaAnual = leia.nextFloat();
        taxaAnual=taxaAnual/100;
        System.out.println("Por fim digite a quantidade de anos:");
        int anos = leia.nextInt();

        System.out.println("Valor final: " + jurosAnual(capital,taxaAnual,anos));
    }
}
