import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) throws Exception {
    var scanner = new Scanner(System.in);
    System.out.println("Bem-vindo ao banco DIO!");
    System.out.println("-------------------------");

    System.out.println("Por favor, digite o número da Agência:");
    var agencyNumber = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha excedente quando o usuário pressiona a tecla Enter.

    System.out.println("Digite a agência:");
    var agency = scanner.next();
    scanner.nextLine();

    System.out.println("Digite o seu nome:");
    var customer = scanner.nextLine();

    System.out.println("Digite o saldo da conta bancária:");
    var balance = scanner.nextBigDecimal();
    var formattedBalance = new DecimalFormat("R$#,##0.00").format(balance);

    System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque \n",
        customer, agency, agencyNumber, formattedBalance);

    scanner.close();
  }
}
