package pl.edu.uwm.wmii.magdalenarajewska.laboratorium11;

import java.time.LocalDate;

public class Zadanie3_4_Test {
    public static void main(String[] args) {

        Integer[] lista = new Integer[5];
        lista[0] = 3;
        lista[1] = 5;
        lista[2] = 7;
        lista[3] = 9;
        lista[4] = 15;
        System.out.println(ArrayUtil.isSorted(lista));

        Integer[] lista2 = new Integer[5];
        lista2[0] = 5;
        lista2[1] = 9;
        lista2[2] = 2;
        lista2[3] = 2;
        lista2[4] = 2;

        System.out.println(ArrayUtil.isSorted(lista2));

        LocalDate[] data = new LocalDate[3];
        data[0] = LocalDate.of(2012, 3, 22);
        data[1] = LocalDate.of(2014, 5, 7);
        data[2] = LocalDate.of(2020, 11, 28);

        System.out.println(ArrayUtil.isSorted(data));

        LocalDate[] data2 = new LocalDate[3];
        data2[0] = LocalDate.of(1997, 11, 28);
        data2[1] = LocalDate.of(2020, 2, 23);
        data2[2] = LocalDate.of(2015, 9, 2);

        System.out.println(ArrayUtil.isSorted(data2));


        System.out.println(ArrayUtil.binSearch(lista, 17));
        System.out.println(ArrayUtil.binSearch(lista, 7));
        System.out.println(ArrayUtil.binSearch(data, LocalDate.of(2014, 5, 7)));
        System.out.println(ArrayUtil.binSearch(data2, LocalDate.of(2015, 9, 3)));

        ArrayUtil.selectionSort(lista);
        System.out.println("Zadanie 5: ");
        for(int i = 0; i < lista.length; i++ ) {
            System.out.print(lista[i] + " | ");
        }

        ArrayUtil.selectionSort(data2);
        for(int i = 0; i < data2.length; i++ ) {
            System.out.print(data2[i] + " | ");
        }
    }
}
