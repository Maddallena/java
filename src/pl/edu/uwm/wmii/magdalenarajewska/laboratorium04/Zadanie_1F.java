package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.util.Scanner;

public class Zadanie_1F {

    public static String change(String str){
        StringBuffer st = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                st.append(Character.toLowerCase(c));
            }
            else {
                st.append(Character.toUpperCase(c));
            }

        }
        str = st.toString();
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź napis: ");
        String napis = sc.nextLine();
        String napis2 = change(napis);
        System.out.println(napis2);
    }
}
