package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2_G {

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

    public static void odwrocFragment(int[] tab, int l, int p){
        int pomoc = 0;
        if ((p-l) % 2 == 0){
            for(int j = 0; j < (p -l)/2; j++){
                pomoc = tab[p - j];
                tab[p-j] = tab[l+j];
                tab[l+j] = pomoc;
            }
        }
        else{
            for(int j = 0; j < (p -l +1)/2; j++){
                pomoc = tab[p - j];
                tab[p-j] = tab[l+j];
                tab[l+j] = pomoc;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wpisz ile chcesz elementów tablicy: ");
        int n = sc.nextInt();
        int[] tablica = new int[n];
        generuj(tablica,n,-999,999);
        wypisz(tablica);

        System.out.println("\n Podaj wartośc lewą: ");
        int l = sc.nextInt();
        System.out.println("\n Podaj wartośc prawą: ");
        int p = sc.nextInt();
        while (l >p){
            System.out.println("\nWartość prawa ma być większa od lewej! Wpisz wartość p ponownie: ");
            p = sc.nextInt();
        }
        wypisz(tablica);

    }
}
