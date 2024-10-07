import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        Cliente cliente = new Cliente();
        cliente.setNome(nomeCliente);

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.println("Digite o valor a ser depositado na conta corrente: ");
        double valorDeposito = sc.nextDouble();
        corrente.depositar(valorDeposito);

        System.out.println("Digite o valor a ser transferido para a conta poupança: ");
        double valorTransferencia = sc.nextDouble();
        corrente.transferir(valorTransferencia, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        sc.close();
    }
}
