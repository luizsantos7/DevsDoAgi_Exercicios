package br.com.devsdoagi.exercCollection.set.ex002;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProdutosExclusivos {
    public static void main(String[] args) {
        HashSet<String> produtos = new HashSet<>();
        Scanner leia = new Scanner(System.in);

        while(true){
            System.out.println("Digite o produto que queira adiquirir:");
            String prod = leia.next();
            adicionarProduto(produtos,prod);
            System.out.println("Se deseja sair digite 0, caso queira continuar digite qualquer outro numero");
            int exit = leia.nextInt();
            if(exit==0)
                break;
        }
        System.out.println("Produtos:");
        exibirProdutos(produtos);


    }
   public static void exibirProdutos(Set<String> produtos){
        System.out.println("");
        for(var p: produtos){
            System.out.println(p);
        }
    }
    public static void adicionarProduto(Set<String> produtos, String nomeProduto){
        produtos.add(nomeProduto);
    }
}
