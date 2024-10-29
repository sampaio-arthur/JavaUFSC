public class Cachorro extends Animal implements Domesticado{
    @Override
    public void emitirSom() {
        System.out.println("au au au au");
    }

    @Override
    public void brincar() {
        System.out.println("Cachorro brinca com bolinha");
    }
}
