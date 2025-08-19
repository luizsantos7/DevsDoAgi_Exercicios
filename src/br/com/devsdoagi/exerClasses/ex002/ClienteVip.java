package br.com.devsdoagi.exerClasses.ex002;

public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;

    public ClienteVip(String cpf, double limiteCredito, String nome) {
        this.cpf = cpf;
        this.limiteCredito = limiteCredito;
        this.nome = nome;
    }

    public ClienteVip() {
    }

    public void exibirCliente(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: " +cpf);
        System.out.println("Limite de Crédito: "+limiteCredito);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if(limiteCredito>=1000 && limiteCredito<100000){
        this.limiteCredito = limiteCredito;
        }
        else {
            System.out.println("Limite desejado inválido," +
                    " o limite deve ter entre R$1000 e R$ 100.000");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
