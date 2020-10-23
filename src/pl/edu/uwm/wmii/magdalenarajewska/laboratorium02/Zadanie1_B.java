package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1_B {
    public static void main(String[] args) {
        int iU = 0;
        int iD = 0;
        int iZ = 0;
        Random rand = new Random();
        System.out.println("Podaj ilość liczb: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = rand.nextInt((999 + 999) + 1) - 999;
            System.out.print(tab[i] + " | ");
            if (tab[i] < 0){
                iU = iU + 1;
            }
            if (tab[i] > 0){
                iD = iD + 1;
            }
            if (tab[i] == 0){
                iZ = iZ + 1;
            }
        }
        System.out.print("\nIlość liczb: \nujemnych: " + iU + "\ndodanich: " + iD + "\nzerowych: " + iZ );
    }
}
