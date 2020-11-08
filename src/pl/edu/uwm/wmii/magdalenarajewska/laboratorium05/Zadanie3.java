package pl.edu.uwm.wmii.magdalenarajewska.laboratorium05;

import java.util.*;


public class Zadanie3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(a);
        arr.addAll(b);
        Collections.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<Integer>();
        no.add(0);
        no.add(2);
        no.add(4);
        no.add(0);
        ArrayList<Integer> no2 = new ArrayList<>();
        no2.add(5);
        no2.add(3);
        no2.add(8);
        no2.add(7);
        no2.add(4);
        System.out.println(mergeSorted(no, no2));
    }
}
