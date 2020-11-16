package pl.edu.uwm.wmii.magdalenarajewska.laboratorium07;

import pl.imiajd.rajewska.Nauczyciel;
import pl.imiajd.rajewska.Osoba;
import pl.imiajd.rajewska.Student;

public class Zadanie4 {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Kowalski", 1970);
        Student student1 = new Student("Nowak", 1995, "Analiza i kreowanie trendów");
        Nauczyciel nauczyciel1 = new Nauczyciel("Majewski",1980, 2500);
        System.out.println(osoba1.toString());
        System.out.println(student1.toString());
        System.out.println(nauczyciel1.toString());
    }
}
