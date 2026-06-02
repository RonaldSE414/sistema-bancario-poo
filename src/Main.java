import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ContaCorrente cc =
                new ContaCorrente(
                        1,
                        "João",
                        500);

        ContaPoupanca cp =
                new ContaPoupanca(
                        2,
                        "Maria",
                        1000);

        ContaSalario cs =
                new ContaSalario(
                        3,
                        "Pedro",
                        800);

        List<ContaBancaria> contas =
                new ArrayList<>();

        contas.add(cc);
        contas.add(cp);
        contas.add(cs);

        System.out.println("=== POLIMORFISMO ===");

        for (ContaBancaria conta : contas) {

            System.out.println(
                    conta.getTitular()
                    + " - rendimento: R$ "
                    + conta.calcularRendimento());
        }

        System.out.println("\n=== TESTE DE SALDO INSUFICIENTE ===");

        try {

            cp.sacar(5000);

        } catch (SaldoInsuficienteException e) {

            System.out.println(
                    "Erro: " + e.getMessage());

        } catch (OperacaoInvalidaException e) {

            System.out.println(
                    "Erro: " + e.getMessage());
        }

        System.out.println("\n=== TESTE DE CONTA BLOQUEADA ===");

        try {

            cc.bloquear();

            cc.depositar(100);

        } catch (OperacaoInvalidaException e) {

            System.out.println(
                    "Erro: " + e.getMessage());
        }

        System.out.println("\n=== IMPOSTOS ===");

        System.out.println(
                "Conta Corrente: R$ "
                + cc.calcularImposto());

        System.out.println(
                "Conta Poupança: R$ "
                + cp.calcularImposto());
    }
}