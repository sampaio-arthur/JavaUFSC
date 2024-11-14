public class TestaLivraria {
    public static void main(String[] args) {

        Livraria saraiva = new Livraria();
        Livro liv1 = new Livro("Harry Poter", "JK", 49.90f, 200);
        Livro liv2 = new Livro("Viagem ao Centro da Terra", "Júlio Verne", 79.90f, 100);

        saraiva.adicionarLivro(liv1);
        saraiva.adicionarLivro(liv2);
        saraiva.imprimirLivro();
        System.out.println("-------------");
        System.out.println("A média é: " + saraiva.mediaPrecos());



    }
}
