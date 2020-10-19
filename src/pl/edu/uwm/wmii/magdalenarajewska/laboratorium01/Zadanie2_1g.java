package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

import java.util.Scanner;

public class Zadanie2_1g {
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
            if(tab[i] % 2  == 1 && tab[i] >= 0){
                ilosc = ilosc + 1;
            }

        }
        System.out.print("Ilosc liczb spełniających warunek: " + ilosc );
    }
}
