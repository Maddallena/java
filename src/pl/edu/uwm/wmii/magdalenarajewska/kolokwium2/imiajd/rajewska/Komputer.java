package pl.edu.uwm.wmii.magdalenarajewska.kolokwium2.imiajd.rajewska;

import java.time.LocalDate;
import java.util.Objects;

public class Komputer implements Cloneable, Comparable {

    private String nazwa;
    private LocalDate dataProdukcji;

    public Komputer(String nazwa, LocalDate dataProdukcji) {
        this.nazwa = nazwa;
        this.dataProdukcji = dataProdukcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    @Override
    public int compareTo(Object o) {
        Komputer var = (Komputer)o;
        int compareName = this.nazwa.compareTo(var.getNazwa());
        int compareDate = this.dataProdukcji.compareTo(var.getDataProdukcji());

        if(compareName == 0){
            return compareDate;
        }
        return compareName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komputer komputer = (Komputer) o;
        return Objects.equals(nazwa, komputer.nazwa) &&
                Objects.equals(dataProdukcji, komputer.dataProdukcji);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, dataProdukcji);
    }

    @Override
    public String toString() {
        return "Komputer:\n" +
                "nazwa='" + nazwa + '\'' +
                ", dataProdukcji=" + dataProdukcji;
    }
}
