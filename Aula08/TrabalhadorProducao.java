public class TrabalhadorProducao extends Funcionario{
   private int quantidade;
   private double valorPorPeca;

    TrabalhadorProducao(String nome, String sobrenome, double valorPorPeca, int quantidade) {
        super(nome, sobrenome);
        this.valorPorPeca = valorPorPeca;
        this.quantidade = quantidade;
    }

    @Override
    public double salario() {
        return this.quantidade * this.valorPorPeca;
    }

    @Override
    public String toString() {
        return "Trabalhador Produção: " + " " + super.toString() + " " + "\nSalário: " + this.salario();
    }
    
}
