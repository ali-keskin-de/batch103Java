package day30collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {
    /*
    Note : “Queue”u iki farklı constructor ile oluşturabilirsiniz eğer “LinkedList” ‘ten
           olusuryorsa eklediğimiz sıraya göre ekler. “PriorityQueue” belirlenen önceliğe göre sıralar. Örnegim bir bankaya gittiğinizde banka müşterilerine öncelik vermesidir.
           Bunu developer belirler.

     */


    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);

        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);




    }
}
