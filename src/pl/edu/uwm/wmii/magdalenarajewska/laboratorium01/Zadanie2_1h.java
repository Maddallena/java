package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;
import java.lang.Math;
import java.util.Scanner;

public class Zadanie2_1h {
    public static void main(String[] args) {
        int ilosc = 0;
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz ilosc elementow: ");
        int a = scan.nextInt();
        int [] tab = new int[a];
        System.out.println("Wprowadz " + a + " elementow: ");
        for (int i = 0; i < a; i++){
            tab[i] = scan.nextInt();
        }
        for (int i = 0; i < a; i++ ){
            b = Math.abs(tab[i]);
            if(b < Math.pow(i,2)){
                ilosc = ilosc + 1;
            }
        }
        System.out.print("Ilosc liczb spełniających warunek: " + ilosc );
    }
}
