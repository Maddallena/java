package pl.edu.uwm.wmii.magdalenarajewska.laboratorium12;

import pl.edu.uwm.wmii.magdalenarajewska.laboratorium06.IntegerSet;

import java.util.Scanner;
import java.util.Stack;

public class zadanie6 {
    public static void main(String[] args) {
        System.out.println("Wpisz liczbę większą od 0: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Stack <Integer> st = new Stack();

        while (a > 0){
            st.push( a % 10);
            a = a / 10;
        }

        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
}
