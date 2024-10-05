public class Heroi {
    String nome;
    int nivel;
    int poder;
    
    void mostrarStatus() {
        System.out.format("Herói: %s (level %d) (poder %d) \n", nome, nivel, poder);
    }

    // metodo que nao retorna nada e recebe um parametro alvo do tipo String
    void ataque(String alvo, String habilidade) {
        System.out.format("%s atacou %s com %s e causou %d de dano \n", nome, alvo, habilidade, poder);
    }
}
