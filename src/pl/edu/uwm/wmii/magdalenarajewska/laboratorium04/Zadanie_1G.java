package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.util.Scanner;

public class Zadanie_1G {
    public static String nice(String str){
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        StringBuffer st = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            if(i % 3 == 0 && i != 0){
                st.append("'");
                st.append(s.charAt(i));
            }
            else{
               st.append(s.charAt(i));
            }
        }
       str = st.reverse().toString();
        return str;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź napis: ");
        String napis = sc.nextLine();
        String napis2 = nice(napis);
        System.out.println(napis2);

    }
}
