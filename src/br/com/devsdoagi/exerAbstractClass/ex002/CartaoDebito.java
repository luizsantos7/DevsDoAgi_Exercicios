package br.com.devsdoagi.exerAbstractClass.ex002;

public class CartaoDebito extends Cartao{
    private double saldoConta;

    public CartaoDebito(double limite, String numero, double saldoConta) {
        super(limite, numero);
        this.saldoConta = saldoConta;
    }

    @Override
    public void processarConta(double valor) {
        if(getSaldoConta()>=valor){
            setSaldoConta(getSaldoConta()-valor);
            System.out.println("Compra Realizada! saldo atual: "+getSaldoConta());
            System.out.println();
        }
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
