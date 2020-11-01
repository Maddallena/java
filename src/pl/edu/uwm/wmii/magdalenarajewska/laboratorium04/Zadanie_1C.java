package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.util.Scanner;

public class Zadanie_1C {

    public static String middle(String str){
        int dlugosc = str.length();
        int srodek = dlugosc/2;
        String a = "";
        if (dlugosc%2 == 0){
            a += str.charAt(srodek-1);
            a += str.charAt(srodek);
        }
        else{
            a += str.charAt(srodek);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź napis: ");
        String napis = sc.nextLine();
        String zm = middle(napis);
        System.out.println(zm);
    }
}
