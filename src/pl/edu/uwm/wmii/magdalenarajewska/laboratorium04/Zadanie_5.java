package pl.edu.uwm.wmii.magdalenarajewska.laboratorium04;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie_5 {
    public static BigDecimal bank(BigDecimal k, BigDecimal p, int n){
        BigDecimal kap = k;
        for(int i = 0; i < n; i++ ){
            kap = kap.add(kap.multiply(p));
        }
        return kap.setScale(2, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź kapitał: ");
        BigDecimal k = sc.nextBigDecimal();
        System.out.println("Wprowadż procent: ");
        BigDecimal p = sc.nextBigDecimal();
        System.out.println("Wprowadź na ile lat: ");
        int n = sc.nextInt();
        System.out.println("Po " + n + " latach, Twój kapitał wynosi " + bank(k,p,n));
    }
}
