package pl.edu.uwm.wmii.magdalenarajewska.kolokwium2.imiajd.rajewska;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void wypisz(ArrayList<?> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println();
    }

    public static <T> void wypiszlinked(LinkedList<T> lista){
        ListIterator iter = lista.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println();
    }

    public static void redukuj(LinkedList<String> komputery, int n){
        ListIterator iter = komputery.listIterator();
        int p = 1;
        while (iter.hasNext()){
            iter.next();
            if (p % n == 0){
                iter.remove();
            }
            p++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Komputer> listaKomputerow = new ArrayList<>();
        listaKomputerow.add(new Komputer("Toshiba", LocalDate.of(2015,05,16)));
        listaKomputerow.add(new Komputer("Lenovo", LocalDate.of(2019,10,4)));
        listaKomputerow.add(new Komputer("Apple", LocalDate.of(2019,10,4)));
        listaKomputerow.add(new Komputer("Toshiba", LocalDate.of(2010,2,23)));
        listaKomputerow.add(new Komputer("Asus", LocalDate.of(2017,9,14)));

        System.out.println("Zadanie1_komputery, nieposortowane: \n");
        wypisz(listaKomputerow);

        Collections.sort(listaKomputerow);

        System.out.println("Zadanie1_komputery, posortowane: \n");

        wypisz(listaKomputerow);

        System.out.println("Zadani1_laptopy: \n");

        ArrayList<Laptop> laptopy = new ArrayList<>();
        laptopy.add(new Laptop("Toshiba", LocalDate.of(2019, 3, 15), false));
        laptopy.add(new Laptop("Lenovo", LocalDate.of(2020, 03, 13),false));
        laptopy.add(new Laptop("HP", LocalDate.of(2016, 6, 13), false));
        laptopy.add(new Laptop("Apple", LocalDate.of(2016, 6, 13),true));
        laptopy.add(new Laptop("Asus", LocalDate.of(2020, 03, 13),false));
        laptopy.add(new Laptop("Toshiba", LocalDate.of(2013,4,1), false));

        wypisz(laptopy);
        Collections.sort(laptopy);
        wypisz(laptopy);

        System.out.println("Zadanie 2 cała lista: \n");
        LinkedList<String> komputery = new LinkedList<>();
        komputery.add("Toshiba");
        komputery.add("Dell");
        komputery.add("Apple");
        komputery.add("Lenovo");
        komputery.add("HP");
        komputery.add("LG");
        komputery.add("Samsung");
        komputery.add("Microsoft");
        komputery.add("Lenovo");
        komputery.add("Epson");
        komputery.add("Canon");

        wypiszlinked(komputery);

        System.out.println("Zadanie 2 po użyciu metody redukuj:");
        redukuj(komputery, 2);
        wypiszlinked(komputery);
    }
}
