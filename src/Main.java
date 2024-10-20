import model.Conta;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero da agencia: ");
        conta.setAgencia(scan.next());

        System.out.println("Digite o numero da conta: ");
        conta.setNumero(scan.nextInt());

        System.out.println("Digite o nome do conta: ");
        conta.setNomeCliente(scan.next());

        System.out.println("Digite o saldo do conta: ");
        conta.setSaldo(scan.nextDouble());

        System.out.println("Ola "+ conta.getNomeCliente()+" obrigado por criar uma conta em nosso banco, sua agencia e"+ conta.getAgencia() +", conta "+ conta.getNumero() + " e seu saldo "+ conta.getSaldo() + " ja esta disponivel para saque." );
    }
}