
package pl.edu.uwm.wmii.magdalenarajewska.kolokwium1;

public class Zadanie2 {

    public static String delete(String str, char c){
        int pierwszy = 0;
        StringBuffer a = new StringBuffer(str);
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == c){
                pierwszy =+ 1;
            }
         if(pierwszy > 1 && str.charAt(i) == c){

         }
        }
        return a.toString();
    }
   public static void main(String[] args) {
    }
}
