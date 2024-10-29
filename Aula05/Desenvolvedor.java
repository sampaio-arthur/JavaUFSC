public class Desenvolvedor extends Funcionario implements Bonus{
    @Override
    public void calcularSalario() {
        System.out.println("Salário de Dev é:" + salarioBase);
    }
 
    @Override
    public void calcularBonus() {
        
    }
}
