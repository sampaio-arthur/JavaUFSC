public class TestaInstrumento {
    public static void main(String[] args) {
        Guitarra gui = new Guitarra();
        Viola vi = new Viola();
        Baixo bai = new Baixo();
        Orquestra orquestra = new Orquestra();

        // orquestra.espetaculo(gui);
        // System.out.println(" ");
        // orquestra.espetaculo(vi);
        // System.out.println(" ");
        // orquestra.espetaculo(bai);

        Instrumento[] instrumentos = new Instrumento[3];

        instrumentos[0] = gui;
        instrumentos[1] = vi;
        instrumentos[2] = bai;

        System.out.println(" ");

        for (Instrumento i : instrumentos){
                orquestra.espetaculo(i);
        }

    }
}
