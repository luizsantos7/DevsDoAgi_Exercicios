package br.com.devsdoagi.exercPolimorfismo.ex003;

public class EmprestimoEmpresarial extends Emprestimo{
    public EmprestimoEmpresarial(double valorEmprestado) {
        super(valorEmprestado);
    }

    @Override
    public double calcularParcela(int meses) {
        double juros = getValorEmprestado() * 0.01 * meses;
        return (getValorEmprestado() + juros) / meses + 100;
    }
}
