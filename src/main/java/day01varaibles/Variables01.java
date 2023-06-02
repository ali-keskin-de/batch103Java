package day01varaibles;

public class Variables01 {

    // Variable Nasil olusturlur?
    /*
    1) Access Modifier
    2) Data type
    3) Variable name
    4) =
    5) Deger
    6) ;
     */
    // java'da ";" ingilizcedeki "." gibidir
    // Ingilizcede "cümle" deriz java'da "statetment" deriz.

    // "=" anlami Assignment Operator dir buna esittir demeyelim.  Assignment operator sagdaki degeri alir soldaki variable icine atar.

    /* public int height --> bunu yazinca memorye gelip height isminde bir alan olusturuyor,
    ve integer bir data türü oldugu icin olusturu olusturmaz java bu variable icine 0 koyar

    =13; ---> bunu yazdigimda icine height oldugu alana 13 koy demektir.

    */


    public int age = 13;

    public int height = 183;

                                       // java'da Data Types

                                     // Primitive Data Types

    /*
    1) int: Integer'in kisaltmasi. Integer tam sayi demektir. 32 bit kullanir
            Matematik'te tamsayilarin basi ve sonu yoktur, fakat Java'da tamsayilarin basi ve sonu vardir.

            En kücük int = -2 147,483,648
            En büyük int = 2 147,483,648

    2) byte = Tam sayilar icin kullanilir. 8 bit kullanir
            En kücük byte = -128
            En büyük byte = 127
            byte'lar  memory'de daha kücük yer kaplar integer'a göre eger isimizi byte yetiyorsa int yerine byte kullanilmalidir.

    3) short : Tamsayilar icin kullanilir. 16 bit kullanir.

            En kucuk short = -32768
            En büyük short = 32767

     4) long : Tamsayilar icin kullanilir. Integer'larin yetmedigi yerde kullanilir. 64 bit kullanir.

            En kücük long = -9,223,372,036,854,755,808
            En büyük long = 9,223,372,036,854,755,807

     5) float : ondalikli sayilar icin kullanilir. 32 bit kullanir
               "float" virgülden sonra 7 basamak icerebilir.
               "float" degerinide sona "f" veya "F" kullanilmalidir

     6) double : ondalikli sayilar icin kullanilir. 64 bit kullanir
               "double" virgülden sonra 16 basamak icerebilir.

     7) boolean : true veya false degerleri icin kullanilir. 1 bit kullanir

     8) char : Tek karakterler icin kullanilir. 16 bit kullanilir. char'lari '' tirnak icine koymaliyiz yoksa hata verir.
      ve tirnak isareti icinde bosluk olmamalidir.
              A, c, ?, 2, _, =

    Note : Numeric Data Type: byte < short < int < long < float < double
         boolean < char
         Memory kullanimi siralamasi


                             // Non-Primitive Data Types

       Primitive Data tipi'lerin icinde sadece deger vardir
       Non-Primitive data type 'lerinde deger ve methods vardir.

       String : isim, adres ve kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
               String degerleri mutlaka cift tirnak icine koymalisiniz
               String non-primitive 'dir. Yani bir String olusturdugunuzda Java size bir sürü method verir.

           Primitive Data türleri ile Non-primitive Data türleri arasindaki fark nedir?

           1) Non-Primitive Data türlerinde degerin yaninda methodlar vardir.
           2) Primitive data tipleri java tarafindan olusturulmustur 8 tanedir biz olusturamayiz.
              Non-Primitive data type'leri javada olusturur bizde olustururuz her class bir Non-Primitive datadir.
              Non-Primitive data type'leri sayilamayacak kadar coktur.
           3) Primitive data type isimleri kücük harfle baslar.
              Non-Primitive data type isimleri büyük isimle baslar.
           4) Primitive data type'leri Memory'de farkli büyüklükte yerler kullanirlar.
              Non-Primitive'ler hepsi memory'de ayni büyükte yer kullanirlar







     */

    public byte price = 12;

    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99F;

    public double weightOfCell = 0.000012045;

    // Siz "Long" demenize ragmen Java verilen sayiyi "int" kabul eder. Amaci Memory korumaktir.
    // Bu yüzden, long bir variable "int" araliginin disinda bir sayi verirseniz mutlaka "L" veya "l" koyunuz

    public long populationOfWord = 70000000000L;

    // Burada L koymadigimiz halde problem yok, cünkü "1234" int araligina uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S'; //  initial ilk harf demektir.

    public String name ="Tom Hanks";

    // main method arabanin motoru gibi o olmadan hic birsey calismaz.

    public static void main(String[] args) {

    }










}
