package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1_F {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Podaj ilość liczb: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = rand.nextInt((999 + 999) + 1) - 999;
            System.out.print(tab[i] + " | ");
        }
        System.out.print("\nTablica po zmianie: \n");
        for(int j = 0; j < tab.length; j++){
            if (tab[j] > 0){
                tab[j] = 1;
            }

            if (tab[j] < 0){
                tab[j] = -1;
            }
            System.out.print(tab[j] + " | ");
        }
    }
}
