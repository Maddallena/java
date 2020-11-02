package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.math.BigInteger;
import java.util.Scanner;

public class Zadanie_4 {
    public static BigInteger szachownica(int n){
        BigInteger wynik = new BigInteger("1");
        BigInteger dod = new BigInteger("0");
        BigInteger czynnik = new BigInteger("2");
        for(int i = 0; i < n; i++){
            for(int q = 0; q < n; q++){
                if(i % 2 == 0 && q % 2 == 0){
                    dod = dod.add(wynik);
                    wynik = wynik.multiply(czynnik);
                }
                if(i % 2 != 0 && q % 2 != 0){
                    dod = dod.add(wynik);
                    wynik = wynik.multiply(czynnik);
                }
            }
        }
        return dod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz rozmiar szachownicy: ");
        int n = sc.nextInt();
        BigInteger wyn = szachownica(n);
        System.out.println("Suma ziarenek maku na szachownicy wynosi: " + wyn);
    }
}
