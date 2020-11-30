package pl.edu.uwm.wmii.magdalenarajewska.laboratorium11;

public class ArrayUtil<T extends Comparable<T>> {

    public static <T extends Comparable<T>> boolean isSorted(T[] lista){
        for(int i = 0; i < lista.length - 1; i++){
            if((lista[i].compareTo(lista[i + 1])) > 0){
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] lista, T el){

        for(int i = 0; i < lista.length - 1; i++){
            if((lista[i].compareTo(el)) == 0){
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] lista){
        T minimum;
        T pomoc;
        int index = 0;
        for(int i = 0; i < lista.length - 1; i++){
            minimum = lista[i];
            for(int j = i; j < lista.length; j++){
                if ((minimum.compareTo(lista[j]) >= 0)){
                    minimum = lista[j];
                    index = j;
                }

            }
            pomoc = lista[i];
            lista[i] = minimum;
            lista[index] = pomoc;
        }

    }



}
