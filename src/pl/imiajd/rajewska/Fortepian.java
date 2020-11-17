package pl.imiajd.rajewska;

import java.time.LocalDate;

public class Fortepian extends Instrument{

    public Fortepian(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "Dźwięk fortepianu.";
    }

    public String toString(){
        return "Fortepian: " +
                "producent: " + getProducent() +
                "rok produkcji: " + getRokProdukcji();
    }
}
