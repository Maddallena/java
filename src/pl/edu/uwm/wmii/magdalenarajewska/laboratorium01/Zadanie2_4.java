package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

import java.util.Scanner;

public class Zadanie2_4 {

    static int Max(int[] tab, int n){
        int wynik = tab[0];
        for(int i = 1; i < n ; i++){
            if(tab[i]>wynik){
                wynik = tab[i];
            }
        }
        return wynik;
    }

    static int Min(int[] tab, int n){
        int wynik1 = tab[0];
        for(int i = 1; i < n ; i++){
            if(tab[i]<wynik1){
                wynik1 = tab[i];
            }
        }
        return wynik1;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj ilość elementów: ");
        int a = scan.nextInt();
        int[] tab = new int[a];

        System.out.print("Wprowadź " + a + " elementów: ");
        for(int i = 0; i <a; i++) {
            tab[i] = scan.nextInt();
        }

        System.out.print("Największą liczbą jest: " + Max(tab,a) + "\nNajmniejszą liczbą jest: " + Min(tab,a));
    }
}
