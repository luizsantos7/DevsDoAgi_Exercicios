package br.com.devsdoagi.exerClasses.ex001;

public class MainCB {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria("10100101", 3000, "Luizinho");

        contaBancaria.depositar(2000);
        contaBancaria.sacar(4000);
        contaBancaria.extrato();
    }


}
