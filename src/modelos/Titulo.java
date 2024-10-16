package modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private String nome;

    private int anoLancamento;
    private boolean inclusoNoPlano;
    private double avaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTitulo) throws ErroDeFormatoAnoException {
        this.nome = meuTitulo.title();

        if (meuTitulo.year().length() > 4) {
            throw new ErroDeFormatoAnoException("Ano em formato inválido, " +
                    "contem mais que 4 digitos.");
        }

        this.anoLancamento = Integer.valueOf(meuTitulo.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTitulo.runtime().substring(0,2));
    }


    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getAvaliacoes() {
        return avaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirAtributos() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + getDuracaoEmMinutos() + " minutos.");
    }

    public void avaliar(double nota) {
        avaliacoes += nota;
        totalAvaliacoes++;
    }
    public double mediaAvalicoes(){
        return avaliacoes / totalAvaliacoes;
    }

    @Override
    public int compareTo(Titulo tituloComparado) {
        return this.getNome().compareTo(tituloComparado.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "Nome: '" + nome + '\'' +
                ", Lançamento: " + anoLancamento + ", Duração: " + duracaoEmMinutos +
                '}';
    }
}

