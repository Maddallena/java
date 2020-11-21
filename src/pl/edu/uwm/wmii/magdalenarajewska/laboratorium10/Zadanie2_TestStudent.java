package pl.edu.uwm.wmii.magdalenarajewska.laboratorium10;

import pl.imiajd.rajewska.Osoba10;
import pl.imiajd.rajewska.Student10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Zadanie2_TestStudent {
    public static void main(String[] args) {
        ArrayList<Osoba10> grupa = new ArrayList<>();
        grupa.add(new Student10("Sęndrowski", LocalDate.of(1998,5,22), 4.5));
        grupa.add(new Student10("Baran", LocalDate.of(1999,5,19), 3.5));
        grupa.add(new Student10("Kochański", LocalDate.of(1996,9,13), 5.0));
        grupa.add(new Student10("Rajewska", LocalDate.of(1997,7,29), 4.0));
        grupa.add(new Student10("Czosnek", LocalDate.of(1990,1,9),3.1));
        grupa.add(new Student10("Czosnek", LocalDate.of(1997,7,29),3.2));
        grupa.add(new Student10("Rajewska", LocalDate.of(1990,1,9),3.4));
        Collections.sort(grupa);
        for(int i = 0; i< grupa.size();i++){
            System.out.println( grupa.get(i).toString());
        }
    }
}
