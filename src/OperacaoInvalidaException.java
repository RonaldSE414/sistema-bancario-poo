/*
 * Exceção Checked (Exception).
 * Obriga o programador a tratar operações
 * realizadas em contas bloqueadas.
 */
public class OperacaoInvalidaException extends Exception {

    public OperacaoInvalidaException(String mensagem) {
        super(mensagem);
    }

}