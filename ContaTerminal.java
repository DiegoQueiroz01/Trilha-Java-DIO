import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception{
        /*TODO:conhecer e importar a classe scanner
         * Exibir as mensagens ao usuário
         * Obter os valores pelo scanner digitados pelo usuário
         * Exibir mensagem final de conta criada*/
    System.out.println("Olá, bem vindo ao seu banco online!\n");

    int numeroConta;
    double saldoConta;

    Scanner scan = new Scanner(System.in);

    System.out.println("Por favor informe o número de sua conta: ");
    numeroConta = scan.nextInt();

    System.out.println("Agora informe o número de sua agência: ");
    String numeroAgencia = scan.next();

    System.out.println("Informe seu nome:");
    String nomeCliente = scan.next();

    System.out.println("Nos diga agora seu saldo em conta: ");
    saldoConta = scan.nextDouble();

    System.out.println("\nOlá "+ nomeCliente +", seu saldo na conta "+ numeroConta +" e agência "+ numeroAgencia +" é de R$"+ saldoConta);
    
    return;
    }
}
