package modelos;

import curso.java.one.aulafilme.modelos.calc.Classificar;

public class Movie extends Titulo implements Classificar {
    private String diretor;

    public Movie(String nome, int ananoLancamento) {
        super(nome, ananoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvalicoes() / 2;
    }

    @Override
    public String toString(){
        return "Filme: "  + this.getNome() + " ("+ this.getAnoLancamento() + ")";
    }
}