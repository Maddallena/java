package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;
import java.lang.Math;
import java.util.Scanner;

public class Zadanie2_1e {

    public static int silnia (int n){
        int wynik = 0;
        for(int a= 0; a <= n; a++){
            wynik *= a;
        }
        return wynik;
    }

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
            double warun = Math.pow(2,i)  ;
            if(i >= 1 && warun < tab[i] && tab[i]<silnia(i)){
                ilosc = ilosc + 1;
            }
            else {
                System.out.println("Żadna licznba nie spełnia warunku.");
            }
        }
        System.out.print("Ilosc liczb spełniających warunek: " + ilosc );
    }
}
