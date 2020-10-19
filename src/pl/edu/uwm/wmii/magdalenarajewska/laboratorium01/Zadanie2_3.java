package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

import java.util.Scanner;

public class Zadanie2_3 {
    public static void main(String[] args){
        int liczD = 0;
        int liczU = 0;
        int liczZ = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj ilość elementów: ");
        int a = scan.nextInt();
        int[] tab = new int[a];

        System.out.print("Wprowadź " + a + " elementów: ");
        for(int i = 0; i <a; i++) {
            tab[i] = scan.nextInt();
        }
        for(int i = 0; i <a; i++){
            if(tab[i] > 0){
                liczD = liczD + 1;
            }
            else if (tab[i]<0){
                liczU = liczU + 1;
            }
            else if (tab[i]==0){
                liczZ = liczZ + 1;
            }
        }
        System.out.print("Ilość liczb dodatnich wynosi: " + liczD + "\n Ilość liczb ujemnych wynosi: " + liczU + "\n Ilość 0 wynosi: " + liczZ);
    }
}
