package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.util.Scanner;

public class Zadanie_1D {
    public static String repeat(String str, int n){
        String powtorz = str.repeat(n);
        return powtorz;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź napis: ");
        String napis = sc.nextLine();
        System.out.println("Ile razy go powtórzyć?: ");
        int a = sc.nextInt();
        String zm = repeat(napis, a);
        System.out.print(zm);
    }
}
