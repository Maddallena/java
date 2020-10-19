package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;
import java.util.Scanner;
import java.lang.Math;


public class Zadanie1h {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac liczbe: ");
        double a = scanner.nextDouble();
        double suma = 0;
        for (int i = 1; i<=a; i++) {
            suma = suma + ((int)Math.pow(-1,i+1)*i);
        }
        System.out.println(suma);
    }
}
