package br.com.devsdoagi.exerPOO.ex001;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void adicionar(int quantidadeAdd){
        quantidade = quantidade+quantidadeAdd;
        System.out.printf("\nFoi adicionado %d ao produto!\n", quantidadeAdd);
    }
    public void remover(int quantidadeRemove){
        quantidade=quantidade-quantidadeRemove;
        System.out.printf("\nFoi removido %d do produto!\nSaldo atual: %d\n\n",quantidadeRemove, quantidade);
    }
    public void exibirEstoque(){
        System.out.println("Nome do produto: "+ nome);
        System.out.println("Preço do Produto: "+preco);
        System.out.println("quantidade: "+quantidade);
    }
}
