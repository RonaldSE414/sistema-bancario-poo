/*
 * Exceção Unchecked (RuntimeException).
 * Representa uma situação de negócio que pode ocorrer
 * durante a execução do sistema.
 */
public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }

}