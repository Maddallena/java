package pl.edu.uwm.wmii.magdalenarajewska.laboratorium08;

import pl.imiajd.rajewska.Flet;
import pl.imiajd.rajewska.Fortepian;
import pl.imiajd.rajewska.Instrument;
import pl.imiajd.rajewska.Skrzypce;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Skrzypce("Stradivarius", LocalDate.of(2015,02,23)));
        orkiestra.add(new Fortepian("Petrof", LocalDate.of(2018,06,14)));
        orkiestra.add(new Flet("Dimavery", LocalDate.of(2010,12,06)));
        orkiestra.add(new Skrzypce("Stradivarius", LocalDate.of(2013,02,23)));
        orkiestra.add(new Fortepian("Zimmermann", LocalDate.of(2012,06,14)));

        for(int i = 0; i< orkiestra.size(); i++){
            System.out.println(orkiestra.get(i).dzwiek());
        }
        for(int j = 0; j < orkiestra.size(); j++){
            System.out.println(orkiestra.get(j).toString());
        }


    }

}
