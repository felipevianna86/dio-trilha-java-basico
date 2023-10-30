import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        ContaTerminal contaTerminal = new ContaTerminal();
        contaTerminal.setNumero(scanner.nextInt());

        System.out.println("Digite o número da agência: ");
        contaTerminal.setAgencia(scanner.next());

        System.out.println("Digite o nome do cliente: ");
        contaTerminal.setNomeCliente(scanner.next());

        System.out.println("Digite o valor do saldo: ");
        contaTerminal.setSaldo(scanner.nextBigDecimal());

        System.out.println("Número da conta: "+contaTerminal.getNumero());
        System.out.println("Número da agência: "+contaTerminal.getAgencia());
        System.out.println("Nome do cliente: "+contaTerminal.getNomeCliente());
        System.out.println("Saldo: "+contaTerminal.getSaldo());
    }
}
