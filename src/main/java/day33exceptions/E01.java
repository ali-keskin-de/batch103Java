package day33exceptions;

public class E01 {
    /*
    1) Exception : Umulmadık problemlere denir.
    2) Exception’i halledebilmek icin iki temel yol vardır.
      i) Exception’a uygun çözümler üretebiliriz.”Exception Handling” denir.
      ii) “Exception” oluştuğunda bunu ilan eder ve geri cekiliririz. Buna da “Throw Exception” denir.
    3) “Exception”’a uygun çözümler üretmede “try-catch” kullanılır.
       “try block”’ta javadan yapılması gereken islemi yapması istenir,
       java “try block”’taki islemi problemsiz bir sekilde yaparsa “catch block”      	java tarafından okunmaz. “try-Block” da islem yapılırken “Exception”   	oluşursa “catch-block” devreye girer ve “catch-block” içerisindeki kod’lar
    	calisir.
    4) “try-block” da islemler yapılırken “Exception” olursa “try-block” icindeki
     Exception’dan sonraki kodlar calistirilmaz.

     */

    public static void main(String[] args) {

        System.out.println(divide(12, 3));
        System.out.println(divide(6, 0));

        System.out.println(divide2(12, 3));
        System.out.println(divide2(6, 0));

    }
    // 1.Way: Exception'i handle etmek ilk yol ve igrec yol.
    public static int divide(int a, int b) {

        if(b==0){
            return 0;
        }
        return a/b;
    }
    // 2.Way: Exception'i handle etmenin harika yolu.
    public static int divide2(int a, int b) {
        int result = 0;

      try {
          result= a/b;
          System.out.println("I am here");

      }catch (ArithmeticException e){ // Aritmetik Exception matematikle ilgili herhangi bir kural ihlali yapildiginda atilir.

          System.out.println("Do not divide any number by zero");
      }
        return result;
    }


}
