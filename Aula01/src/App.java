import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int numero;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numero = leitor.nextInt();
        System.out.println("Numero: " + numero);
        
        System.out.println("Qual o seu nome?");
        leitor.useDelimiter("[;\r\n]+");
        nome = leitor.next();
        System.out.println("Nome: " + nome);
        leitor.close();
    }
}
