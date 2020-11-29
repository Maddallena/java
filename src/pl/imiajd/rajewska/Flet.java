package pl.imiajd.rajewska;

import java.time.LocalDate;

public class Flet extends Instrument{

    public Flet(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "Dźwięk fletu.";
    }

    @Override
    public String toString(){
        return "Flet: " +
                "producent: " + getProducent() +
                "rok produkcji: " + getRokProdukcji();
    }
}
