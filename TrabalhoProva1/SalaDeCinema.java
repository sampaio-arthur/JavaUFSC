public class SalaDeCinema {
    private String nome;
    private int poltronas, ocupadas;

    SalaDeCinema(String nome, int poltronas) {
        this.nome = nome;
        this.ocupadas = 0;
        setPoltronas(poltronas);
    }

    public int getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(int n) {
        if(n >= 30 && n <= 50) {
            this.poltronas = n;
        } else {
            this.poltronas = 30;
        }   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOcupadas() {
        return ocupadas;
    }

    public void setOcupadas(int ocupadas) {
        this.ocupadas = ocupadas;
    }

    public void ocupaPoltrona() {
        if (ocupadas < poltronas) {
            this.ocupadas += 1;
            System.out.println("poltrona reservada!");
        } else {
            System.out.println("sessão lotada!");
        }  
    }

    public String toString() {
        return "Sala: " + this.nome + "\nQuantidade de poltronas ocupadas: " + this.ocupadas + "\nQuantidade de poltronas na sessão: " + this.poltronas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalaDeCinema that = (SalaDeCinema) o;
        return poltronas == that.poltronas && ocupadas == that.ocupadas && nome.equals(that.nome);
    }

}