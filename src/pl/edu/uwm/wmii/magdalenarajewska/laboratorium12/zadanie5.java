package pl.edu.uwm.wmii.magdalenarajewska.laboratorium12;

import java.util.*;

public class zadanie5 {

    public static void main(String[] args) {
        Stack<String> stos = new Stack();
        Scanner sc = new Scanner(System.in);
        String[] zdanie = sc.nextLine().split(" ");
        StringBuffer zd = new StringBuffer();
        StringBuffer finalneZdanie = new StringBuffer();

        int tmp = 0;
        for(int i=0;i< zdanie.length;i++){

            if(tmp == 0){
                zd.append(zdanie[i].toLowerCase());
                zd.append('.');
                stos.push(zd.toString());
                zd.delete(0,zd.length());

            }

            if(zdanie[i].charAt(zdanie[i].length()-1) != '.' && tmp > 0){
                stos.push(zdanie[i].toLowerCase());
            }
            if(zdanie[i].charAt(zdanie[i].length()-1) == '.'){
                char c = zdanie[i].charAt(0);
                c = Character.toUpperCase(c);
                zd.append(zdanie[i]);
                zd.deleteCharAt(zd.length()-1).replace(0,1, String.valueOf(c));
                stos.push(zd.toString());
                zd.delete(0, zd.length());
                tmp = -1;
                int stosSize = stos.size();
                for (int j = 0; j < stosSize; j++) {
                    finalneZdanie.append(stos.pop() + " ");
                }
            }
            tmp ++;
        }
        System.out.println(finalneZdanie.toString());
    }
}
