public class Viola extends InstrumentoCorda{

    public Viola() {
        super(10);
    }

    public Viola(int x){
        super(x);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando viola...");
    }
    
}