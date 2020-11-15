package pl.edu.uwm.wmii.magdalenarajewska.laboratorium06;

public class RachunekBankowy {

    private double saldo;
    static double rocznaStopaProcentowa;


    public RachunekBankowy(double saldo){
        this.saldo = saldo;
    }

    public static void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
        RachunekBankowy.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    public float obliczMiesieczneOdsteki(){

        double wynik = this.saldo * this.rocznaStopaProcentowa / 12;
        this.saldo = (this.saldo + wynik);
        return (float) saldo;

    }
}
