package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.util.Scanner;

public class Zadanie_1H {
    public static String nice(String str, String c, int n){
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        StringBuffer st = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            if(i % n == 0 && i != 0){
                st.append(c);
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
        String na = sc.nextLine();
        System.out.println("Wprowadź separator: ");
        String c = sc.nextLine();
        System.out.println("Podaj liczbę pozycji między separatorami:");
        int n = sc.nextInt();
        String np2 = nice(na,c,n);
        System.out.println(np2);
    }
}
