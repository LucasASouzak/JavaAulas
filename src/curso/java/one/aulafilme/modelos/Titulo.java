package curso.java.one.aulafilme.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean inclusoNoPlano;
    private double avaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

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
}

