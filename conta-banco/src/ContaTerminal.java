import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
        int numero = 0;
        String agencia;
        String nomeCliente;
        float saldo = 0;

        System.out.println("Por favor, informe seu nome: ");
        nomeCliente = input.next();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = input.next();

        System.out.println("Por favor, informe o número da conta: ");
        numero = input.nextInt();

        System.out.println("Por favor, informe seu saldo: ");
        saldo = input.nextFloat();

    System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+ " e seu saldo é de R$ "+saldo+ " já está disponível para saque.");

    }
}
