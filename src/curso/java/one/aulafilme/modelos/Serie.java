package curso.java.one.aulafilme.modelos;

import curso.java.one.aulafilme.modelos.calc.Classificar;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int espisodiosTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEspisodiosTemporada() {
        return espisodiosTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEspisodiosTemporada(int espisodiosTemporada) {
        this.espisodiosTemporada = espisodiosTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public void exibirAtributos() {
        super.exibirAtributos();
    }

    public int getDuracaoEmMinutos(){
        return temporadas * espisodiosTemporada * minutosPorEpisodio;
    }
}
