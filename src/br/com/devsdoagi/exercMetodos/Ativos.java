package br.com.devsdoagi.exercMetodos;

import java.util.Scanner;
public class Ativos {

    public static String MaiorAtivo(float ativo1, float ativo2){
        if(ativo1>ativo2)
            return "Maior ativo: Ativo-1";
        if(ativo1<ativo2)
            return "Maior ativo: Ativo-2";
        else
            return "Ambos Iguais";
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Insira o valor do primeiro ativo");
        float ativo1= leia.nextFloat();
        System.out.println("Insira o valor do segundo ativo");
        float ativo2= leia.nextFloat();

        System.out.println(MaiorAtivo(ativo1,ativo2));
    }
}
