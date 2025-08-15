package br.com.devsdoagi.exerPOO;

import br.com.devsdoagi.exerPOO.ex001.Produto;
import br.com.devsdoagi.exerPOO.ex002.ContaBancaria;
import br.com.devsdoagi.exerPOO.ex003.MediaAluno;
import br.com.devsdoagi.exerPOO.ex004.ConsumoCombustivel;
import br.com.devsdoagi.exerPOO.ex005.Funcionaria;

public class MainExercicios {

    public static void main(String[] args) {
       /* Produto p1 = new Produto("Camiseta", 49.90, 10);
        //ex 001 teste
        p1.exibirEstoque();
        p1.adicionar(5);
        p1.remover(3);
        p1.exibirEstoque();

        //ex002
        ContaBancaria conta = new ContaBancaria("12345-6", 1000.00, "Luiz Henrique");
        conta.exibirSaldo();
        conta.depositar(250.50);
        conta.sacar(300);
        conta.sacar(2000);
        conta.exibirSaldo();

        MediaAluno aluno1 = new MediaAluno("João", 7.5f, 8.0f);
        MediaAluno aluno2 = new MediaAluno("Maria", 5.0f, 4.5f);
        MediaAluno aluno3 = new MediaAluno("Pedro", 2.5f, 3.0f);

        aluno1.exibirRelatorio();
        aluno2.exibirRelatorio();
        aluno3.exibirRelatorio();

        ConsumoCombustivel carro = new ConsumoCombustivel(0.12, "Civic");
        carro.exibirDados();
        */
        Funcionaria func = new Funcionaria(500.00, 300.00, "Ana", 5000.00);
        func.folhaDePagamento();
    }
}
