public class ContaBancaria {
    private float saldo;

    public ContaBancaria(float saldo) {
        this.saldo = 0;
    }

    public void consultaSaldo() {
        System.out.println(this.saldo);
    }

    public void deposito(float valor) {
        if (valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("valor inválido");
        }
    }

    public void saque(float valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("saldo insuficiente");
        }
    }
}

