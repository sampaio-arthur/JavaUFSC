public class InstrumentoCorda extends Instrumento{

    private int numeroDeCordas;

    public InstrumentoCorda(int x){
        this.numeroDeCordas = x;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento...");
    }
}
