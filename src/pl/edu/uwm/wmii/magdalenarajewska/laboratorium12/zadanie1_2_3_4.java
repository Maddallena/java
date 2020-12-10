package pl.edu.uwm.wmii.magdalenarajewska.laboratorium12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class zadanie1_2_3_4 {

    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        ListIterator iter = pracownicy.listIterator();
        int p = 1;
        while (iter.hasNext()){
            iter.next();
            if (p % n == 0){
                iter.remove();
            }
            p++;
        }
    }

    public static <T> void wypisz(LinkedList<T> lista){
        ListIterator iter = lista.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        T p;
        ListIterator iterP = lista.listIterator();
        ListIterator iterK = lista.listIterator(lista.size());

        for(int i = 0; i< lista.size() / 2; i++){
            p = (T) iterP.next();
            iterP.set(iterK.previous());
            iterK.set(p);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> zadanie1 = new LinkedList<>();
        zadanie1.add("Pierwszy");
        zadanie1.add("Drugi");
        zadanie1.add("Trzeci");
        zadanie1.add("Czwarty");
        zadanie1.add("Piąty");
        zadanie1.add("Szósty");
        zadanie1.add("Siódmy");
        zadanie1.add("Ósmy");
        zadanie1.add("Dziewiąty");
        zadanie1.add("Dziesiąty");

        LinkedList<Integer> zadanie2 = new LinkedList<>();
        zadanie2.add(1);
        zadanie2.add(2);
        zadanie2.add(3);
        zadanie2.add(4);
        zadanie2.add(5);
        zadanie2.add(6);
        zadanie2.add(7);
        zadanie2.add(8);
        zadanie2.add(9);
        zadanie2.add(10);

        System.out.println("Lista 'zadanie1': ");
        wypisz(zadanie1);
        System.out.println("\nLista 'zadanie2': ");
        wypisz(zadanie2);
        System.out.println("\nLista zadanie1: ");
        redukuj(zadanie1, 3);
        wypisz(zadanie1);
        System.out.println("\nLista zadanie2: ");
        redukuj(zadanie2, 2);
        wypisz(zadanie2);
        System.out.println("\nLista zadanie2: ");
        System.out.println("\nZadnie4: ");
        odwroc(zadanie1);
        wypisz(zadanie1);
        System.out.println("\nZadnie4 dla listy int: ");
        odwroc(zadanie2);
        wypisz(zadanie2);
    }
}
