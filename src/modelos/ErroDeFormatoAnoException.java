package modelos;

public class ErroDeFormatoAnoException extends Throwable {
    private String mensagem;

    public ErroDeFormatoAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
