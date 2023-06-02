package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str = "Java is easy";

        // indexOf() methodu bir String icerisinde constructor'a verilen character veya characterlerin ilk görünümü verir.
                    //ii) indexOf method'u bize int bir deger döner-
        int indexA = str.indexOf("a");// 1

        System.out.println(indexA);

        // lastIndexOf() method'u bir String icerisinde constructor'a verilen character veya characterlerin son görünümü verir.

        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);//9

        //
        String str1 = "Kara kara düsünme Ankara";

       int idxA3 = str1.indexOf("kara");
        System.out.println(idxA3);// 5  veri aranan string'in ilk görünümünün ilk karakterinin index'i verir.

        int idxA4 = str1.lastIndexOf("kara");
        System.out.println(idxA4);// 20 veri aranan string'in son görünümünün ilk karakterinin index'i verir.

        // Note : Eger aranan deger String'te bulunmuyorsa -1 verir.

        String s = "Mississippi";
        int idxI = s.indexOf('i'); // indexOf() hem String hemde char ile kullanilabilir.
        System.out.println(idxI);// 1

        // Example 1: Bir String'deki bir characterin tekrarli ve ya tekrarsiz olup olmadigini gösteren kodu yaziniz.
        //   "Hellooo"==> H--> Tekrarsiz  e--> tekrarsiz  l--> tekrarli   a--> tekrarli

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz...");
        String word = input.next();

        System.out.println("Lütfen bir harf giriniz");
        String harf = input.next();

        if (harf.indexOf(harf)== harf.lastIndexOf(harf)) {

            System.out.println(harf +" harfi kelime icerisinde tekrarli degil");

             }else {
            System.out.println(harf +" harfi kelime icerisinde tekrarlidir");
             }

         // indexOf() iki parametre ile  kullanilirsa ilki aranacak deger olur ikincisi bize kacinci karakterden sonra aranacagini söyler
          // ve bize aranan karakterin ilk görüntüsünü döner.
        String u = "Learn Java earn money";

        int sonuc= u.indexOf("a", 6);//7
        System.out.println(sonuc);

        int sonucN= u.indexOf("n", 5);

        System.out.println( sonucN);//14

        //Yukardaki kullanım lastIndexOf() icin  ise benzer bir kullanim olsada iki parametre ile kullanilirsa;
        // ikici parametre ile verilen sayiyi index olarak kabul eder ve index'e kadar olan karakterleri alir
        // ve onun icinde verilen karakteri arar ve bize int bir deger olarak karakterin index'i return eder .
        // Eger karakteri bulamazsa -1 return eder.

        String m = "Hello everyone";
        int e = m.lastIndexOf("e", 7);

        System.out.println("e = " + e); //6


        String v = "Java is Java";

        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        // isEmpty(): i) method'u bir String'in bos olup olmadigini kontrol eder.
                  // ii) boolean bir deger return eder. Eger String bos degilse bize false, bos ise true return eder.


        String x = "    ";

        boolean isBlankMi = x.isBlank();
        System.out.println(isBlankMi);

        // isblank() method'u hem bos bir string icin hemde space veya spaceler iceren stringler icin true return eder.
        //  Buda onun isEmpty() method'undan farkidir.

        // Example 2: Kullanicidan alinan ismin mutlaka space'den farkli enaz bir karakter olmalidir.


do {
    Scanner input2 = new Scanner(System.in);
    System.out.println("lütfen ilk isminizi giriniz...");
    String ilk = input2.nextLine();
    if(ilk.isBlank()){
        System.out.println(" ben sana ilk ismini gir dedim..");
    }else{
        System.out.println(ilk);
        break;
    }
}while (true);





    }
}
