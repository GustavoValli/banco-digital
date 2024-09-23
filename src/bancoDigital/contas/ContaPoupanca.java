package bancoDigital.contas;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nome, Long numero, Double saldo) {
        super(nome, numero, saldo);
    }

    @Override
    public String toString() {
        return "Tipo da conta: poupança, " + super.toString();
    }
}
