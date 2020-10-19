package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

import java.util.Scanner;

public class Zadanie2_2 {
    public static void main(String[] args){
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow: ");
        int a = scan.nextInt();
        int [] tab = new int[a];
        System.out.println("Wprowadz " + a + " elementow: ");
        for (int i = 0; i < a; i++){
            tab[i] = scan.nextInt();
        }
        for (int i = 0; i < a; i++ ){
            if(tab[i]>0){
                sum += tab[i];
            }
        }
        System.out.print("Ilosc liczb spełniających warunek: " + 2*sum );
    }
}


