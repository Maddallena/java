package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2_D {
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

    public static int sumaDodatnich(int[] tab){
        int sumaD = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0){
                sumaD += tab[i];
            }
        }
        return sumaD;
    }

    public static int sumaUjemnych(int[] tab){
        int sumaU = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < 0){
                sumaU += tab[i];
            }
        }
        return sumaU;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wpisz ile chcesz elementów tablicy: ");
        int n = sc.nextInt();
        int[] tablica = new int[n];
        generuj(tablica,n,-999,999);
        wypisz(tablica);

        System.out.print("\nSuma liczb dodatnich: " + sumaDodatnich(tablica)+ "\nSuma liczb ujemnych: " + sumaUjemnych(tablica));

    }
}
