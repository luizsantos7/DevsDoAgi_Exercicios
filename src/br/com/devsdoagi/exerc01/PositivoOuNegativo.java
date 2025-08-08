package br.com.devsdoagi.exerc01;
import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = leia.nextInt();

        if(num<=0){
            if (num==0){
                System.out.println("O numero Digitado é 0");
            }
            else
                System.out.println("O numero Digitado é Negativo");
        }else
            System.out.println("O numero digitado é Positivo");
    }
}