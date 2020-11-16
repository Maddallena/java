package pl.imiajd.rajewska;

import java.sql.SQLOutput;
import java.util.Objects;

public class Adres {
    private String ulica;
    private String numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, String numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, String numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        System.out.println(kod_pocztowy + " " + miasto);
        if(numer_mieszkania != 0){
            System.out.println(ulica + " " + numer_domu + " m. " + numer_mieszkania );
        }
        else {
            System.out.println(ulica + " " + numer_domu);
        }
    }


    public boolean przed(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adres adres = (Adres) o;
        return Objects.equals(kod_pocztowy, adres.kod_pocztowy);
    }

}
