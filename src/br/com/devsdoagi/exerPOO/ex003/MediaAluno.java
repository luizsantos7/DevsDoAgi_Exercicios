package br.com.devsdoagi.exerPOO.ex003;

public class MediaAluno {
    String nome;
    float nota1;
    float nota2;

    public MediaAluno(String nome, float nota1, float nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia(float n1, float n2){
        if (n1>=0 && n2>=0){
        double media = (n1+n2)/2;
        return media;
        }
        return 0;
    }
    public String verificarSituacao(double media){
        String resultado;
        if (media>6){
            resultado="Aprovado";
            return resultado;
        } else if (media<4) {
            resultado="De Recuperação";
            return resultado;
        }else {
            resultado="Reprovado";
            return resultado;
        }
    }
    public  void exibirRelatorio(){
        double media = calcularMedia(this.nota1, this.nota2);

        System.out.println("Nome do Aluno:" + this.nome);
        System.out.println("Resultado: "+verificarSituacao(media));
        System.out.println();
    }
}
