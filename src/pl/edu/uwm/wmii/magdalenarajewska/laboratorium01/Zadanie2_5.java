package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

import java.util.Scanner;

public class Zadanie2_5 {
    public static void main(String[] args){
        int wynik = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj ilość elementów: ");
        int a = scan.nextInt();
        int[] tab = new int[a];

        System.out.print("Wprowadź " + a + " elementów: ");
        for(int i = 0; i <a; i++) {
            tab[i] = scan.nextInt();
        }

        for(int i = 0; i< a-1; i++){
            if(tab[i]>0 && tab[i+1]>0){
                wynik = wynik +1;
            }
        }
        System.out.print("Ilość par wynosi: "+ wynik);
    }
}
