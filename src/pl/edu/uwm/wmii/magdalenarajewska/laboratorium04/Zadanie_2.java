package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadanie_2 {

    public static int policz(String sciezka, char c) throws FileNotFoundException {
        int il = 0;
        StringBuffer nazwa = new StringBuffer();
        File plik = new File(sciezka);
        Scanner sc = new Scanner(plik);
        while (sc.hasNext()){
            nazwa.append(sc.next());
        }
        for(int i = 0; i < nazwa.length();i++){
            if (nazwa.charAt(i) == c){
                il += 1;
            }
        }
        return il;
    }
    public static void main(String[] args)throws FileNotFoundException{
        String sciezka = "C:\\Users\\Rajewski\\Desktop\\Magdalena_Rajewska\\src\\pl\\edu\\uwm\\wmii\\magdalenarajewska\\laboratorium04\\zad2.txt";

        Scanner sc = new Scanner(System.in);
        System.out.println("Który znak chcesz policzyć?: ");
        char z = sc.next().charAt(0);
        System.out.println(policz(sciezka, z));
    }
}
