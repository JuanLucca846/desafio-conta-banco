import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da conta ! ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite a agencia ! ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome ! ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo ! ");
        saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");
    }
}
