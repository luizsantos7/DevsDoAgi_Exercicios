package br.com.devsdoagi.exercmatrizvetor.matriz;

public class ex006 {
    public static void main(String[] args) {

        double[][] matriz = {
                {1001.5, 1012.3, 1105.7},
                {1020.4, 1150.8, 1077.2},
                {1099.9, 1044.6, 1188.8}
        };

        double[]fundos = somaFundos(matriz);

        for (int i = 0; i < fundos.length; i++) {
            System.out.printf("Valor investido no %d Fundo de Investimento : %.2f\n", i+1, fundos[i]);
        }

    }
    static double[] somaFundos(double[][] matriz){
        double[] fundos = new double[3];
        double total = 0;

        for (int linha = 0; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                total= total + matriz[linha][coluna];
            }
            fundos[linha] = total;
            total=0;
        }
        return fundos;
    }
}
