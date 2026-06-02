public abstract class ContaBancaria implements Bloqueavel {

    protected int numero;
    protected String titular;
    protected double saldo;
    protected boolean ativa;

    public ContaBancaria(int numero,
                         String titular,
                         double saldo) {

        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Titular não pode ser nulo ou vazio.");
        }

        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.ativa = true;
    }

    public void depositar(double valor)
            throws OperacaoInvalidaException {

        if (!ativa) {
            throw new OperacaoInvalidaException(
                    "Conta bloqueada.");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "Valor inválido para depósito.");
        }

        saldo += valor;
    }

    public void sacar(double valor)
            throws OperacaoInvalidaException {

        if (!ativa) {
            throw new OperacaoInvalidaException(
                    "Conta bloqueada.");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente.");
        }

        saldo -= valor;
    }

    @Override
    public void bloquear() {
        ativa = false;
    }

    @Override
    public void desbloquear() {
        ativa = true;
    }

    @Override
    public boolean isAtiva() {
        return ativa;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public abstract double calcularRendimento();
}