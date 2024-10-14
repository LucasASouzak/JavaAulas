package curso.java.one.aulafilme.modelos.calc;

import modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
//    public void somaTempo(Movie m){
//        tempoTotal += m.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }

}
