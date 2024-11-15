import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(0);
        int opcao;
        float valor;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Bem vindos ao Sampaio's Bank");
            System.out.println("DÍGITO 1: depósito");
            System.out.println("DÍGITO 2: saque");
            System.out.println("DÍGITO 3: saldo");
            System.out.println("DÍGITO 4: sair");

            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    valor = s.nextFloat();
                    c1.deposito(valor);
                    break;
                
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    valor = s.nextFloat();
                    c1.saque(valor); 
                    break;
                
                case 3:
                    c1.consultaSaldo();
                    break;
                
                case 4:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Opção Inválida");
                    break;
            }


        } while (opcao != 4);

        s.close();
    }

    
}
