package pl.edu.uwm.wmii.magdalenarajewska.laboratorium13;

import java.util.*;

public class Student implements Comparable {
    private String imie;
    private String nazwisko;
    private String ocena;
    private static int ID = 0;
    private int studentID;

    public Student(String nazwisko,String imie, String ocena) {
        this.nazwisko = nazwisko;
        this.ocena = ocena;
        ID++;
        this.studentID = ID;
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getOcena() {
        return ocena;
    }

    public int getstudentID() {
        return studentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nazwisko, student.nazwisko) &&
                Objects.equals(ocena, student.ocena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwisko, ocena);
    }

    @Override
    public int compareTo(Object o) {
        Student a = (Student)o;
        int porownanieNazwiska = this.nazwisko.compareTo(a.getNazwisko());
        if(porownanieNazwiska == 0){
            int porownanieImienia = this.imie.compareTo(a.getNazwisko());
            if(porownanieImienia == 0) {
                if (this.studentID > a.getstudentID()) {
                    return 1;
                }
                if (this.studentID < a.getstudentID()) {
                    return -1;
                }
                if (this.studentID == a.getstudentID()) {
                    return 0;
                }
            }
            return porownanieImienia;
        }
        return porownanieNazwiska;
    }
}
