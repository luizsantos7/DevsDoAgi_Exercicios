package br.com.devsdoagi.exercmatrizvetor.matriz;

public class EX003 {
    public static void main(String[] args) {
        double[][] matriz = {
                {1001.5, 1012.3,},
                {1020.4, 1150.8,},
                {1099.9, 1044.6}
        };

        System.out.println(calcularSaldoTotal(matriz));
        calcularMediaPorCliente(matriz);
    }

    static double calcularSaldoTotal(double[][] matriz){
        double total = 0;
        for (int linha = 0; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                total = total + matriz[linha][coluna];
            }
        }
        return total;
    }
    static void calcularMediaPorCliente(double[][] matriz) {
        double total = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                total = total + matriz[linha][coluna];
            }
            System.out.printf("A média do cliente %d foi: %.2f \n", linha+1, total / 2);
            total=0;
        }
    }
}
