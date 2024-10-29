public class Gerente extends Funcionario implements Bonus {
    @Override
    public void calcularSalario() {
        System.out.println("Salário do chefe é: " + salarioBase );
    }

    @Override
    public void calcularBonus() {
        System.out.println("Seu bonus é " + 1000);
    }
}
