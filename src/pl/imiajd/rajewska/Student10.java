package pl.imiajd.rajewska;

import java.time.LocalDate;

public class Student10 extends Osoba10 implements Cloneable, Comparable<Osoba10>{
    private double sredniaOcen;
    public Student10(String nazwisko, LocalDate dataUrodzenia,double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public String toString() {
        return "Student10[" +
                "nazwisko: " + getNazwisko() + '\'' +
                " data urodzenia: " + getDataUrodzenia() + '\''+
                " sredniaOcen= " + sredniaOcen +
                ']';
    }
}
