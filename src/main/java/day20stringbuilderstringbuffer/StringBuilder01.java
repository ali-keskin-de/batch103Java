package day20stringbuilderstringbuffer;

import jdk.swing.interop.SwingInterOpUtils;

public class StringBuilder01 {

    /*
    1) String Builder Javada bir class'tir.
    Bir class'ta bulunan aktif özellikleri biz methodlar, pasif özellikleri ise variable (Saç rengi, boyu, kilosu...) demekdeyiz.

    2) String Builder ne yapar?
    String oluşturmaya yararlar.

    3) Peki String class'ı varken neden StringBuilder'a ihtiyaç duyarız?
    Çünkü Street class Immutable Class'tir, Ama biz bazen Mutable String'lere ihtiyaç duyarız,
    StringBuilder bize Mutable String verir.

    4) "Immutable Class" larda varolan deger degistirilmez. Siz var olan degeri degistirmek istediginizde;
           i) Memory'de yeni bir variable yeni degerle olusturulur.
           ii) eski variable'in pointeri yeni degerle döndürülür.
           iii) Eger bir veriable'i hic bir pointer göstermiyorsa "Garbage Collector" tarafindan silinir.

      "Mutable Class" larda varolan deger degistirilebilir.

    5) "String Class"larin "immutable" yapisi "security" icin önemlidir.
      Aynı değeri sahip birden fazla string olduğunda, Java bir tane Container Oluşturur
       ve aynı değere sahip string'lerin bu Container'i Kullanmasını temin eder.
        Bu memory'i Kurmak için iyidir
        ancak container'daki degeri Bir veraible İçin değiştirdiğimiz de tüm veriable'larin etkilenmesi tehlikesi vardır.
        Bu tehlikeden kurtulmak için Java string'leri Immutable  (değişmez) yapmıştır.
        Ancak herhangi bir veraible'in diğerini değiştirmek için Java bir yol bulmuştur.
        Değiştirmek istediğiniz veraible icin yeni bir container oluşturur
        ve  veriable'in pointer'ìni bu yeni veraible'a yönlendirir. Böylelikle hem değişim sağlanmış hem de diğerleri etkilenmemiş olur


     */
    public static void main(String[] args) {

        String str = "Java";
              str = "Super Java";
        System.out.println(str);

        StringBuilder strb = new StringBuilder("Java");
        strb = new StringBuilder("Super Java");
        System.out.println(strb);

        String hesabSahibi1 = "Tom Hnaks";
        String hesabSahibi2 = "Tom Hnaks";
        String hesabSahibi3 = "Tom Hnaks";

        // StringBuilder nasil olusturulur.
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2. yol
        StringBuilder strb2 = new StringBuilder();
        // Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);

        // Yol b:
        strb2.append(" Learn").append(" Java earn").append(" money");
        System.out.println(strb2);
       str= str.concat(" Ali");
        System.out.println(str);

        // StringBuilder'larda append(); method'u string'teki concat() metohd'una benzer.


       // StringBuilder'larda karater sayisi nasil bullunur?

        // langth()
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3

        // capacity()
        int capacity = strb3.capacity();
        System.out.println(capacity);//16

        strb3.append("1234567890yxcvb");
        int capacity1 = strb3.capacity();
        System.out.println(capacity1);//34

        strb3.append("123456789012345678");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);//70


        // Biz bir StringBuilder olusturdugumuzda ilk olarak 16 charachter'i barindiracak kadar bir alan olusturur.
        // Bu sebepten  int capacity = strb3.capacity(); yazdirinca 16 olur.
        // Bu kapasiteyi asarsak her defasinda  defasinda "2 * capacity + 2" toplam alan olusturur.
        // Yani; ikicide 34, 34 asarsam ==> 70

        // charAt()
        System.out.println(strb3);//Cat1234567890yxcvb123456789012345678
        strb3.setCharAt(2, 'r');
        System.out.println(strb3); // Car1234567890yxcvb123456789012345678

        // delete()
        // Note : Verilen  index aralığındaki charachter'i silmeye yarar,
        // İlk index dahil (İnclusive) ikinci index hariç (exclusive) tutulur.
        strb3.delete(3, 18);
        System.out.println(strb3);//Car123456789012345678

        // deleteCharAt()
        // Verilen index'teki charachter'i siler.

        strb3.deleteCharAt(0);//ar123456789012345678
        System.out.println(strb3);

        // reverse()
        // "StringBuilder" tersine çevirir. ali--> ila

        strb3.reverse();
        System.out.println(strb3); //876543210987654321ra

        // "mutable"’larda methodu kullanmak orijinal degeri değiştirmek icin yeterlidir.
        // Buna karşın "Immutable"’larda birde assing etmek gerekmektedir.

        String abc ="Java";
        abc.replace("a", "i");
        System.out.println(abc);// Java
        abc= abc.replace("a", "i");
        System.out.println(abc);// Jivi


        // toString()
        // StringBuilder'lari String'lere cevirir.
        String stringStrb3= strb3.toString();
        System.out.println(stringStrb3);


       // String'ten StringBuilder'a dönüs nasil olur.
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);

        // insert()
        //Verilen index ten itibaren istenilen karekterleri StringBuilder ekler.
        strb4.insert(3, "XXX");
        System.out.println(strb4);// 876XXX543210987654321ra

        // insert() Bir cok kullanımı var.
        // Bunlardan biri de verilen bir index de itibaren verilen bir String ifadenin  belli bir kısmını StringBuilder ekler.

        System.out.println(strb4);
        strb4.insert(3, "Aliveligel", 5, 8); // 5 dahil 8 harictir
        System.out.println(strb4);

        // compareTo()
        //            a.compareTo(b); --> i) StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                                ii) fark varsa pozitif olarak alfabetik siralama farkini gösteirir
        //                               iii) "a" "b" den önce gelirse negatif olarak aradaki farki verir.
        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        int sonuc = a.compareTo(b);
        System.out.println(sonuc);// 0 arada fasrk olmadigini gästerir 0 fark olsaydi alfabetik olarak kontrol ederdi.







    }
}
