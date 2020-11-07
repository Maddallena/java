package pl.edu.uwm.wmii.magdalenarajewska.laboratorium05;

import java.util.ArrayList;
import java.util.Iterator;

public class Zadanie2 {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> nowa = new ArrayList<Integer>();

        Iterator<Integer> c = a.listIterator();
        Iterator<Integer> d = b.listIterator();
        while (c.hasNext() || d.hasNext()) {
            if(c.hasNext()) {
                nowa.add(c.next());
            }
            if(d.hasNext()) {
                nowa.add(d.next());
            }
        }

        return nowa;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(5);
        b.add(5);
        b.add(5);
        b.add(5);
        b.add(5);
        b.add(5);

        System.out.println(merge(a,b));
    }
}
