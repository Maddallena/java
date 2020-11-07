package pl.edu.uwm.wmii.magdalenarajewska.laboratorium05;

import java.util.ArrayList;

public class Zadanie1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        wynik.addAll(a);
        wynik.addAll(b);
        return wynik;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(8);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(3);
        b.add(5);
        b.add(7);
        System.out.println(append(a,b));
    }
}
