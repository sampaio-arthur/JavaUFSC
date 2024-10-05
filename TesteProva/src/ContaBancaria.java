public class ContaBancaria {
    private float saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public void consultaSaldo() {
        System.out.println("Seu saldo: R$" + saldo);
    }

    public void deposito(float valor) {
        if(valor > 0) {
            saldo = saldo + valor;
            System.out.format("Depósito de R$%f realizado com sucesso \n", valor);
        } else {
            System.out.println("Depósito inválido \n");
        }
    }
    
    public void saque(float valor){
        if(valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.format("Saque de R$%f realizado com sucesso \n", valor);
        } else {
            System.out.println("Saldo insuficiente \n");
        }
    }
}
