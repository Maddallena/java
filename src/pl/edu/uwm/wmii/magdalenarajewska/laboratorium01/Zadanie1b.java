package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

public class Zadanie1b {
    public static void main(String[] args) {
        int wynik = 1;
        int[] tablica = new int[7];
        tablica[0]=9;
        tablica[1]=7;
        tablica[2]=5;
        tablica[3]=3;
        tablica[4]=1;
        tablica[5]=8;
        tablica[6]=10;
        for(int i=0; i<7;i++){
            wynik= wynik * tablica[i];
        }
        System.out.println(wynik);
    }
}
