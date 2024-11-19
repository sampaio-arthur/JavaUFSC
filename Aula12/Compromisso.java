public class Compromisso {
    private String descricao;
    private Relogio momento;

    public Compromisso(String descricao, int hora, int minuto) {
        this.descricao = descricao;
        momento = new Relogio(hora, minuto);
    }

    public String toString() {
        return "Descrição: " + this.descricao + "\nHorário: " + this.momento;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Compromisso)) {
            return false;
        }
        Compromisso c = (Compromisso) o;
        return this.momento.equals(c.momento);

    }
}
