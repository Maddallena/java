package pl.edu.uwm.wmii.magdalenarajewska.laboratorium06;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Pracownik {
    public Pracownik(String nazwisko, double pobory, int year, int month, int day) {
        this.nazwisko = nazwisko;
        this.pobory = pobory;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        dataZatrudnienia = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        id = nextId;
        ++nextId;
    }

    public String nazwisko() {
        return nazwisko;
    }

    public double pobory() {
        return pobory;
    }

    public LocalDate dataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void zwiekszPobory(double procent) {
        double podwyżka = pobory * procent / 100;
        pobory += podwyżka;
    }

    public int id() {
        return id;
    }

    public void setId() {
        id = nextId;
        ++nextId;
    }

    public static int getNextId() {
        return nextId;
    }

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;

    private int id;
    private static int nextId = 1;
}
