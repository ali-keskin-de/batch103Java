package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {
    /*
    ArrayList'ler ayni tipte data türlerini saklamak icin kullanilir.
    ArrayList ile Array arasindaki fark nedir?

    1) Array olusturulurken Array'in icine kac tane eleman koyacagimizi söylemeliyiz,
       söyledigimiz eleman sayisindan fazla eleman koyamayiz. Array'ler eleman sayisinda "fixed" dirler.

      ArrayListleri olusturuken eleman sayisi söylemeye gerek yok, cünkü ArrayList'ler eleman sayisinda "flexible" (esnek) tir.

     2) Array'lerin icine "primitive" ve "refernce" ler konulabilir.
        ArrayList'lerin icine sadece "non-primitive" ler konulabilir.

      3) Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
      Note : eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz
             Eleman sayisi degisken olan coklu datalari depolamak icin arrayleri kullanmak risklidir.
     */

    public static void main(String[] args) {

        // 1) ArrayList nasil olusturulur?

        // 1.yol
        ArrayList<Integer> ages = new ArrayList<Integer>();

        // 2.yol genellikle bu yada 3. yol kullanilir.
        ArrayList<Integer> heights = new ArrayList<>(); // Bu özel bir tanimlama su örnek verildi ali mehmet'in oglu

        //3. yol
        List<Integer> nums = new ArrayList<>(); // buda ise ali'yi söylede tanimlayabiliriz ali adem oglu bu daha genel bir tanim

        // 2) ArrayList'ler nasil yazdirilir?

        System.out.println(nums);//[]

        // 3) ArrayList'lere element nasil eklenir?

        // add() her zaman element en sona ekler(insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);//[21, 18, 20]
        nums.add(1,15);// elementi istenilen index' ekler
        System.out.println(nums);//[21, 15, 18, 20]

        // add() method'u boolean return eder.
        // ancak add() methodunun index'li hali bize herhangi birsey return etmez. overloaded method'unun return type void'tir.

        List<Integer> prices = new ArrayList<>();

        prices.add(23);// elementi son index'e ekler
        prices.add(185);


        nums.addAll(prices); // elementleri en sona ekler
        System.out.println(nums);//[21, 15, 18, 20, 23, 185]
        System.out.println(prices);// [23, 185]

        nums.addAll(2,prices);// istenilen index'e  elementleri ekler

        System.out.println(nums);//[21, 15, 23, 185, 18, 20, 23, 185]
        // 4) ArrayList'lerde eleman sayisi nasil bulunur

        int elementSayisi = nums.size();
        System.out.println(elementSayisi);

        //5) ArrayList'lerde herhangi bir element'i nasil secilir?
        //get() method'u istenen bir index'teki element'i verir.

        int element = nums.get(3);//185
        System.out.println(element);

        // 6) ArrayList'in bos olup olmadigini nasil anlariz?

       boolean bosMu = nums.isEmpty();// false
        // Note: Eger bir array bos ise isEmpty() method'u true verir dolu ise false verir.
        System.out.println(bosMu);

       boolean bosMu1 = ages.isEmpty();

        System.out.println(bosMu1);

        // 7) ArrayList'in bir elemani nasil degistirilir?
        System.out.println(nums);// [21, 15, 23, 185, 18, 20, 23, 185]

        nums.set(3, 200); // 3.indexteki elementi 200 ile degistirir.
        System.out.println(nums);//21, 15, 23, 200, 18, 20, 23, 185]

        // Example 1: nums ArrayList'deki tüm tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for (int w:nums
             ) {
            if(w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }

        }
        System.out.println(nums);// [32, 26, 34, 200, 18, 20, 34, 196]


        // 8 Bir Array'de verilen element'in index'i nasil bulunur?

        System.out.println(nums);//[32, 26, 34, 200, 18, 20, 34, 196]

        int indexElement = nums.indexOf(200);// 3 * bu list'teki 26 element'in  index'ni return etmeli
        System.out.println(indexElement);    // 3  returnn etti beklenen sonuc, gerceklesen ile ayni.

       // Note : indexOf() method'u herzaman aranan elementin  ilk görünümünün index'ini verir.

       // Note : Eger aranan element list'e yoksa o zaman indexOf() methodu bize -1 return eder

       int indexElement1 = nums.indexOf(15);
        System.out.println(indexElement1); // -1   * 15 element'ini list icermediginden indexOf() bize -1 return etti.

        // remove() method'unu icine tamsayi koyarsaniz Java onu index olarak kabul eder.---> nums.remove(200);
        // bunu Java neden primitive data olarak kabul ediyor ?
        // Cünkü java memory korumak icin tüm tamsayilari primitive data type'de kabul eder
        // primitive'ler ArrayList'lerin element'i olamazlar, non-primitive datalar ArrayList'lerin elemanidir.
        // bu sebepten remove() icine 200 girince index kabul ediyor.
        // Eger biz bunu primitive data type'ni non-primitive yapmak istiyorsak;
        // onu wrapper class'a koymaliyiz bu isleme unboxxing denir
        // non-primitve'leri java index kabul etmez. ve biz remove(Integer)
        // gibi bir non-primitive data koyarsak java gider o degeri list'ten kaldirir.

        // Example 2: ArrayList'ten 200 element'ini siliniz

        Integer sayi = 34;
         nums.remove(sayi);
        System.out.println(nums);// [32, 26, 34, 18, 20, 34, 196] görüldügü gibi list'te 34 degerinin ilk görünümünü silindi.




    }
}
