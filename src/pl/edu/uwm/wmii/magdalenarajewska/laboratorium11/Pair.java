package pl.edu.uwm.wmii.magdalenarajewska.laboratorium11;

public class Pair<T> {
    public Pair() {
        first = null;
        second = null;
    }

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }

    private T first;
    private T second;

    public void swap(){
        T temp = first;
        this.first = second;
        this.second = temp;
    }
}
