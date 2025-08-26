package br.com.devsdoagi.exercPolimorfismo.ex001;

public class PagamentoPix extends Pagamento{
   private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.printf("Pagamento feito via pix!\nValor: %.2f\nChave Pix:%s",getValor(),getChavePix());

    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}
