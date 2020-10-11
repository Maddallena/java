package pl.edu.uwm.wmii.magdalenarajewska.laboratorium00;

public class Zadanie4 {
    public static void main(String[] args) {
        double kwota = 1000;
        double procent = 0.06;
        for (int i=1; i<=3; i++){
           kwota = kwota + kwota*procent;
           System.out.println("Saldo konta wynosi: " + kwota + " PLN" + " po " + i + " roku.");
        }
    }
}
