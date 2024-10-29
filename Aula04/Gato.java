public class Gato extends Animal implements Domesticado {
    @Override
    public void emitirSom() {
        System.out.println("miauuuuuuuu");
    }

    @Override
    public void brincar() {
        System.out.println("Gato brinca de escalar");
    }
}
