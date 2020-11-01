package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.util.Scanner;

public class Zadanie_1A {

    public static int countChar(String str, char c){
        int il = 0;
        for(int i = 0; i < str.length();i++){
            if (str.charAt(i) == c){
                il += 1;
            }
        }
        return il;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź napis: ");
        String napis = sc.nextLine();
        System.out.println("Którą literę chcesz policzyć?: ");
        char c = sc.next().charAt(0);

        int zm = countChar(napis, c);
        System.out.print("Ilość pojawienia się wybranego znaku: " + zm);
    }

}
