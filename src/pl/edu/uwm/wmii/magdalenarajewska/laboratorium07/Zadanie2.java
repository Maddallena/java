package pl.edu.uwm.wmii.magdalenarajewska.laboratorium07;

import pl.imiajd.rajewska.Adres;

public class Zadanie2 {
    public static void main(String[] args) {
        Adres adres1 = new Adres("Wiejska", "11", "Warszawa", "00480");
        adres1.pokaz();
        System.out.println();
        Adres adres2 = new Adres("Kredytowa", "2", 13, "Płock", "09400");
        adres2.pokaz();

        System.out.println(adres2.przed(adres1));



    }
}
