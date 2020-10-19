package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

import java.util.Scanner;

public class Zadanie2_1b {
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
            if(tab[i] % 3 == 0 && tab[i] % 5 != 0){
                ilosc ++;
            }

        }
        System.out.print("Ilosc liczb podzielnych przez 3 i niepodzielnych przez 5 w tablicy to: " + ilosc );
    }
}
