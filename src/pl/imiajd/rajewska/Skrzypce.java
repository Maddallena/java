package pl.imiajd.rajewska;

import java.time.LocalDate;

public class Skrzypce extends Instrument {

    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "Dźwięk skrzypiec.";
    }

    public String toString(){
        return "Skrzypce: " +
                "producent: " + getProducent() +
                "rok produkcji: " + getRokProdukcji();
    }
}
