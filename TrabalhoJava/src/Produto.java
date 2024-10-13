public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean adicionarEstoque(int quantidade) {
        if(quantidade > 0) {
            this.quantidade += quantidade;
               return true;
        } else {
            return false;
        }
    }

    public boolean removerEstoque(int quantidade) {
        if(quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
         return "Produto: " + nome + "/ Preço: " + preco + "/ Quantidade: " + quantidade;
    }
    
    @Override
    public boolean equals(Object obj) {
        Produto produto =  (Produto) obj;

        if(this.nome.equals(produto.nome) && this.preco == produto.preco && this.quantidade == produto.quantidade) {
            return true;
        } else {
            return false;
        }
    }

}
