import java.util.ArrayList;

public class Agenda {
    ArrayList<Compromisso> lista = new ArrayList<>();

    Agenda() {
        lista = new ArrayList<>();
    }

    public void adicionaCompromisso(Compromisso c) {
        if (!(lista.contains(c))){
            lista.add(c);
        }
    }

    public void removeCompromisso(Compromisso c) {
        lista.remove(c);
    }

    public void imprimeComprimissos() {
        for (Compromisso c: lista) {
            System.out.println(c);
            System.out.println("-----------------------");
        }
    }

    // public void alteraCompromisso(Compromisso c) {
        
    // }



}
