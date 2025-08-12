package br.com.devsdoagi.exercmatrizvetor;

public class CarteiraDeAcoes {

    public static void main(String[] args) {

        double acoes[] ={10.5f, 20.3f, 15.7f, 30.1f, 25.0f};

        System.out.printf("%.2f",totalInvestido(acoes));
    }

    public static double totalInvestido(double[] carteira){
        double soma = 0;
        for (int i = 0; i< carteira.length-1;i++){
            soma= carteira[i] +carteira[i+1];
        }
        return soma;
    }

    public static double[] percentualPorAcao(double[] carteira) {
        double somaTotal = 0;
        for (double valor : carteira) {
            somaTotal += valor;
        }

        double[] percentual = new double[carteira.length];
        for (int i = 0; i < carteira.length; i++) {
            percentual[i] = (carteira[i] / somaTotal) * 100;
        }
        return percentual;
    }
}
