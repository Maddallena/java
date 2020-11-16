package pl.edu.uwm.wmii.magdalenarajewska.laboratorium07;
import pl.imiajd.rajewska.*;
public class Zadanie1 {
    public static void main(String[] args)
    {
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();

        Punkt b = new Punkt(3, 5);
        b.show();

        Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();

        //a = b;               //  --- powoduje błąd kompilacji  (dlaczego ?)
        //a = (NazwanyPunkt) b;  //   --- powoduje błąd wykonania   (dlaczego ?)

        //a = c;                 //--- powoduje błąd kompilacji  (dlaczego ?)
        a = (NazwanyPunkt) c;
        a.show();
    }
}