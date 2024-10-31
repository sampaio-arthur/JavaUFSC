public abstract class Funcionario {
    private String nome, sobrenome;

    Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

   public String toString() {
        return "Nome Completo:" + " " + this.nome + " " + this.sobrenome;
    }

    public abstract double salario();
}