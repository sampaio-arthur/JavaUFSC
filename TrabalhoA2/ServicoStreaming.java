import java.util.ArrayList;
import java.io.*;

public class ServicoStreaming {
    private ArrayList<SerieTV> lista;

    public ServicoStreaming() {
        this.lista = new ArrayList<>();
    }

    public void adicionaSerieTV(SerieTV stv) {
        if (!lista.contains(stv)) {
            lista.add(stv);
        } else {
            System.out.println("Série já cadastrada.");
        }
    }

    public void removeSerieTV(SerieTV stv) {
        if (lista.remove(stv)) {
            System.out.println("Série removida com sucesso.");
        } else {
            System.out.println("Série não encontrada.");
        }
    }

    public void removeSerieTV(String titulo, int ano) {
        boolean removed = lista.removeIf(serie -> serie.getTitulo().equals(titulo) && serie.getAno() == ano);
        if (removed) {
            System.out.println("Série removida com sucesso.");
        } else {
            System.out.println("Série não encontrada.");
        }
    }

    public void gravar() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("servicostreaming.csv"))) {
            for (SerieTV stv : lista) {
                writer.write(stv.getSerieTVCSV());
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }

    public void carregaDados() {
        try (BufferedReader reader = new BufferedReader(new FileReader("servicostreaming.csv"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    SerieTV stv = new SerieTV("", "", 1, 2020, false);
                    stv.setSerieTVCSV(linha);
                    adicionaSerieTV(stv);
                }
            }
            System.out.println("Dados carregados com sucesso.");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. Iniciando lista vazia.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao processar linha: " + e.getMessage());
        }
    }

    public void listarSeriesTV(String genero) {
        boolean found = false;
        for (SerieTV serie : lista) {
            if (serie.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(serie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nenhuma série encontrada para o gênero: " + genero);
        }
    }

    public void listarSeriesTV(int ano) {
        boolean found = false;
        for (SerieTV serie : lista) {
            if (serie.getAno() > ano) {
                System.out.println(serie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nenhuma série encontrada após o ano: " + ano);
        }
    }

    public void listarSeriesTV() {
        if (lista.isEmpty()) {
            System.out.println("Nenhuma série cadastrada.");
        } else {
            for (SerieTV serie : lista) {
                System.out.println(serie);
            }
        }
    }
}
