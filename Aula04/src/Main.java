
import java.util.Scanner;

public class Main {
    int x;
    int y;
        public static int maiorValor(int x, int y) {
            if(x > y) {
                return x;
            }
            else if(y > x){
                return y;
            } else {
                return 0;
            }          
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.println("Digite o valor de Y: ");
        int y = scanner.nextInt();

        System.out.println(" ");

        System.out.println("o maior valor é: " + maiorValor(x, y));
        
    }
}