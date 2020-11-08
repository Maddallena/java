package pl.edu.uwm.wmii.magdalenarajewska.laboratorium05;
import java.util.*;

public class Zadanie5 {

    public static void reverse (ArrayList<Integer> a){
        for(int i = 0;i < a.size()/2; i++){
            int el = a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, el);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
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

        System.out.println(ar);
        reverse(ar);
    }
}
