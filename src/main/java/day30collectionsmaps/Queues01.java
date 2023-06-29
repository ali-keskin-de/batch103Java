package day30collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    /*

     */

    public static void main(String[] args) {

        Queue<String> wareHaus = new LinkedList<>();
        wareHaus.add("Milk");
        wareHaus.add("Meat");
        wareHaus.add("Bread");
        wareHaus.add("Egg");
        wareHaus.add("Cheese");
        System.out.println(wareHaus);//[Milk, Meat, Bread, Egg, Cheese]

        wareHaus.remove();
        System.out.println(wareHaus);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHaus.peek());//Meat
        System.out.println(wareHaus);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHaus.element());//Meat
        System.out.println(wareHaus);//[Meat, Bread, Egg, Cheese]

        // Note peek() ile element() arasindaki fark eger wareHaus bos ise peek null döner, element exception verir.

        System.out.println(wareHaus.poll());//Meat
        System.out.println(wareHaus);//[Bread, Egg, Cheese]

        wareHaus.clear(); // tüm elemanlari siller.
        System.out.println(wareHaus);// []
        System.out.println(wareHaus.poll());// null
        System.out.println(wareHaus.remove());//NoSuchElementException

    }
}
