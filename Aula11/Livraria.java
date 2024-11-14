import java.util.ArrayList;
public class Livraria {
    private ArrayList<Livro> lista;

    Livraria() {
        lista = new ArrayList<>();
    }

    public void adicionarLivro(Livro liv) {
        this.lista.add(liv);
    }

    public void imprimirLivro() {
        for (Livro i: this.lista) {
        System.out.println(i);
        }
    }

    public float somaPrecos() {
        float s = 0;
        for (Livro i: this.lista) {
            s += i.getPreco();
        }
        return s;
    }

    public float mediaPrecos() {
        return somaPrecos() / this.lista.size();
    }

}
