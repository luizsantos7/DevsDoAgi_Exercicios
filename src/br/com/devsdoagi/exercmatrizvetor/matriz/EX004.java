package br.com.devsdoagi.exercmatrizvetor.matriz;

public class EX004 {
    public static void main(String[] args) {
        double[][] precos = {
                {8.99, 25.50, 14.75},
                {15.00, 10.00, 30.99}
        };

        double[] menores = encontrarMenorPrecoPorProduto(precos);

        for (int i = 0; i < menores.length; i++) {
            System.out.println("Menor preço do produto " + (i+1) + ": " + menores[i]);
        }
    }
    public static double[] encontrarMenorPrecoPorProduto(double[][] matriz) {
        int produtos = matriz[0].length;
        double[] menorPreco = new double[produtos];

        for (int j = 0; j < produtos; j++) {
            menorPreco[j] = matriz[0][j];
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < produtos; j++) {
                if (matriz[i][j] < menorPreco[j]) {
                    menorPreco[j] = matriz[i][j];
                }
            }
        }
        return menorPreco;
    }
}
