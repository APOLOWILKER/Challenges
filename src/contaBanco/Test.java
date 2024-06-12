package contaBanco;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        ContaBancaria conta01 = new ContaBancaria(101, 3000);
        ContaBancaria conta02 = new ContaBancaria(101, 8099);
        ContaBancaria conta03 = new ContaBancaria(101, 11750);

        contas.add(conta01);
        contas.add(conta03);
        contas.add(conta02);

        ContaBancaria contaMaiorSaldo = contas.get(0);

        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());

    }
}
