package bancoDigital.contas;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nome, Long numero, Double saldo) {
        super(nome, numero, saldo);
    }

    @Override
    public String toString() {
        return "Tipo da conta: corrente, " + super.toString();
    }
}
