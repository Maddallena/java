package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1_D {
    public static void main(String[] args) {
        int sumaD = 0;
        int sumaU = 0;
        Random rand = new Random();
        System.out.println("Podaj ilość liczb: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = rand.nextInt((999 + 999) + 1) - 999;
            System.out.print(tab[i] + " | ");

            if(tab[i] > 0){
                sumaD += tab[i];
            }

            if(tab[i] < 0){
                sumaU += tab[i];
            }
        }

        System.out.print("\nSuma dodatnich liczb wynosi: " + sumaD + "\nSuma ujemnych liczb wynosi: " + sumaU);
    }
}
