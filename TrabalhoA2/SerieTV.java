public class SerieTV {
    private String titulo, genero;
    private int temporadas, ano;
    private boolean concluida;

    public SerieTV(String titulo, String genero, int temporadas, int ano, boolean concluida) {
        setAno(ano);
        setConcluida(concluida);
        setGenero(genero);
        setTemporadas(temporadas);
        setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero.equals("Comédia") || genero.equals("Drama") || genero.equals("Romance") || genero.equals("Ficção")) {
            this.genero = genero;
        } else {
            throw new IllegalArgumentException("Gênero Inválido");
        }
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        if (temporadas >= 1) {
            this.temporadas = temporadas;
        } else {
            throw new IllegalArgumentException("Quantidade Inválida");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 2020) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano não considerado recente");
        }
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SerieTV)) return false;

        SerieTV serieTV = (SerieTV) obj;

        return this.titulo.equals(serieTV.titulo) && this.ano == serieTV.ano;
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + "\nGênero: " + this.genero + "\nTemporadas: " + this.temporadas + "\nAno: " + this.ano + "\nConcluída: " + this.concluida;
    }

    public String getSerieTVCSV() {
        return titulo + ";" + genero + ";" + temporadas + ";" + ano + ";" + concluida;
    }

    public void setSerieTVCSV(String linha) {
        String[] campos = linha.split(";");
        setTitulo(campos[0]);
        setGenero(campos[1]);
        setTemporadas(Integer.parseInt(campos[2]));
        setAno(Integer.parseInt(campos[3]));
        setConcluida(Boolean.parseBoolean(campos[4]));
    }
}
