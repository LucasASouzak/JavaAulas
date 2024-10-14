package principal;

import modelos.Movie;
import modelos.Serie;
import modelos.Titulo;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        Movie novoFilme = new Movie("Interestelar",2014);
        var favoritosAssistir = new Movie("A volta dos mortos vivos",1985);
        Serie house = new Serie("Dr.House",2004);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favoritosAssistir);
        lista.add(novoFilme);
        lista.add(house);


        System.out.println( "Os favoritos para assistir são: ");
        for (Titulo item:lista) {
            if (item instanceof Movie filme ){
                System.out.println( item.getNome() +" "+ item.getTotalAvaliacoes());
            }
        }

        List<String> buscaAtor = new ArrayList<>();
        buscaAtor.add("Robert Doney JR");
        buscaAtor.add("Angelina");
        buscaAtor.add("Vagner Moura");
        System.out.println(buscaAtor);

        Collections.sort(buscaAtor);
        System.out.println("Organizado " + buscaAtor);

        lista.sort(Comparator.comparing(Titulo::getAvaliacoes));
        System.out.println(lista);



    }
}
