package br.com.devsdoagi.exercMetodos;

import java.util.Scanner;

public class Converter {

    public static float converter(float money){
        float result = (float) (money/5.44);
        return result;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o valor em R$ que deseja converter:");
        float money = read.nextFloat();
        System.out.printf("O valor R$ %.2f foi convertido em %.2f Dolares", money, converter(money));
    }
}
