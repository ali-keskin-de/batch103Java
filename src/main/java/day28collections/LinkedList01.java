package day28collections;

    /*
    Collections aynı tipteki coklu dataları depolamak için kullanırlar.

    1) Linkedlist'ler node silme ve ekleme'de cok basarili   olduklari icin,
       silme ve ekleme islemlerini cok yapacaginiz zaman LinkedList kullaniriz.

    2) ArrayListler index'leri adres gibi kullandiklarinda, bu yüzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
       Note : Ihtiyac olan collection cogunlukla silme ve ekleme islemleri yapilacak ise ( müze ziyaretcileri gibi) LinkedList,
       "search" islemleri yapcaksa (Amerika eyaletleri gibi) ArrayList kullaniriz.

     */


import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cunyet");
        s.add("Esra");

        System.out.println(s);// [Steve, Ajda, Muge, Cunyet, Esra]

        s.add(2,"Esen"); // add(); Method'u verilen index'e node ekler.

        s.addFirst("Kemal"); // Node ilk siraya ekler.
        s.addLast("Ajdar"); // Node son siraya ekler.
        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cunyet, Esra, Ajdar]

       // s.remove(2);
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cunyet, Esra, Ajdar] ==> Ajda silindi

         //s.remove("Ajdar");
        System.out.println(s);// [Kemal, Steve, Esen, Muge, Cunyet, Esra] ==> Ajdar sillindi

        //s.remove();
        System.out.println(s);// [Steve, Esen, Muge, Cunyet, Esra] ==> ilk eleman sillindi

      // s.removeFirstOccurrence("Esra"); //  Buldugu ilk Esrayi siler
        System.out.println(s);

       // s.removeLastOccurrence("Esra");
        System.out.println(s);// Buldugu son esra'yi siler

        // peek() Methodu;
        /*
         * Retrieves, but does not remove, the head (first element) of this list.
         * @return the head of this list, or {@code null} if this list is empty
         */

        String r1 = s.peek();// ilk elemani silmeden size verir. (copy+paste)

        System.out.println(r1); //Kemal
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Muge, Cunyet, Esra, Ajdar]

        // poll():
        String r2 = s.poll();//  ilk elemani siler ve size verir.
        System.out.println(r2);//Kemal
        System.out.println(s);//[Esra, Steve, Esen, Ajda, Muge, Cunyet, Esra, Ajdar]

        // element();

        /*
         * Retrieves, but does not remove, the head (first element) of this list.
         * @return the head of this list
         * @throws NoSuchElementException if this list is empty

         Note : peek() ve element() method'lari ikiside bize ilk elementi verir.
         * Ancak ilk eleman bos ise peek()  methodu bize null verir, element(); ise bize exception atar.

         */
       String r3= s.element();
        System.out.println(r3); // Esra
        System.out.println(s);// [Esra, Steve, Esen, Ajda, Muge, Cunyet, Esra, Ajdar]


        /*
         * removes and returns the first element of this list.
         * @return the element at the front of this list
         * @throws NoSuchElementException if this list is empty

       Note : poll()b ve pop() ikiside ilk elemani siler ve size verir.
            Ancak poll() listin ilk elemani bos ise null verir pop(); ise bos ise exception atar.

         */

        s.pop();


    }


}
