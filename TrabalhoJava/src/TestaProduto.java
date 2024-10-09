
import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Produto produto1 = null;
        Produto produto2 = null;
        int funcao;

        do {
            System.out.println("Opção 1 : Criar Produto 1 e Produto 2");
            System.out.println("Opção 2 : Inserir Estoque Produto 1");
            System.out.println("Opção 3 : Inserir Estoque Produto 2");
            System.out.println("Opção 4 : Remover Estoque Produto 1");
            System.out.println("Opção 5 : Remover Estoque Produto 2");
            System.out.println("Opção 6 : Imprimir Estoque Produto 1 e Produto 2");
            System.out.println("Opção 7 : Comparar Produto 1 e Produto 2");
            System.out.println("Opção 8 : Sair");
            funcao = entrada.nextInt();

            switch (funcao) {
                case 1:
                    System.out.print("Nome do Produto 1: ");
                    String nome1 = entrada.next();
                    System.out.print("Preço do Produto 1: ");
                    Float preco1 = entrada.nextFloat();
                    System.out.print("Quantidade do Produto 1: ");
                    int quantidade1 = entrada.nextInt();
                    produto1 = new Produto(nome1, preco1, quantidade1);

                    System.out.print("Nome do Produto 2: ");
                    String nome2 = entrada.next();
                    System.out.print("Preço do Produto 2: ");
                    Float preco2 = entrada.nextFloat();
                    System.out.print("Quantidade do Produto 2: ");
                    int quantidade2 = entrada.nextInt();
                    produto2 = new Produto(nome2, preco2, quantidade2);
                    break;

                case 2:
                    if (produto1 != null) {
                        System.out.print("Quantidade a adicionar ao Produto 1: ");
                        int qtd = entrada.nextInt();
                        if (produto1.adicionarEstoque(qtd)) {
                            System.out.println("Estoque adicionado com sucesso!");
                        } else {
                            System.out.println("Quantidade inválida!");
                        }
                    } else {
                        System.out.println("Produto 1 não foi criado!");
                    }
                    break;

                case 3:
                    if (produto2 != null) {
                        System.out.print("Quantidade a adicionar ao Produto 2: ");
                        int qtd = entrada.nextInt();
                        if (produto2.adicionarEstoque(qtd)) {
                            System.out.println("Estoque adicionado com sucesso!");
                        } else {
                            System.out.println("Quantidade inválida!");
                        }
                    } else {
                        System.out.println("Produto 2 não foi criado!");
                    }
                    break;

                case 4:
                    if (produto1 != null) {
                        System.out.print("Quantidade a remover do Produto 1: ");
                        int qtd = entrada.nextInt();
                        if (produto1.removerEstoque(qtd)) {
                            System.out.println("Estoque removido com sucesso!");
                        } else {
                            System.out.println("Quantidade inválida ou insuficiente!");
                        }
                    } else {
                        System.out.println("Produto 1 não foi criado!");
                    }
                    break;

                case 5:
                    if (produto2 != null) {
                        System.out.print("Quantidade a remover do Produto 2: ");
                        int qtd = entrada.nextInt();
                        if (produto2.removerEstoque(qtd)) {
                            System.out.println("Estoque removido com sucesso!");
                        } else {
                            System.out.println("Quantidade inválida ou insuficiente!");
                        }
                    } else {
                        System.out.println("Produto 2 não foi criado!");
                    }
                    break;

                case 6:
                    if (produto1 != null && produto2 != null) {
                        System.out.println(produto1);
                        System.out.println(produto2);
                    } else {
                        System.out.println("Os produtos não foram criados!");
                    }
                    break;

                case 7:
                    if (produto1 != null && produto2 != null) {
                        if (produto1.equals(produto2)) {
                            System.out.println("Os produtos são iguais.");
                        } else {
                            System.out.println("Os produtos são diferentes.");
                        }
                    } else {
                        System.out.println("Os produtos não foram criados!");
                    }
                    break;

                case 8:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (funcao != 8);

        entrada.close();
    }
}