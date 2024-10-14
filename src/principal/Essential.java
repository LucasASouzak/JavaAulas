package principal;

import modelos.Episodios;
import modelos.Movie;
import modelos.Serie;
import curso.java.one.aulafilme.modelos.calc.CalculadoraDeTempo;
import curso.java.one.aulafilme.modelos.calc.Recomendacao;

import java.util.ArrayList;

public class Essential {

    public static void main(String[] args) {
        Movie novoFilme = new Movie("Interestelar",2014);
        /*novoFilme.setNome();
        novoFilme.setAnoLancamento(2014);*/
        novoFilme.setDuracaoEmMinutos(169);

        novoFilme.exibirAtributos();
        novoFilme.avaliar(8);
        novoFilme.avaliar(6);
        novoFilme.avaliar(4);
        novoFilme.avaliar(10);
        System.out.println("Total de avaliações: " + novoFilme.getTotalAvaliacoes());
        novoFilme.exibirAtributos();
        System.out.println(novoFilme.mediaAvalicoes());

        Serie house = new Serie("Dr.House",2004);
       //house.setNome();
        house.setTemporadas(8);
        //house.setAnoLancamento(2004);
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

        var favoritosAssistir = new Movie("A volta dos mortos vivos",1985);
        favoritosAssistir.setDuracaoEmMinutos(150);
        //favoritosAssistir.setAnoLancamento(1985);
        //favoritosAssistir.setNome();
        favoritosAssistir.avaliar(10);

        ArrayList<Movie> listaFavoritos = new ArrayList<>();
        listaFavoritos.add(favoritosAssistir);
        listaFavoritos.add(novoFilme);
        System.out.println(listaFavoritos);
        System.out.println(listaFavoritos.get(0).toString());



    }
}

