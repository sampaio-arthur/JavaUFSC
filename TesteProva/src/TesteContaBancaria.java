import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) throws Exception {
        
        ContaBancaria conta = new ContaBancaria();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do depósito: ");
        float valorDeposito = scanner.nextFloat();
        conta.deposito(valorDeposito);

        System.out.println("Insira um valor para sacar: ");
        float valorSaque = scanner.nextFloat();
        conta.saque(valorSaque);

        System.out.println("Seu saldo após as operações é de: ");
        conta.consultaSaldo();

        scanner.close();

        
    }
}
