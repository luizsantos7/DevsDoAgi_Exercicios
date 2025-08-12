package br.com.devsdoagi.exercmatrizvetor.matriz;

public class EX005 {
    public static void main(String[] args) {
        double[][] matriz = {
                {1001.5, 1012.3, 1105.7},
                {1020.4, 1150.8, 1077.2},
                {1099.9, 1044.6, 1188.8}
        };

        System.out.printf("%.2f\n", calcularMediaTotal(matriz));

        double[] somas = somarVendasPorVendedor(matriz);

        for (int i = 0; i < somas.length; i++) {
            System.out.printf("Soma das vendas do vendedor de ID %d : %.2f\n", i+1, somas[i]);
        }
    }

    static double calcularMediaTotal(double[][] matriz){
        double total = 0;
        for (int linha = 0; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                total = total + matriz[linha][coluna];
            }
        }
        total = total/9;
        return total;
    }
    static double[] somarVendasPorVendedor(double[][] matriz){
        double[] vendas = new double[3];
        double total = 0;

        for (int linha = 0; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                total= total + matriz[linha][coluna];
            }
            vendas[linha] = total;
            total=0;
        }
        return vendas;
    }

}
