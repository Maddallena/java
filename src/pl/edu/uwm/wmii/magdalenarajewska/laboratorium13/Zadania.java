package pl.edu.uwm.wmii.magdalenarajewska.laboratorium13;

public class Zadania implements Comparable{

    private int priority;
    private String descr;

    @Override
    public int compareTo(Object o) {
        Zadania przyklad = (Zadania)o;

        if(this.priority > przyklad.priority){
            return 1;
        }

        if(this.priority < przyklad.priority){
            return -1;
        }

        return 0;
    }

    public Zadania(int priority, String descr){
        this.priority = priority;
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "priorytet = " + priority + "; " +
                "opis: " + descr + "\n";
    }

    public int getPriority() {
        return priority;
    }

    public String getDescr() {
        return descr;
    }

}
