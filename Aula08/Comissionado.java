public class Comissionado extends Funcionario {
    double salarioFixo;
    int itens;
    float comissao = 1/10;

    Comissionado(String nome, String sobrenome, double salarioFixo, int itens, float comissao) {
        super(nome, sobrenome);
        this.salarioFixo = salarioFixo;
        this.itens = itens;
        this.comissao = comissao;
    }

    @Override
    public double salario() {
        return this.salarioFixo + this.itens * (this.comissao/100);
    }

    @Override
    public String toString() {
        return "Comissionado: " + super.toString() + "\nSalário: " + this.salario();
    }
}
