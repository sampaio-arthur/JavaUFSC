public class Baixo extends InstrumentoCorda {
    public Baixo() {
        super(4);
    }

    public Baixo(int x){
        super(x);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando baixo...");
    }
}
