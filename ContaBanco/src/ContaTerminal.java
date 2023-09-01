import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuario
        // Obter pela Scanner os valores pedidos
        // Exibir a mensagem conta criada
        Scanner scan = new Scanner(System.in);
        double saldo;

        System.out.println("Por favor digite o número da Conta !");
        int conta = scan.nextInt();

        System.out.println("Por favor digite o número da Agência !");
        String agencia = scan.next();

        System.out.println("Por favor digite o seu nome !");
        String nomeDoUsuario = scan.next();
        String segundoNome = scan.next();
        nomeDoUsuario = nomeDoUsuario.concat(" " + segundoNome);

        System.out.println("Por favor digite o saldo da conta !");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeDoUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo "+ saldo + " já está disponível para saque");
    }
}