package pl.edu.uwm.wmii.magdalenarajewska.laboratorium10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("C:\\Users\\Rajewski\\Desktop\\Magdalena_Rajewska\\src\\pl\\edu\\uwm\\wmii\\magdalenarajewska\\laboratorium10\\tekst.txt");
        Scanner sc = new Scanner(plik);
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNext()){
            arr.add(sc.nextLine());
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
