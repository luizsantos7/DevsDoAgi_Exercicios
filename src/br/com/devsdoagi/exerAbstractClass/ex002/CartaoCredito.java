package br.com.devsdoagi.exerAbstractClass.ex002;

public class CartaoCredito extends Cartao{
    public CartaoCredito(double limite, String numero) {
        super(limite, numero);
    }

    @Override
    public void processarConta(double valor) {
        if(valor<getLimite()){
            setLimite(getLimite()-valor);
            System.out.println("Valor descontado com sucesso!\n Limite Atual: "+getLimite());
            System.out.println();
        }else{
            System.out.println("Valor maior que o limite\n");
        }
    }
}
