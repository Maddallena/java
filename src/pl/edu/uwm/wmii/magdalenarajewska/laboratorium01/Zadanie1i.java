package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;
import java.lang.Math;
import java.util.Scanner;

public class Zadanie1i {
    static int silnia (int n){
        int wynik = 1;
        if (n == 0){
            return wynik;
        }
        for(int i = 1; i <= n; i++){
          wynik *= i;
        }
        return wynik;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        double a = sc.nextDouble();
        double result;
        double suma = 0;
        for(int i = 1; i<=a; i++){
            result = (Math.pow(-1,i)*i)/silnia(i);
            suma = suma + result;
        }

        System.out.println(suma);
        }
    }

