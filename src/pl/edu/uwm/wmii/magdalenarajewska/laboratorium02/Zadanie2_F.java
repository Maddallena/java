package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2_F {

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

    public static void signum(int[] tab){
        System.out.print("\n");
        for(int j = 0; j < tab.length; j++) {
            if (tab[j] > 0) {
                tab[j] = 1;
            }

            if (tab[j] < 0) {
                tab[j] = -1;
            }
            System.out.print(tab[j] + " | ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wpisz ile chcesz elementów tablicy: ");
        int n = sc.nextInt();
        int[] tablica = new int[n];
        generuj(tablica,n,-999,999);
        wypisz(tablica);

        signum(tablica);

    }
}
