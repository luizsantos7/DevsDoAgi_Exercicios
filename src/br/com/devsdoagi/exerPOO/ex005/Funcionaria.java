package br.com.devsdoagi.exerPOO.ex005;

public class Funcionaria {
    String nome;
    double salarioBruto;
    double descontoInss;
    double descontoIr;

    public Funcionaria(double descontoInss, double descontoIr, String nome, double salarioBruto) {
        this.descontoInss = descontoInss;
        this.descontoIr = descontoIr;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public double calcularSalLiquido(){
        double salarioLiquido = salarioBruto-descontoInss-descontoIr;
        return salarioLiquido;
    }

    public void folhaDePagamento(){
        System.out.println("Nome: "+nome);
        System.out.println("Salario Bruto: "+salarioBruto);
        System.out.println("Desconto do INSS: -"+descontoInss);
        System.out.println("Desconto IR: -"+descontoIr);
        System.out.println("=================================");
        System.out.println("Saldo Final: " +calcularSalLiquido());

    }
}
