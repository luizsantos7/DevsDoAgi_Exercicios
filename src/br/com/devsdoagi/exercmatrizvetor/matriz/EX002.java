package br.com.devsdoagi.exercmatrizvetor.matriz;

public class EX002 {
    public static void main(String[] args) {
        double[][] matriz = {
                {1001.5, 1012.3, 1105.7, 1199.9},
                {1020.4, 1150.8, 1077.2, 1111.1},
                {1099.9, 1044.6, 1188.8, 1133.3}
        };
        System.out.println(maiorValor(matriz));
    }

    public static double maiorValor (double matriz[][]){
        double maior= matriz[0][0];
        for (int linha = 0; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (matriz[linha][coluna]>matriz[linha][coluna+1]){
                    maior = matriz[linha][coluna];
                }
            }
        }
        return maior;
    }
}
