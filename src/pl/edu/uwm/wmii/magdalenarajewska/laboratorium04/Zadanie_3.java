package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie_3 {
    public static int policz(String sciezka, String wyraz) throws FileNotFoundException {
        int il = 0;
        StringBuffer tekst = new StringBuffer();
        File plik = new File(sciezka);
        Scanner sc = new Scanner(plik);
        while (sc.hasNext()) {
            tekst.append(sc.next());

            if (tekst.toString().equals(wyraz)) {
                il += 1;
            }
            tekst.delete(0,tekst.length());
        }

        return il;
    }

    public static void main(String[] args)throws FileNotFoundException{
        String sciezka = "C:\\Users\\Rajewski\\Desktop\\Magdalena_Rajewska\\src\\pl\\edu\\uwm\\wmii\\magdalenarajewska\\laboratorium04\\zad2.txt";

        Scanner sc = new Scanner(System.in);
        System.out.println("Który wyraz chcesz policzyć?: ");
        String wyraz = sc.nextLine();
        System.out.println(policz(sciezka, wyraz));
    }
}
