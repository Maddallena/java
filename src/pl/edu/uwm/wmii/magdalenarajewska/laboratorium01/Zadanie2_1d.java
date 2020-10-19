package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

import java.util.Scanner;

public class Zadanie2_1d {
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
        for (int i = 0; i < a-1; i++ ){
            if(i > 1 && tab[i]<(tab[i-1]+tab[i+1])/2){
                ilosc = ilosc +1;
            }

        }
        System.out.print("Ilosc liczb spełniających warunek: " + ilosc );
    }
}
