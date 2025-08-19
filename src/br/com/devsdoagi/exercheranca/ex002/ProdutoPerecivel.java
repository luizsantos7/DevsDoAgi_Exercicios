package br.com.devsdoagi.exercheranca.ex002;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String codigo, String nome, double preco, String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(String dataAtual){

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate validade = LocalDate.parse(dataValidade, fmt);
        LocalDate atual = LocalDate.parse(dataAtual, fmt);

        return atual.isAfter(validade);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }


}
