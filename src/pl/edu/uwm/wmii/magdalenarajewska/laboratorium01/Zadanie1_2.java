package pl.edu.uwm.wmii.magdalenarajewska.laboratorium01;

public class Zadanie1_2 {
    public static void main(String[] args){
        int[] tab = {2,5,7,4,1,3,8,6,9,15,40,31,95};
        for(int i = 1; i < tab.length; i++){
            System.out.print(tab[i]+" | ");
        }
        System.out.print(tab[0]);
    }
}
