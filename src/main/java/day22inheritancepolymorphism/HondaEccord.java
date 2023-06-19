package day22inheritancepolymorphism;

public class HondaEccord extends Honda {
    /*
    1) Siz Class olusturdugunuzda Java otomatik olarak size görünmez bir Constructor verir, cünkü Java,
     Class 'in bir kalip (Template) oldugunu ve Object olusturmak icin yaratildigini
     ve Object olusturmak icin Constructor 'a ihtiyaci bilir.
     2) Javanın otomatik olarak oluşturduğu Bu görünmez Constructor 'a  "default constructor denir.
     3) Siz kendiniz herhangi bir Constructor oluşturduğunuz da Java default Constructor' i siler.
     4)Bir class'da birden fazla Constructor olabilir. Fakat bu constructor'larin parametreleri farkli olmalidir.
     5) "this" keyword "Bu Class" anlamindadir. "this.price" demek bu Class'taki "price" isimli variable demektir.
        "this.price" syntax'i constructor'larin icinde kullanilir.
     6) Conctructor Kullanarak variable'lar üzerinde yaptığımız değişimler sadece object üzerindeki variable'larin değerlerini değiştirir.
      Class'daki Variable değerlerini değiştirmez...

        Note : yapilan degisikler Class'ta (kalip) degil olusturdugumuz constructor üzerinde olur böylelikle kalibimizi koruruz


     */
    public int price;
    public int year;
    public String make;
    public String model;



    public HondaEccord(){

    }

    public HondaEccord(int price){
        this.price = price; // Bunun anlamı bu class ta ki price benim verdigim price esitle demektir.

    }
     public HondaEccord(int price, int year){
        this.price = price;
        this.year = year;
         System.out.println("Honda Accord Constructor"); // Bunu sadece kodumuzun nereleri gezdigini göstermek icin yazdik

     }

    public HondaEccord(int price, int year, String make, String model){
        this.price=price;
        this.year=year;
        this.make = make;
        this.model = model;


    }
}
