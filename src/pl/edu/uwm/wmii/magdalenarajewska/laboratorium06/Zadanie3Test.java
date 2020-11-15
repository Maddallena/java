package pl.edu.uwm.wmii.magdalenarajewska.laboratorium06;

public class Zadanie3Test {
    public static void main(String[] args) {
        Pracownik[] personel = new Pracownik[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new Pracownik("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new Pracownik("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new Pracownik("Antoni Tester", 40000, 2005, 3, 15);

        // zwieksz pobory każdego pracownika o 20%
        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }

        // wypisz informacje o każdym pracowniku
        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tid = " + e.id());
            System.out.print("\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

        int n = Pracownik.getNextId(); // wywołanie metody statycznej
        System.out.println("Następny dostępny id = " + n);

    }
}
