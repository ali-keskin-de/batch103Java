package day08stringmanipulations01;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        // Example 1: Kullanicidan aldiginiz ismin  ilk ve son harfi yazdiriniz.

        Scanner input = new Scanner(System.in);
        //  System.out.println("Lütfen adiniz giriniz");
        // String isim = input.next();

        // 1.Weg
        // char ilkHarf = isim.charAt(0);
        // char sonHarf = isim.charAt(isim.length()-1);

        // System.out.println(""+ilkHarf+sonHarf);

        // Note: charlari concatinaten yaparsak sout ile yazdirinca bize bu iki char degerinin ascii degerlerinin toplamini verir,
        // bu sebepten basine bir Bos String ifadesi atariz.

        //  2.Weg
        //  String ilk = isim.substring( 0,1);
        //  String son  = isim.substring( isim.length()-1);

        //  System.out.println(ilk + son);

        // Stringlerin Ascii degeri olmadigindan burada direkt concatenation yapar.

        // Bu durumda hangisini kullanmaliyiz eger char data type gerekiyorsa ilk String lazimsa ikici yapilir.


        //Example 2: Verilen String'te sadece hayvan isimlerini ekrana yazdiriniz
        // "Ben kedi, esim tavuk, oglum sever inek"

        //  String str = "Ben kedi, esim tavuk, oglum sever inek";

        /*
        substring():  iki kullanimi vardir.
        i)
          1. substring( baslangic index, bittis indexi) bu bir stringin icerisinden baslangic index baslayarak bittis indexine kadar olan string parcasini alir.
            Note: Burda dikkat edilmesi gereken ilk index dahil (inclusive), bittis indexi dahil (exclusive) degildir.
          2. substring( baslangic indexi) bu bir stringten baslangic indexinden baslayarak son indexe kadar alir.

         ii)
          substring(): method'u bize string bir veri return eder.
      */


        //   String kedi = str.substring(4,8);
        //   String tavuk = str.substring(15,20);
        //   String inek = str.substring(34);
        //   System.out.println(kedi + tavuk + inek);


        // Example 3: Ilk isim ve soyisim iceren isimlerden ilk isim ve soyismin basharflerini ekrana yazdiriniz.
        // Ali Can ==> AC   Tahsin Yurdakul ==> YK

        System.out.println("Lütfen tam isminizi giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);

        String b = tamIsim.split(" ")[1].substring(0, 1);

        System.out.println(a + b);

    }
}
