public class SaladeCinema {
    String nome;
    int poltronas;
    int ocupadas;

    SaladeCinema(String nome, int poltronas) {
        this.nome = nome;
        this.ocupadas = 0;
        if(poltronas > 29 && poltronas < 51) {
            this.poltronas = poltronas;
        } else {
            this.poltronas = 30;
        }
    }

    void ocupaPoltrona() {
        if(ocupadas < poltronas) {
            ocupadas += 1;
        } else{
            System.out.println("Limete de poltronas ocupadas atingido");
        }
    }
}
