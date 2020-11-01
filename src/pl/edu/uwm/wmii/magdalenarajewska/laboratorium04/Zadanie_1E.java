package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.util.Scanner;

public class Zadanie_1E {
    public static int[] where(String str, String subStr){
        int[] tab = new int[str.length()];
        int j = 0;
        int liczba = 0;
        int liczba2= 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == subStr.charAt(0) && i + subStr.length() - 1 < str.length()) {
                for (int q = 0; q < subStr.length() ;q++) {
                    if(str.charAt(i+q) == subStr.charAt(q)){
                        liczba2 += 1;
                        tab[j] = i+q;
                        j += 1;
                    }
                }
                if(liczba2 == subStr.length()){
                    liczba += 1;
                }
                liczba2 =0;
            }
        }
        return tab;
    }

    public static void wypisz(int tab[]){
        for(int i =0; i<tab.length; i++){
            System.out.print(tab[i] + " | ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź napis dłuższy: ");
        String napis = sc.nextLine();
        System.out.println("Wprowadź napis krótszy: ");
        String napis2 = sc.nextLine();
        int[] zm = where(napis, napis2);
        wypisz(zm);

    }
}
