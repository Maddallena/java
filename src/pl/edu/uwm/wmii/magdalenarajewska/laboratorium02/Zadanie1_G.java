package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1_G {
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

        System.out.println("\n Podaj wartośc lewą: ");
        int l = scan.nextInt();
        System.out.println("\n Podaj wartośc prawą: ");
        int p = scan.nextInt();
        int pomoc = 0;
        while (l >p){
            System.out.println("\nWartość prawa ma być większa od lewej! Wpisz wartość p ponownie: ");
            p = scan.nextInt();
        }

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
        for(int q = 0; q < n; q++){
            System.out.print(tab[q] + " | ");
        }
    }
}
