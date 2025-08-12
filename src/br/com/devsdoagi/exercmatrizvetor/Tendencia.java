package br.com.devsdoagi.exercmatrizvetor;

import java.util.Scanner;

public class Tendencia {
    public static void main(String[] args) {
        double[] precos = new double[10];
        int temporizador=0;
        Scanner leia = new Scanner(System.in);

        for (int i=0; i<precos.length; i++){
            temporizador++;
            System.out.println("Digite o preço do dia "+temporizador+":");
            precos[i] = leia.nextDouble();
        }

        int[] resultado = primeiraTrincaAlta(precos);

        if (resultado != null) {
            System.out.println("Primeira trinca de alta encontrada: índices ["
                    + resultado[0] + ", " + resultado[1] +", " + resultado[2] + "]");
        } else {
            System.out.println("Nenhuma trinca de alta encontrada.");
        }

        int[] tendencia = primeiraTendenciaAlta(precos);
        if (tendencia != null) {
            System.out.println("Primeira tendência de alta: índices ["
                    + tendencia[0] + ", " + tendencia[1] + tendencia[2] + "]");
        } else {
            System.out.println("Nenhuma tendência de alta encontrada.");
        }

        int [][]todasTendencia = todasTendenciasAlta(precos);
        if (todasTendencia != null) {
            System.out.println("Quantidade de Tendencias:" + todasTendencia.length);
        } else {
            System.out.println("Nenhuma tendência de alta encontrada.");
        }
    }

    static int[] primeiraTrincaAlta(double[] precos){
        for (int i=0; i<precos.length-2; i++){
            if (precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]){
                return new int[]{i,i+1,i + 2};
            }
        }
        return null;
    }
    public static int[] primeiraTendenciaAlta(double[] precos){
        int inicioSequencia = 0;
        int tamanhoSequencia = 1;

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                tamanhoSequencia++;
            } else {
                // A sequência de alta foi quebrada, então reiniciamos a contagem
                // e marcamos o início da nova possível sequência no índice atual.
                inicioSequencia = i;
                tamanhoSequencia = 1;
            }

            // Verificamos a cada passo se a sequência atual tem pelo menos 3 dias.
            // Se sim, retornamos os índices de início e fim.
            if (tamanhoSequencia >= 3) {
                return new int[]{inicioSequencia, i, i+1};
            }
        }
        return null;
    }


    public static int[][] todasTendenciasAlta(double[] precos) {
        java.util.List<int[]> tendencias = new java.util.ArrayList<>();
        int inicio = 0;
        int tamanho = 1;

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] >= precos[i - 1]) {
                tamanho++;
            } else {
                if (tamanho >= 3) {
                    tendencias.add(new int[]{inicio, i - 1});
                }
                inicio = i;
                tamanho = 1;
            }
        }

        // Verifica se terminou o loop ainda em tendência de alta
        if (tamanho >= 3) {
            tendencias.add(new int[]{inicio, precos.length - 1});
        }

        // Converte a lista para array bidimensional
        int[][] resultado = new int[tendencias.size()][2];
        for (int i = 0; i < tendencias.size(); i++) {
            resultado[i] = tendencias.get(i);
        }

        return resultado;
    }
}

