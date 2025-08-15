package br.com.devsdoagi.exerPOO.ex004;

public class ConsumoCombustivel {
    String modelo;
    double consumo;

    public ConsumoCombustivel(double consumo, String modelo) {
        this.consumo = consumo;
        this.modelo = modelo;
    }
    public double consumoPorKm(double distancia){
        double resultado = consumo * distancia;
        return resultado;
    }
    public void exibirDados(){
        System.out.println("Modelo do Carro: "+modelo);
        System.out.printf("pela distancia de %.2f Km o consumo foi: %.2f", 20.45,consumoPorKm(20.45));
    }
}
