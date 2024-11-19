public class Relogio {
    private int hora, minuto;

    public Relogio(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public void setHora(int h) {
        if (h >= 0 && h <=23){
            this.hora = h;
        } else {
            this.hora = 1;
        }
    }

    public void setMinuto(int m) {
        if (m >= 0 && m <= 59) {
            this.minuto = m;
        } else {
            this.minuto = 1;
        }
    }

    public String toString() {
        return this.hora + ":" + this.minuto;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Relogio)) {
            return false;
        }

        Relogio r = (Relogio) o;
        return (this.hora == r.hora) && (this.minuto == r.minuto);

    }
            
        
    
}