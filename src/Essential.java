import curso.java.one.aulafilme.modelos.Episodios;
import curso.java.one.aulafilme.modelos.Movie;
import curso.java.one.aulafilme.modelos.Serie;
import curso.java.one.aulafilme.modelos.calc.CalculadoraDeTempo;
import curso.java.one.aulafilme.modelos.calc.Recomendacao;

public class Essential {

    public static void main(String[] args) {
        Movie novoFilme = new Movie();
        novoFilme.setNome("Interestelar");
        novoFilme.setAnoLancamento(2014);
        novoFilme.setDuracaoEmMinutos(169);

        novoFilme.exibirAtributos();
        novoFilme.avaliar(8);
        novoFilme.avaliar(6);
        novoFilme.avaliar(4);
        novoFilme.avaliar(10);
        System.out.println("Total de avaliações: " + novoFilme.getTotalAvaliacoes());
        novoFilme.exibirAtributos();
        System.out.println(novoFilme.mediaAvalicoes());

        Serie house = new Serie();
        house.setNome("Dr.House");
        house.setTemporadas(8);
        house.setAnoLancamento(2004);
        house.setEspisodiosTemporada(22);
        house.setMinutosPorEpisodio(43);
        house.exibirAtributos();

        CalculadoraDeTempo calculadora =new CalculadoraDeTempo();
        calculadora.inclui(novoFilme);
        calculadora.inclui(house);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtro(novoFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(house);
        episodios.setVisualizacao(300);
        filtro.filtro(episodios);

    }
}

