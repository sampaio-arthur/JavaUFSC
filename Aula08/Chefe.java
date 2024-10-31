public class Chefe extends Funcionario {
    private double salarioSemanal;

    Chefe(String nome, String sobrenome, double s) {
        super(nome, sobrenome);
        this.salarioSemanal = s;
    }

    @Override
    public double salario() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return "Chefe: " + " " + super.toString() + "\nSálario: " + this.salario();
    }
    
}
