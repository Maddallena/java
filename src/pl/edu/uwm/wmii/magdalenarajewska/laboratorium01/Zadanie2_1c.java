package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

import java.util.Scanner;
import java.lang.Math;

public class Zadanie2_1c {
    public static void main(String[] args) {
        int ilosc = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow: ");
        int a = scan.nextInt();
        int [] tab = new int[a];
        System.out.println("Wprowadz " + a + " elementow: ");
        for (int i = 0; i < a; i++){
            tab[i] = scan.nextInt();
        }
        for (int i = 0; i < a; i++ ){
            if(Math.sqrt(tab[i]) % 2 == 0){
                ilosc ++;
            }

        }
        System.out.print("Ilosc liczb, bedacych kwadratami liczby parzystej: " + ilosc );
    }
}
