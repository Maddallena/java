package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

public class Zadanie1a {
    public static void main(String[] args) {
        int wynik = 0;
        int[] tablica  = {-9,-5,3,7,-2,4,0,8,1};
        for(int i=0; i<=8; i++){
           wynik+=tablica[i];
        }
        System.out.println(wynik);
    }
}
