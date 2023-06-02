package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

        // if it rains I will cancel the picnic
        // If statement beli kodlari belli sartlara bagli olarak calistirmaya yarar.

        // Example 1: Sayi pozitifse ekrana sayi pozitiftir yazdiriniz

        int s =12;

        if (s>0){
            System.out.println("Positive");
        }

        // Exaple 2: verilen character büyükharf ise ekrana "Büyük harf" yazdirin

        char harf ='A';
        if(harf>='A'&& harf<='Z'){
            System.out.println("Büyük harf");
        }

        /*
        && (And) islemi sadece boolean ile kullanilir.
        &&  islemi mükemmeliyetcidir, true sonuc alabilmek icin herseyin true olmalidir.
        */

        // Example 3: verilen sayi üc basamakli ise ekrana sayi 3 basamaklidir.

        int sayi = 120;
       sayi = Math.abs(sayi); // bu negatif sayilari positive cevirir.  abs --> absoluat demektir.
        if(sayi>99 && sayi<1000){ //sayi>=100 && n<=999 veya sayi>99 && sayi<1000 bu sekilde sarti olusturabiliriz
                                 // ancak ilkde önce büyükmü sonrada esitmi  buna bakar java yani iki islem vardi bu da code yavas calismasina sebep olur,
                                // bu sebepten il ki tercih edilmeli
            System.out.println("Sayi üc basamaklidir");
        }
        // Example 4: verilen sayi cift sayi ise ekrana cift sayi yazdirin.

        // "=" isareti atama opreatorudur,matematik'teki esittir anlamina gelmez.
        // Matematikteki esittir sembolü java'da "==" tir. 2+3 == 5

        int n =12;
        n = Math.abs(n);

        if (n%2==0){
            System.out.println("Cift sayi");
        }

        // Exmaple 5: Verilen sayi 300'de kücük veya 1200'den büyük ise ekrana "Harika sayi" yazdirin
        int r = 250;

        if(r<300 || r> 1200) {
            System.out.println("Harika Sayi");
        }
        // || veya sadece boolean'larda kullanilir
        // veya bir durumun dogru olmasi durumunda calisir, eger ikiside false ise calismaz.


    }
}
