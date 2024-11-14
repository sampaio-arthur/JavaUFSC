public class Livro {
    private String titulo;
    private String autor;
    private float preco;
    private int paginas; 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }  
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
       
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public float getPreco() {
        return preco;
    }

    public int getPaginas() {
        return paginas;
    }

    public Livro(String titulo, String autor, float preco, int paginas) {
        setAutor(autor);
        setPaginas(paginas);
        setPreco(preco);
        setTitulo(titulo);
    }
    
    public String toString() {
        return "Título: " + this.titulo + "\nAutor: " + this.autor + "\nPreço: " + this.preco + "\nPáginas: " + this.paginas;
    }

}
