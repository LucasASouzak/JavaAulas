package curso.java.one.aulafilme.modelos;

import curso.java.one.aulafilme.modelos.calc.Classificar;

public class Episodios implements Classificar {
    private int numero;
    private  String nome;
    private Serie serie;
    private int visualizacao;

    public int getNumero() {
        return numero;
    }

    public int getVisualizacao() {
        return visualizacao;
    }

    public void setVisualizacao(int visualizacao) {
        this.visualizacao = visualizacao;
    }

    public String getNome() {
        return nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (visualizacao > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
