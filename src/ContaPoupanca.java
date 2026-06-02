public class ContaPoupanca extends ContaBancaria
        implements Tributavel {

    public ContaPoupanca(int numero,
                         String titular,
                         double saldo) {

        super(numero, titular, saldo);
    }

    @Override
    public double calcularRendimento() {
        return saldo * 0.005;
    }

    @Override
    public double calcularImposto() {
        return calcularRendimento() * 0.225;
    }
}