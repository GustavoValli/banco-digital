package bancoDigital.contas;

import bancoDigital.Banco;

public abstract class Conta extends Banco {

    protected String nome;
    protected Long numero;
    protected Double saldo;

    public Conta(String nome, Long numero, Double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        Banco.adicionarConta(this);
    }

    public void sacar(Double saque) {
        if (saldo < saque) throw new ContaException("O saldo é insuficiente");

        saldo -= saque;
    }

    public void depositar(Double deposito) {
        saldo += deposito;
    }

    public void transferir(Double valor, Conta destino) {
        sacar(valor);
        destino.depositar(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Numero: " + numero + ", Saldo: " + saldo;
    }
}
