package pl.edu.uwm.wmii.magdalenarajewska.laboratorium06;

public class Zadanie1Test {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000.00);
        RachunekBankowy saver2 = new RachunekBankowy(3000.00);
        saver1.rocznaStopaProcentowa = 0.04;
        System.out.println("Oszczędności Saver1 wynosiły: " + saver1.obliczMiesieczneOdsteki());
        saver2.rocznaStopaProcentowa = 0.04;
        System.out.println("Oszczędności Saver2 wynosiły: " + saver2.obliczMiesieczneOdsteki());
        saver1.rocznaStopaProcentowa = 0.05;
        System.out.println("Oszczędności Saver1 wynosiły: " + saver1.obliczMiesieczneOdsteki());
        saver2.rocznaStopaProcentowa = 0.05;
        System.out.println("Oszczędności Saver2 wynosiły: " + saver2.obliczMiesieczneOdsteki());

    }
}
