package pl.edu.uwm.wmii.magdalenarajewska.laboratorium13;


import java.util.*;

public class Zadanie_1 {

    public static void ustawPriorityDescr(PriorityQueue queue, int a, String descr){
        int b;
        if(a > 9){
            b = 9;
        }
        else if(a < 0){
            b = 0;
        }
        else{
            b = a;
        }

        Zadania list = new Zadania(b, descr);
        queue.offer(list);
    }


    public static void main(String[] args) {
        PriorityQueue<Zadania> queue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        boolean tmp = true;

        ArrayList<Zadania> lista = new ArrayList<>();
        String add = "dodaj";
        String next = "nastepne";
        String cancel = "zakoncz";
        while(tmp == true){
            System.out.println("Wpisz operacje jedną z trzech możliwych:\n-dodaj\n-nastepne\n-zakoncz\n ");
            String polecenie = sc.next();
            if(polecenie.equals(add)){
                ustawPriorityDescr(queue, sc.nextInt(), sc.next());
            }
            if(polecenie.equals(next)){
                queue.remove();
            }
            if(polecenie.equals(cancel)){
                tmp = false;
            }
        }
        while(!queue.isEmpty()){
            lista.add(queue.poll());
        }
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

}
