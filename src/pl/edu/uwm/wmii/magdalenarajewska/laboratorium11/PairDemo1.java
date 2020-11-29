package pl.edu.uwm.wmii.magdalenarajewska.laboratorium11;

public class PairDemo1 {
    public static void main(String[] args)
    {
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        System.out.println("Zadanie1: ");
        System.out.println(mm.getFirst());
        mm.swap();
        System.out.println(mm.getFirst());

        System.out.println("Zadanie2: ");
        Pair<String> test = PairUtil.swap(mm);
        System.out.println(test.getFirst());
        System.out.println(test.getSecond());
    }
}
