package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2_E {
    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(maxWartosc - minWartosc +1)+ minWartosc;
        }
    }

    public static void wypisz(int[] tab){
        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " | ");
        }
    }

    public static int dlugoscMaksymalnaCiaguDodatnich(int[] tab){
        int wynik= 0;
        int wynikP= 0;
        int wynikG= 0;
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] >= 0) {
                wynik += 1;
            }

            if (tab[j] < 0 || j == tab.length - 1) {
                wynikP = wynik;
                wynik = 0;
            }

            if (wynikG < wynikP) {
                wynikG = wynikP;
            }
        }
        return wynikG;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wpisz ile chcesz elementów tablicy: ");
        int n = sc.nextInt();
        int[] tablica = new int[n];
        generuj(tablica,n,-999,999);
        wypisz(tablica);

        System.out.print("\nMaksymalna długość dodatniego ciągu wynosi: " + dlugoscMaksymalnaCiaguDodatnich(tablica));

    }
}
