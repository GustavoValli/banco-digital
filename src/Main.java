import bancoDigital.Banco;
import bancoDigital.contas.Conta;
import bancoDigital.contas.ContaCorrente;
import bancoDigital.contas.ContaException;
import bancoDigital.contas.ContaPoupanca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            Conta contaCorrente = new ContaCorrente("Gustavo", 123L, 125d);
            Conta contaPoupanca = new ContaPoupanca("Valli", 456L, 250d);

            Banco.exibirContas();

            System.out.print("Digite a quantia para transferir: ");
            double quantia = scanner.nextDouble();

            contaCorrente.transferir(quantia, contaPoupanca);

            Banco.exibirContas();
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}