package pl.imiajd.rajewska;

import java.time.LocalDate;

public abstract class Osoba8 {

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba8(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String getImiona() {
        StringBuffer im = new StringBuffer();
        for(int i = 0; i< imiona.length; i++){
            im.append(imiona[i]);
            im.append(" ");
        }
        return im.toString();
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean getPlec() {
        return plec;
    }

}
