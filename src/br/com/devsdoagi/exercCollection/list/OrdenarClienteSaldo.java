package br.com.devsdoagi.exercCollection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarClienteSaldo {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        adicionarCliente(clientes, "Ana", 2500.0);
        adicionarCliente(clientes, "Bruno", 1800.5);
        adicionarCliente(clientes, "Carlos", 3500.75);
        adicionarCliente(clientes, "Daniela", 1200.0);

        System.out.println("Lista original:");
        exibirClientes(clientes);

        ordenarPorSaldo(clientes);

        System.out.println("\nLista ordenada por saldo:");
        exibirClientes(clientes);
    }
    public static void adicionarCliente(List<Cliente> clientes, String nome, double saldo){
        clientes.add(new Cliente(nome,saldo));
    }


    public static void ordenarPorSaldo(List<Cliente> clientes){
        clientes.sort(Comparator.comparingDouble(Cliente::getSaldo));
    }


    public static void exibirClientes(List<Cliente> clientes) {
        for(var c : clientes){
            System.out.println("Nome: "+ c.getNome() +"\nSaldo: "+c.getSaldo()+"\n");
        }
    }


}
