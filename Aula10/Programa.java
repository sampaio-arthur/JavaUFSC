import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
        
    public static void adicionar(ArrayList<String> nomes, Scanner s) {
        System.out.println("Insira um nome: ");
        String nome = s.nextLine();
        nomes.add(nome);

    }

    public static void removerInteiro(ArrayList<String> nomes, Scanner s) {
        System.out.println("Posição que você quer remover: ");
        int num = s.nextInt();
        s.nextLine();
        nomes.remove(num);
    }

    public static void removerNome(ArrayList<String> nomes, Scanner s) {
        System.out.println("Posição que você quer remover: ");
        String nome = s.nextLine();
        nomes.remove(nome);
    }

    public static void imprimir(ArrayList<String> nomes) {
        for (String i: nomes) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Maria da Silva");
        nomes.add("João de Souza");
        nomes.add("James Bond");
        nomes.add("Tony Stark");
        nomes.add("Jack Sparrow");
        Scanner s = new Scanner(System.in);
        int opcao;
        

        
        
        do{
            System.out.println("Opção 1: Ver lista");
            System.out.println("Opção 2: Adicionar nome");
            System.out.println("Opção 3: Remover por índice");
            System.out.println("Opção 4: Remover por nome");
            System.out.println("Opção 5: Desligar");

            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    imprimir(nomes);
                    
                    break;
            
                case 2:
                adicionar(nomes, s);
                    break;

                case 3:
                removerInteiro(nomes, s);
                    break;

                case 4:
                removerNome(nomes, s);
                    break;

                case 5:
                System.out.println("Saindo ...");
                    break;

                default:
                System.out.println("Opção inválida");
            }


        } while(opcao != 5);

        s.close();
        

    }
}