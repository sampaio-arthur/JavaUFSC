public class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this. numero = numero;
    }

    public String toString() {
        return "Rua: " + this.rua + "\nNúmero: " + this.numero;
    }
}
