import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Programa: Por favor, digite o número da Agência !");
        String agencia = terminal.nextLine();

        System.out.println("Programa: Por favor, digite o número da Conta !");
        int numero = terminal.nextInt();
        terminal.nextLine(); // Limpar o buffer do scanner

        System.out.println("Programa: Por favor, digite o nome do Cliente !");
        String nomeCliente = terminal.nextLine(); 

        System.out.println("Programa: Por favor, digite o saldo da conta !");
        double saldo = terminal.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
     
    }
}
