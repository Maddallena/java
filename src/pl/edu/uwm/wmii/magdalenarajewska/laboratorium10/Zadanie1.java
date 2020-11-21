package pl.edu.uwm.wmii.magdalenarajewska.laboratorium10;

import pl.imiajd.rajewska.Osoba10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Zadanie1 {
    public static void main(String[] args) {
        ArrayList<Osoba10> grupa = new ArrayList<>();
        grupa.add(new Osoba10("Sęndrowski", LocalDate.of(1998,5,22)));
        grupa.add(new Osoba10("Baran", LocalDate.of(1999,5,19)));
        grupa.add(new Osoba10("Kochański", LocalDate.of(1996,9,13)));
        grupa.add(new Osoba10("Rajewska", LocalDate.of(1997,7,29)));
        grupa.add(new Osoba10("Czosnek", LocalDate.of(1990,1,9)));
        grupa.add(new Osoba10("Czosnek", LocalDate.of(1997,7,29)));
        grupa.add(new Osoba10("Rajewska", LocalDate.of(1990,1,9)));
        Collections.sort(grupa);
        for(int i = 0; i< grupa.size();i++){
            System.out.println( grupa.get(i).toString());
        }
    }
}
