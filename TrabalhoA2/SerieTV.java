public class SerieTV {
    private String titulo, genero;
    private int temporadas, ano;
    private boolean concluida;

    public SerieTV(String titulo, String genero, int temporadas, int ano, boolean concluida) {
        setAno(ano);
        setGenero(genero);
        setTemporadas(temporadas);
        setTitulo(titulo);
        this.concluida = concluida;
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
        String generoNormalizado = genero.trim();
        if (generoNormalizado.equalsIgnoreCase("Comedia") ||
            generoNormalizado.equalsIgnoreCase("Drama") ||
            generoNormalizado.equalsIgnoreCase("Romance") ||
            generoNormalizado.equalsIgnoreCase("Ficcao")) {
            this.genero = generoNormalizado;
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
            throw new IllegalArgumentException("Quantidade de temporadas deve ser no mínimo 1");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 2020) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano deve ser 2020 ou posterior");
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
        return "Título: " + titulo + "\nGênero: " + genero + "\nTemporadas: " + temporadas + "\nAno: " + ano + "\nConcluída: " + concluida;
    }

    public String getSerieTVCSV() {
        return titulo + ";" + genero + ";" + temporadas + ";" + ano + ";" + concluida;
    }

    public void setSerieTVCSV(String linha) {
        String[] campos = linha.split(";");
        setTitulo(campos[0]);
        setGenero(campos[1].trim());
        setTemporadas(Integer.parseInt(campos[2]));
        setAno(Integer.parseInt(campos[3]));
        setConcluida(Boolean.parseBoolean(campos[4]));
    }
    
}
