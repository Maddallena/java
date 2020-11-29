package pl.edu.uwm.wmii.magdalenarajewska.laboratorium06;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerSet {
    boolean[] tab = new boolean[100];

    public void pokaz(){
        for(int i = 1; i< tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> union(boolean[] tab1, boolean[] tab2){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++) {
            if(tab1[i] == true && tab2[i] == false){
                arr.add(i);
            }
            if(tab1[i] == false && tab2[i] == true){
                arr.add(i);
            }
            if(tab1[i] == true && tab2[i] == true){
                arr.add(i);
            }
        }
        return arr;
    }

    public static ArrayList<Integer> intersection(boolean[] tab1, boolean[] tab2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            if (tab1[i] == true && tab2[i] == true){
                arr.add(i);
            }
        }
        return arr;
    }

    public void insertElement(int liczba){
        if(liczba > 0 && liczba < 100){
         tab[liczba] = true;
        }
    }

    public void deleteElement(int liczba){
        if(liczba > 0 && liczba < 100){
            tab[liczba] = false;
        }
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < tab.length; i++){
            if(tab[i] == true){
                str.append(i);
                str.append(" ");
            }
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        IntegerSet that = (IntegerSet) other;
        return Arrays.equals(tab, that.tab);
    }
    //equals jest z generatora (Alt + Insert)

}
