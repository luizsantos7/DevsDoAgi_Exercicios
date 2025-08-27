package br.com.devsdoagi.exercCollection.set.ex001;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ClienteContaUnica {
    public static void main(String[] args) {
        HashSet<Integer> contas = new HashSet<>();
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o numero da conta para ser armazenada:");
            int numero= leia.nextInt();
            adicionarConta(contas,numero);
        }
        System.out.println("Existe a conta: 20200002?"+existeConta(contas, 20200002));

        exibirContas(contas);
    }

    public static void adicionarConta(Set<Integer> contas, int numeroConta){
        contas.add(numeroConta);

    }
    public static boolean existeConta(Set<Integer> contas, int numeroConta){
        return contas.contains(numeroConta);
    }
    public static void exibirContas(Set<Integer> contas){
        for(var c : contas){
            System.out.println("\n"+c);
        }

    }

}
