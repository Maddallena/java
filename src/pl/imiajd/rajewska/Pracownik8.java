package pl.imiajd.rajewska;

import pl.imiajd.rajewska.Osoba8;

import java.time.LocalDate;

public class Pracownik8 extends Osoba8 {

    private LocalDate dataZatrudnienia;
    private double pobory;

    public Pracownik8(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, LocalDate dataZatrudnienia, double pobory) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.dataZatrudnienia = dataZatrudnienia;
        this.pobory = pobory;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }
}
