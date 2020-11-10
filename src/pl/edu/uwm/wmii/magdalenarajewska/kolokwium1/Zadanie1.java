package pl.edu.uwm.wmii.magdalenarajewska.kolokwium1;

import java.util.Scanner;

public class Zadanie1 {

    public static int ileWop(int[] tab, int n) {
        int wop = 0; // wieksze od pieciu
        for (int i = 0; i < n; i++) {
            if (tab[i] > 5) {
                wop = +1;
            }
        }
        return wop;
    }

        public static int ileMop ( int[] tab, int n){
            int mop = 0; //mniejsze od  - pieciu
            for (int i = 0; i < n; i++) {
                if (tab[i] <-5){
                    mop = +1;
                }
            }
            return mop;
        }

        public static int ileMp ( int[] tab, int n){
            int mp = 0; // minus piatki
            for (int i = 0; i < n; i++) {
                if (tab[i] == -5) {
                    mp = +1;
                }
            }
            return mp;
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Podaj ilość elementów: ");
            int a = sc.nextInt();
            int[] tab = new int[a];

            System.out.print("Wprowadź " + a + " elementów: ");
            for(int i = 0; i <a; i++) {
                tab[i] = sc.nextInt();
            }
            System.out.println("Ilość liczb większych od 5: " + ileWop(tab,a) + "\nIlość liczb mniejszych od -5: " + ileMop(tab,a) + "\nIlość -5: " + ileMp(tab,a));
        }
    }

