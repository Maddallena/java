package pl.edu.uwm.wmii.magdalenarajewska.laboratorium12;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class zadanie7 {

    public static <T> void wypisz(LinkedList<T> lista){
        ListIterator iter = lista.listIterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Podaj granicę liczb pierwszych: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> pierwsze = new LinkedList<>();
        for(int i = 2; i <= n; i++){
            pierwsze.add(i);
        }


        int p;
        for(int i = 2; i <= Math.sqrt(n); i++){
            ListIterator iter = pierwsze.listIterator();
            while (iter.hasNext()) {
                p = (int) iter.next();
                if (p % i == 0 && p != i) {
                    iter.remove();
                }
            }
        }
        wypisz(pierwsze);
    }

}
