package day37enumsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    /*
    1- Iterator'lar looplarin yaptigini ayni isi yapar.
    2- Iterator'lar sonsuz Loop'a düsmezler.
    3- Iterotor ile performans farki yoktur loop'lar ile Iterator'lar arasinda.
    4- Iterator'lar bir Collection'dan eleman silme
       ve bir collection'daki elemani degistirme konusunda daha basarilidirlar.
    5- iki tip iterator var:
         i) Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mümkün degildir.
         ii) ListIterator: Eleman silebilir, ekleyebilir ve elemani degistirebilir.
         Note : Iterator sadece soldan saga (ilk elemandan son elemana) calisir.
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clarla");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); //[Tom, Jim, Clarla, Angie, Mark]

        //"Iterator" kullanalim

       Iterator<String> myItr = myList.iterator();//[Tom, Jim, Clarla, Angie, Mark]
        // burda iterator olsturdugumuzda List'i alir ve basina bir pointer koyar ,
        // myItr.hasNext() --> pointer sonrar senden sonra eleman var mi diye sorar varsa true, yoksa false döner.
        // myItr.next(); pointer'i bir sonraki elemanin önüne koyar ve üstünden atladigi elemani size verir.
        //  myItr.remove(); ellinizdeki elemani siler.


       while (myItr.hasNext()){

           myItr.next();

           myItr.remove();
       }
        System.out.println(myList);//[]


        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clarla");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList); //[Tom, Jim, Clarla, Angie, Mark]

        ListIterator<String> yourListItr=yourList.listIterator();

        while (yourListItr.hasNext()){

            String el = yourListItr.next();

            yourListItr.set(el + "!"); // set() method list' update etmeye yarar


        }
        System.out.println(yourList);//[Tom!, Jim!, Clarla!, Angie!, Mark!]

        // hasPrevious() ve previous() nasil kullanilir.






    }

}
