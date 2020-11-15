package pl.edu.uwm.wmii.magdalenarajewska.laboratorium06;

public class Zadanie2Test {
    public static void main(String[] args) {

        System.out.println("Zbiór 1: ");
        IntegerSet liczby1 = new IntegerSet();
        liczby1.tab[5] = true;
        liczby1.tab[2] = true;
        liczby1.tab[10] = true;
        liczby1.tab[15] = true;
        liczby1.tab[20] = true;
        liczby1.tab[27] = true;
        liczby1.tab[50] = true;
        liczby1.pokaz();

        System.out.println("\nZbiór 2: ");
        IntegerSet liczby2 = new IntegerSet();
        liczby2.tab[5] = true;
        liczby2.tab[3] = true;
        liczby2.tab[20] = true;
        liczby2.tab[30] = true;
        liczby2.tab[45] = true;
        liczby2.tab[50] = true;
        liczby2.pokaz();

        System.out.println("\nEfekt metody union:\n" + IntegerSet.union(liczby1.tab, liczby2.tab));
        System.out.println("\nEfekt metody intersection:\n" + IntegerSet.intersection(liczby1.tab, liczby2.tab));

        liczby1.insertElement(6);
        System.out.println("\nEfekt metody insertElement:");
        liczby1.pokaz();

        liczby2.deleteElement(3);
        System.out.println("\nEfekt metody deleteElement:");
        liczby2.pokaz();

        System.out.println("\nEfekt metody toString:\n" + liczby1.toString());
        System.out.println("\nEfekt metody equals:\n" + liczby1.equals(liczby2));


        IntegerSet liczby3 = new IntegerSet();
        liczby3.tab[1] = true;
        liczby3.tab[3] = true;
        liczby3.tab[20] = true;
        liczby3.tab[30] = true;
        liczby3.tab[45] = true;
        liczby3.tab[50] = true;

        IntegerSet liczby4 = new IntegerSet();
        liczby4.tab[1] = true;
        liczby4.tab[3] = true;
        liczby4.tab[20] = true;
        liczby4.tab[30] = true;
        liczby4.tab[45] = true;
        liczby4.tab[50] = true;

        System.out.println("\nEfekt metody equals:\n" + liczby3.equals(liczby4));



    }
}
