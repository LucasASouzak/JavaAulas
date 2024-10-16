package principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.ErroDeFormatoAnoException;
import modelos.Titulo;
import modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner buscaFilme  = new Scanner(System.in);
        System.out.println("Digite o filme para busca: ");
        var busca  = buscaFilme.nextLine();

        String url = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") +"&apikey=d7152a62";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println();

            String json = response.body();

            Gson gson =  new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            //Titulo meuTitulo = gson.fromJson(json, Titulo.class);

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Primeira conversão: ");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e){
            System.out.println("Erro.");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Formato invalido...");
        }catch (ErroDeFormatoAnoException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Executou sem falhas...");







    }
}
