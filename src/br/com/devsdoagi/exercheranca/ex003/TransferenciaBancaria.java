package br.com.devsdoagi.exercheranca.ex003;

public class TransferenciaBancaria extends Transacao {
    private String contaOrigem;
    private String contaDestino;

    public TransferenciaBancaria(String data, int id, double valor, String contaDestino, String contaOrigem) {
        super(data, id, valor);
        this.contaDestino = contaDestino;
        this.contaOrigem = contaOrigem;
    }

    public void resumoTransferencia(double valor){
        System.out.println("A transferencia de valor R$" + valor +" foi transferido da conta "+contaOrigem+"para a conta"+contaDestino);
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }
}
