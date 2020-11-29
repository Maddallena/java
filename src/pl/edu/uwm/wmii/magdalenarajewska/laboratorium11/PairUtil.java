package pl.edu.uwm.wmii.magdalenarajewska.laboratorium11;

public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> object){
        Pair<T> temp = new Pair<>();
        temp.setFirst(object.getSecond());
        temp.setSecond(object.getFirst());
        return temp;
    }

}
