package bancoDigital;

import bancoDigital.contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static final List<Conta> contas = new ArrayList<>();

    protected static void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public static void exibirContas() {
        System.out.println(contas);
    }
}
