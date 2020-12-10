package pl.edu.uwm.wmii.magdalenarajewska.laboratorium12;

import java.util.ArrayList;
import java.util.LinkedList;

public class zadanie8 {
    public static <T extends Iterable> void print(T lista){
        for (Object p: lista){
            System.out.print(p + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Pierwszy");
        ll1.add("Drugi");
        ll1.add("Trzeci");
        ll1.add("Czwarty");
        ll1.add("Piąty");
        ll1.add("Szósty");
        ll1.add("Siódmy");
        ll1.add("Ósmy");
        ll1.add("Dziewiąty");
        ll1.add("Dziesiąty");

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);
        ll2.add(4);
        ll2.add(5);
        ll2.add(6);
        ll2.add(7);
        ll2.add(8);
        ll2.add(9);
        ll2.add(10);

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(0);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(7);
        ar.add(8);
        ar.add(9);

        print(ll1);
        print(ll2);
        print(ar);
    }

}
