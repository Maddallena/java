package pl.edu.uwm.wmii.magdalenarajewska.laboratorium08;

import pl.imiajd.rajewska.Osoba8;
import pl.imiajd.rajewska.Pracownik8;
import pl.imiajd.rajewska.Student8;

import java.time.LocalDate;

public class Zadanie1 {
    public static void main(String[] args) {
        Osoba8[] ludzie = new Osoba8[3];
        ludzie[0] = new Pracownik8("Kowalski", new String[]{"Jan"}, LocalDate.of(1990,03,9),false, LocalDate.of(2012,01,12), 8000 );
        ludzie[1] = new Student8("Nowak", new String[]{"Małgorzata","Maria"}, LocalDate.of(1999,05,05), true, "informatyka");
        ludzie[2] = new Pracownik8("Sowizdrzał",new String[]{"Dyl"}, LocalDate.of(1300,04,01), false, LocalDate.of(1310,06,06), 10);

        ((Student8)ludzie[1]).setSredniaOcen(5.0);


        for (Osoba8 p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
            System.out.println(p.getImiona());

            if(p.getPlec() == true){
                System.out.println("kobieta");
            }
            else{
                System.out.println("mężczyzna");
            }
            System.out.println();
        }



    }
}
