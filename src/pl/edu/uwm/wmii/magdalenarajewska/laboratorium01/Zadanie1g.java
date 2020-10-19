package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

public class Zadanie1g {
    public static void main(String[] args) {
        int wynik = 0;
        int wynik2 = 1;
        int[] tablica = {7,11,35,-6, -9, -20, 15};
        for(int i =0; i<=6;i++){
            wynik += tablica[i];
        }
        for(int i =0; i<=6;i++){
            wynik2 *= tablica[i];
        }
        System.out.print("Suma wynosi: " +wynik + "\nIloczyn wynosi: " + wynik2);
    }
}
