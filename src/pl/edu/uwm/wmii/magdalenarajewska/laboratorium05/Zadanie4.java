package pl.edu.uwm.wmii.magdalenarajewska.laboratorium05;
import java.util.*;
public class Zadanie4 {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int rozm = a.size();
        for(int i = rozm - 1; i >= 0; i-- ){
            arr.add(a.get(i));
        }
        return arr;
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
        ar.add(9);
        System.out.println(ar);
        System.out.println(reversed(ar));

    }
}
