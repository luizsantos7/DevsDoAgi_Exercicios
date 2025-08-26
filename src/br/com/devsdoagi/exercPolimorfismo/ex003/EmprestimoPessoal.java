package br.com.devsdoagi.exercPolimorfismo.ex003;

public class EmprestimoPessoal extends Emprestimo {
    public EmprestimoPessoal(double valorEmprestado) {
        super(valorEmprestado);
    }

    @Override
    public double calcularParcela(int meses) {
        double juros= getValorEmprestado()*0.02*meses;
        return juros;
    }
}
