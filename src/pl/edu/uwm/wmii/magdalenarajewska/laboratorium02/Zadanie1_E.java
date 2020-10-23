package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1_E {
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
        int wynik= 0;
        int wynikP= 0;
        int wynikG= 0;
        for (int j = 0; j < n; j++){
            if (tab[j] >= 0){
                wynik += 1;
            }

            if (tab[j] < 0 || j == n-1){
                wynikP = wynik;
                wynik = 0;
            }

            if (wynikG < wynikP){
                wynikG = wynikP;
            }
        }

        System.out.println("\nNajdłuższy ciąg liczb dodatnich ma długość: " + wynikG);
    }
}
