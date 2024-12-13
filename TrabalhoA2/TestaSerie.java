import java.util.Scanner;

public class TestaSerie {
    public static void main(String[] args) {
        ServicoStreaming servico = new ServicoStreaming();
        servico.carregaDados();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar uma nova série de TV");
            System.out.println("2. Alterar os dados de uma série de TV");
            System.out.println("3. Remover uma série de TV");
            System.out.println("4. Listar séries de TV após um determinado ano");
            System.out.println("5. Listar séries de TV por gênero");
            System.out.println("6. Listar todas as séries de TV");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    try {
                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Gênero (Comedia, Drama, Romance, Ficcao): ");
                        String genero = scanner.nextLine();
                        System.out.print("Número de temporadas: ");
                        int temporadas = scanner.nextInt();
                        System.out.print("Ano: ");
                        int ano = scanner.nextInt();
                        System.out.print("Concluída (true/false): ");
                        boolean concluida = scanner.nextBoolean();

                        SerieTV novaSerie = new SerieTV(titulo, genero, temporadas, ano, concluida);
                        servico.adicionaSerieTV(novaSerie);
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar série: " + e.getMessage());
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    System.out.print("Título da série a ser alterada: ");
                    String tituloAlterar = scanner.nextLine();
                    System.out.print("Ano da série a ser alterada: ");
                    int anoAlterar = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        System.out.print("Novo Gênero (Comedia, Drama, Romance, Ficcao): ");
                        String novoGenero = scanner.nextLine();
                        System.out.print("Novo Número de Temporadas: ");
                        int novasTemporadas = scanner.nextInt();
                        System.out.print("Novo Ano: ");
                        int novoAno = scanner.nextInt();
                        System.out.print("Concluída (true/false): ");
                        boolean novaConclusao = scanner.nextBoolean();

                        SerieTV novaSerie = new SerieTV(tituloAlterar, novoGenero, novasTemporadas, novoAno, novaConclusao);
                        servico.alterarSerieTV(tituloAlterar, anoAlterar, novaSerie);
                    } catch (Exception e) {
                        System.out.println("Erro ao alterar série: " + e.getMessage());
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    System.out.print("Título da série a ser removida: ");
                    String tituloRemover = scanner.nextLine();
                    System.out.print("Ano da série a ser removida: ");
                    int anoRemover = scanner.nextInt();
                    servico.removeSerieTV(tituloRemover, anoRemover);
                    break;

                case 4:
                    System.out.print("Digite o ano: ");
                    int anoListar = scanner.nextInt();
                    servico.listarSeriesTV(anoListar);
                    break;

                case 5:
                    System.out.print("Digite o gênero: ");
                    String generoListar = scanner.nextLine();
                    servico.listarSeriesTV(generoListar);
                    break;

                case 6:
                    servico.listarSeriesTV();
                    break;

                case 7:
                    servico.gravar();
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }
}
