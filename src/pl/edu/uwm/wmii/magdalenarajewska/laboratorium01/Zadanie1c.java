package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

import java.lang.Math;

public class Zadanie1c {
    public static void main(String[] args) {
        int wynik = 0;
        int[] tablica = {7,11,35,-6, -9, -20, 0};
        for(int i =0; i<=6;i++){
            wynik += Math.abs(tablica[i]);
        }
        System.out.println(wynik);
    }
}
