package br.com.devsdoagi.exerPOO.testes;

public class Animal extends Moto {
    private int idade;
    private String nome;
    private String especie;

    public Animal(String nome, int idade, String especie, double peso) {
        super(peso);

        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public void mostrarDados(){
        System.out.println("O nome do animal é: "+ nome);
        System.out.println("Idade do animal: "+ idade);
        System.out.println("este animal é um: " + especie);
    }

    public void barulho(){
        if(especie.equalsIgnoreCase("cachorro")) {
            System.out.println("AUAAUAUAUAUA");
        }else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("MIAUMIAUMIAU");
        }else {
            System.out.println("Não sou animal seu burro");
        }
    }
}
