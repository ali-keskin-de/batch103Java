package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {

    /*
    1) Set'ler tekrarsiz(unique) elemanlari depolamak icin kullanirlar
    2) 3 Tane Set Class vardi;
       i) HashSet Class :
         "Hash" bir tekniktir. Bu tenknik Benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
         "HashSet" Elemanlari rastgele siralar.
         "HashSet" Elemanlari siralamadigindan cok hizli calisir.
         "HashSet" ler "null" i eleman olarak kabul eder.
         "HashSet" tekrarsiz eleman depolamak icindir.

       ii) LinkedHashSet Class
         "LinkedHash" ler elemanlari sizin veridginiz siraya göre dizdiklerinden (insertion order).
         "HashSet" lere göre yavastirlar.
          "LinkedHash" tekrarsiz eleman depolamak icindir.

       iii) TreeSet Class
            "TreeSet" elemanlari natural order'a göre dizdiklerinden coook yavastrilar.
            En yavas set "TreeSet" tir.

  Note : Setler primitive Data kullanamazlar Aslinda bütün Collection'lar non-Primitive data kullanirlar.
  Note : Set'ler null (TreeSet'ler Haric) eleman olarak kabul ederler. Tekrar'li elemanlari sadece birkez eklerler.Bu da set'ler unique
  yapilari tutar demistik bu sebepten.
     */
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cunyet");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cunyet");// Tekrarli elemani eklediginizde hata vermez ama tekrarli elemani sadece birkez eklerr.
        hs.add(null);
        System.out.println(hs);// [null, Zeki, Cunyet, Ajda, Esra, Ezel]
        System.out.println(hs.hashCode()); // 2038770548

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);//[234, 87, -32, 124] Insertion order

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls); //[451, 87, 231, 124]
        // retainAll() method'u ilk LinkedHashSet'teki ikinci LinkedHashSet'den  farkli elementleri siler
        // ikici LinkedHashSet'i oldugu gibi burakir.
        lhs.retainAll(ls);
        System.out.println(lhs);//[87, 124]
        System.out.println(ls);//[451, 87, 231, 124]

        TreeSet<Character> ts = new TreeSet<>();

        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        //ts.add(null); NullPointerException exception verir sebebi natural order göre siraliyor ancak hicligi nereye koyacagini bulamaz.
        System.out.println(ts);// [A, G, R, U, Z] Natural order göre siralar.

        // first()
        System.out.println(ts.first());//A

        //last()
        System.out.println(ts.last());//Z

        // lower()
        System.out.println(ts.lower('R'));// G ===> parametre olarak verilen elementen önceki elemnti veririr.
        System.out.println(ts.lower('D'));//A set olmayan elemanlar icinde kullanilir.
        System.out.println(ts.lower('A'));// Null olmasinin sebebi adan önce elemet yoktur.

        //higher()
        System.out.println(ts.higher('R'));// U ==> parametre olarak verilen elementen sonraki elemnti veririr.

        //headSet();
        System.out.println(ts.headSet('R'));// [A, G] ==> Parametre exculisive'dir parametre olarak verilen elemente kadar olan elementleri verir
        System.out.println(ts.headSet('R', true));// [A, G, R] bu tailSet() icinde gecerli inculisive ve Exculisive degistirebiliriz.

        //tailSet();
        System.out.println(ts.tailSet('G'));//[G, R, U, Z] ==> Parametre olarak verilen elementten baslayarak (inculisive) sonuna kadar seti verir.

        //ceiling();
        System.out.println(ts.ceiling('R'));// R ===> Eleman set'in icerisinde varsa kendisini return eder.
        System.out.println(ts.ceiling('K'));// R ===> Eleman set'in icerisinde yoksa sonraki elemani return eder.

        //floor();
        System.out.println(ts.floor('G'));//G ===> Eleman set'in icerisinde varsa kendisini return eder.
        System.out.println(ts.floor('G'));//G ===> Eleman set'in icerisinde yoksa önceki elemani return eder.

        // subSet()

        System.out.println(ts.subSet('G', 'Z'));// [G, R, U] ==> ilk parametre inculisive ikinci exculisive'dir.

     // Overloading yaparak parametreleri dahil yada haric yapabiliirz.

        System.out.println(ts.subSet('G', false, 'Z', true));//[R, U, Z]


    }
}
