package pl.imiajd.rajewska;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba10 implements Cloneable, Comparable<Osoba10> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba10(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public int compareTo(Osoba10 o) {
        return this.nazwisko.compareTo(o.nazwisko);
    }

    @Override
    public String toString() {
        return "Osoba10[" +
                "nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba10 osoba10 = (Osoba10) o;
        return Objects.equals(nazwisko, osoba10.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba10.dataUrodzenia);
    }


}
