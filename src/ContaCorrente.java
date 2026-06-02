public class ContaCorrente extends ContaBancaria
        implements Tributavel {

    private double limiteChequeEspecial;

    public ContaCorrente(int numero,
                         String titular,
                         double saldo) {

        super(numero, titular, saldo);
        this.limiteChequeEspecial = 1000.0;
    }

    @Override
    public void sacar(double valor)
            throws OperacaoInvalidaException {

        if (!ativa) {
            throw new OperacaoInvalidaException(
                    "Conta bloqueada.");
        }

        if (valor > saldo + limiteChequeEspecial) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente.");
        }

        saldo -= valor;
    }

    @Override
    public double calcularRendimento() {
        return 0;
    }

    @Override
    public double calcularImposto() {
        return saldo * 0.0038;
    }
}