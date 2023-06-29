package day32maps;

import java.util.Hashtable;

public class Hashtable03 {
    /*
    "HashMap" ile "HashTable" arasindaki fark nedir?
    i) "HashMap"'ler "thread safe" degillerdir. "HashTable"  "thread-safe" dir
      HashMap'ler "synchronized" degillerdir. "HashTable"  "synchronized" dir
    ii) "HashMap"'ler bir tane "null" key'e  value'de sinirsiz "null" müsade ederler.
         "HashTable"  value'da da null müsade etmezler.
    iii) HashMap hizlidir, HashTable HashMap'e göre daha yavastir.
         ikiside entry'leri rastgele siralar
     */

    public static void main(String[] args) {
        Hashtable<String,Integer>  stdAges = new Hashtable<>();
        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);
       // stdAges.put(null, 43); ===> Hashtable'larin keylerine null konulmaz.
       // stdAges.put("Chris", null); ===> Hashtable'larin Value'larina null konulmaz.
        System.out.println(stdAges);//{Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}
        //System.out.println(stdAges);//NullPointerException

    }
}
