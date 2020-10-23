package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1_C {
    public static void main(String[] args) {
        int nw = 0;
        int ir = 0;
        Random rand = new Random();
        System.out.println("Podaj ilość liczb: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = rand.nextInt((999 + 999) + 1) - 999;
            System.out.print(tab[i] + " | ");
            if (tab[i] > nw){
                nw = tab[i];
            }
        }
        for(int j = 0; j < tab.length; j++){
            if(nw == tab[j]){
                ir = ir + 1;
            }
        }

        System.out.print("\n" + nw);
        System.out.print("\nTyle razy występuje największa liczba: " + ir);
    }
}
