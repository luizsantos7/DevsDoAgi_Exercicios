package br.com.devsdoagi.exercmatrizvetor;

public class Verificacao {
    public static void main(String[] args) {
        int vetor[] = new int[]{10,20,33,1,50,22,5,90,12};


        for (int inicio = 0; inicio < vetor.length-1; inicio++) {
            for (int prox = inicio+1; prox < vetor.length; prox++) {
                if (vetor[prox]<vetor[inicio]){

                    int inverter = vetor[inicio];
                    vetor[inicio] = vetor[prox];
                    vetor[prox] = inverter;
                }
            }
        }

        for (int teste : vetor){
            System.out.println(teste);
        }
    }
}
