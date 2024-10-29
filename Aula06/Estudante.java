public class Estudante {
    private String nome;
    private int matricula;
    private Endereco endereco;

    public Estudante(String nome, int matricula, Endereco endereco){
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nMatrícula: " + this.matricula + "\nEndereço: " + this.endereco;
    }
}