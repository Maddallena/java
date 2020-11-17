package pl.imiajd.rajewska;

import pl.imiajd.rajewska.Osoba8;

import java.time.LocalDate;

public class Student8 extends Osoba8 {
    private String kierunek;
    private double sredniaOcen;

    public Student8(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, String kierunek) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek + "mający średnią ocen: " + getSredniaOcen();
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }
}
