package pl.edu.uwm.wmii.magdalenarajewska.laboratorium02;


import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {

    public static void generuj(int[][] tab, int m, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                tab[i][j] = r.nextInt(maxWartosc - minWartosc +1)+ minWartosc;
            }
        }
    }

    public static void wypisz(int[][] tab, int m, int n){
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++) {
                System.out.print(tab[i][j] + " | ");
            }

            System.out.println();
        }
    }

    public static int[][] iloczynM(int[][]tabA, int[][]tabB, int m, int n, int k){
        int[][] tabC = new int[m][k];
        int sum = 0;
        int r;
        for(int q = 0; q < m; q++){
            for(r = 0; r < k; r++){
                for(int p = 0; p < n; p++){
                    sum = sum + (tabA[q][p] * tabB[p][r]);

                }
                tabC[q][r] = sum;
                sum = 0;
            }
            r = 0;
        }
        return tabC;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj m: ");
        int m = sc.nextInt();
        System.out.println("Podaj n: ");
        int n = sc.nextInt();
        System.out.println("Podaj k: ");
        int k = sc.nextInt();

        int[][] tabA = new int[m][n];
        int[][] tabB = new int[n][k];
        generuj(tabA,m,n,0,10);
        generuj(tabB,n,k,0,10);
        System.out.print("\nTablica A:\n");
        wypisz(tabA,m,n);
        System.out.print("\nTablica B:\n");
        wypisz(tabB,n,k);

        System.out.print("\nTablica C:\n");
        int[][] tabC = iloczynM(tabA, tabB, m, n, k);
        wypisz(tabC,m,k);

    }
}
