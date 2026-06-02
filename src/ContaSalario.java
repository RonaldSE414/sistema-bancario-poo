public class ContaSalario extends ContaBancaria {

    private int saquesRealizados;

    public ContaSalario(int numero,
                        String titular,
                        double saldo) {

        super(numero, titular, saldo);
        this.saquesRealizados = 0;
    }

    @Override
    public void sacar(double valor)
            throws OperacaoInvalidaException {

        if (!ativa) {
            throw new OperacaoInvalidaException(
                    "Conta bloqueada.");
        }

        if (saquesRealizados >= 1) {
            throw new IllegalArgumentException(
                    "Máximo de 1 saque por mês.");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente.");
        }

        saldo -= valor;
        saquesRealizados++;
    }

    @Override
    public double calcularRendimento() {
        return 0;
    }
}