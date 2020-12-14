package pl.edu.uwm.wmii.magdalenarajewska.laboratorium13;

import java.util.*;
public class Zadanie_2_3 {
    public static void opcje(Map<Student, String>mapa, String nazwisko, String imie, String ocena){
        Student student = new Student(nazwisko, imie, ocena);
        mapa.put(student, student.getOcena());
    }

    public static void wypisz(Map<Student, String> map){
       for(Map.Entry<Student, String> lista: map.entrySet()){
           System.out.println(lista.getKey().getNazwisko() + ": " + lista.getValue());
       }
    }

    public static void wyszukaj(Map<Student, String> mapa, int ID){
        for(Map.Entry<Student, String> lista : mapa.entrySet()){
            if (lista.getKey().getstudentID() == ID) {
                System.out.println(lista.getKey().getNazwisko() + ": " + lista.getValue());
            }
        }
    }

    //public static void usun(Map<Student, String>, int ID){}

    public static void main(String[] args) {
        Map<Student, String> Students = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        boolean boo = true;
        while(boo){
            System.out.println("Wpisz wybraną opcję:\n-dodaj\n-zmien\n-wyszukaj\n-wypisz\n-usun\n-zakoncz\n");

            String opcja = sc.next();
            if (opcja.equals("dodaj")) {
                opcje(Students, sc.next(), sc.next(), sc.next());
            }
            if (opcja.equals("zmien")) {
                opcje(Students, sc.next(), sc.next(), sc.next());
            }
            if(opcja.equals("wyszukaj")){
                wyszukaj(Students, sc.nextInt());
            }
            if(opcja.equals("wypisz")){
                wypisz(Students);
            }
            if(opcja.equals("usun")) {
                Students.remove(sc.next(), sc.nextInt());
            }
            if(opcja.equals("zakoncz")){
                    boo = false;
            }
        }
    }
}
