
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float numero1;
        float numero2;
        String operador;
        Float resultado;
        Scanner leitor = new Scanner(System.in);
        
        // armazenando o primeiro número
        System.out.println("Digite um numero: ");
        numero1 = leitor.nextFloat();

        // armazenando o operador
        System.out.println("Digite um operador: (+) (-) (*) (/) ->  ");
        operador = leitor.next();

        // armazenando o segundo número
        System.out.println("Digite o segundo número");
        numero2 = leitor.nextFloat();

        // Condições
        if (operador.equals("+")) {
            resultado = numero1 + numero2;
            System.out.println(resultado);
        } else if (operador.equals("-")) {
            resultado = numero1 - numero2;
            System.out.println(resultado);
        } else if (operador.equals("*")) {
            resultado = numero1 * numero2;
            System.out.println(resultado);
        } else if (operador.equals("/")) {
            if (numero2 != 0){
                resultado = numero1 / numero2;
                System.out.println(resultado);
            }else{
                    System.out.println("Não é possível dividir por 0");
                }
        } else {
            System.out.println("operador inválido!");
        }
        leitor.close();
    }
}
