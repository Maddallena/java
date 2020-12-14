package pl.edu.uwm.wmii.magdalenarajewska.kolokwium2.imiajd.rajewska;

import java.time.LocalDate;

public class Laptop extends Komputer implements Cloneable, Comparable{

    private boolean czyApple;

    @Override
    public int compareTo(Object o) {
        Laptop var = (Laptop)o;
        if (super.compareTo(o) == 0){
            if (this.czyApple == var.isCzyApple()) {
                return 1;
            }
            if (this.czyApple != var.isCzyApple()) {
                return -1;
            }
        }
        return super.compareTo(o);
    }

    public Laptop(String nazwa, LocalDate dataProdukcji, boolean czyApple) {
        super(nazwa, dataProdukcji);
        this.czyApple = czyApple;
    }

    public boolean isCzyApple() {
        return czyApple;
    }

    @Override
    public String toString() {
        return "Laptop:" + getNazwa() +'\''+
                " ,dataProdukcji: " + getDataProdukcji() + '\''+
                " ,czyApple= " + czyApple + '\'';
    }
}
