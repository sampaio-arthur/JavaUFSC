public class SalaDeCinema {
    private String nome;
    private int poltronas, ocupadas;

    SalaDeCinema(String nome, int poltronas) {
        this.nome = nome;
        this.ocupadas = 0;
        setPoltronas(poltronas);
    }

    public void setPoltronas(int poltronas) {
        if(poltronas > 29 && poltronas < 51) {
            this.poltronas = poltronas;
        } else {
            this.poltronas = 30;
        }   
    }

    public void ocupaPoltrona() {
        
    }

}