package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1_A {
    public static void main(String[] args){
        int parzyste = 0;
        int nieparzyste = 0;
        Random rand = new Random();
        System.out.println("Podaj ilość liczb: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab = new int[n];
        for(int i = 0; i < n; i++){
            tab[i] = rand.nextInt((999 + 999) + 1 )- 999;
            System.out.print(tab[i] + " | ");
            if (tab[i] % 2 == 0){
                parzyste = parzyste + 1;
            }
            else{
                nieparzyste = nieparzyste +1;
            }
        }
        System.out.print("\nIlosc liczb parzystych w tablicy: " + parzyste + "\nIlość liczb nieparzystych w tablicy: " + nieparzyste);
    }
}
