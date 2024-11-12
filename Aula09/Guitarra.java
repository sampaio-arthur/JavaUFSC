public class Guitarra extends InstrumentoCorda {
    
        public Guitarra() {
            super(6);
        }
    
        public Guitarra(int x){
            super(x);
        }

        @Override
        public void tocar() {
            System.out.println("Tocando guitarra...");
        }




}