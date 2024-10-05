public class App {
    public static void main(String[] args) throws Exception {
        Heroi heroi = new Heroi();
        heroi.nome = "Super Man";
        heroi.nivel = 100;
        heroi.poder = 100;

        Heroi heroi2 = new Heroi();
        heroi2.nome = "Batman";
        heroi2.nivel = 100;
        heroi2.poder = 50;

        // formatacao para status do heroi
        // System.out.format("Herói: %s (level %d) (poder %d) ", heroi.nome, heroi.nivel, heroi.poder);

        heroi.mostrarStatus();
        heroi2.mostrarStatus();
        // chamei o meteodo atacar e passei como argumento a String batman, que seria o alvo
        heroi.ataque("Batman", "Laser");
    }
}
