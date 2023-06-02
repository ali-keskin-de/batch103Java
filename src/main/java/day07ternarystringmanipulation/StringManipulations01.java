package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*
                                      String Class Methodlari


             1) equals():  i) iki tane String'in ayni olup olmadigini anlamamiza yarar.
                          ii)  equals() method'u "boolean" return eder.

            2) equalsIgnoreCase(): i) Iki tane String'in ayni olup aömadigini buyuk harf kücük harfe dikkat etmeden anlamaniza yarar.
                                   (ignore : görmezden gel demek, Case : büyük harf kücük harf durumu demek,
                                    yani ignorecase kücük büyük olma durumunu görmezden gel demek)

                                   ii) eqaulsIgnoreCase() method'u bize boolean return eder.

            3) toLowerCase(): i) Bir String'teki bütün harfleri kücük harfe cevirmek icin kullanilir.
                              ii) toLowerCase(): method'u bize String return eder.

            4) toUpperCase(): i) Bir String'teki bütün harfleri büyük harfe cevirmek icin kullanilir.
                              ii) toUpperCase(): method'u bize String return eder.

           5) chartAt(): i) Bir string'teki belli bir indexteki characteri almak icin kullanmak icin kullanilir.
                         ii) charAt() method'u bize char data type'de bir veri return eder.

           6) length() : i) Bir stringteki karakter sayisini sayar.
                         ii) bize int data type'de bir veri return eder.

           7) contains() : i) Bir String'te belli bir karakterin veya karakterlerin var olup olmadigini anlamak icin kullanilir.
                           ii)  contains() method'u bize boolean return eder.

           8) split(): i) Bir String'i istedigimiz karakterden bölmeye yarar.
                       ii) split() method'u "Array" return eder.


         */

        /*
        Example :  Bir password'un gecerli olup olmadigini asagidaki kurallara göre kontrol eden kodu yaziniz.
                 i) En az 8 character icermeli
                 ii) Space character icermemeli
                 iii) ilk harfi "M" veya "m" olmalidir
                 iv) son characteri "?" olmalidir.

         */

        String pwd = "Manisa12?";

        //  i) En az 8 character icermeli
        boolean first =pwd.length()>7;

        // ii) Space character icermemeli ! isareti not anlamindadir
        boolean second = !pwd.contains(" ");

        // iii) ilk harfi "M" veya "m" olmalidir
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        // iv) son characteri "?" olmalidir.

        boolean fourth= pwd.charAt(pwd.length() - 1)=='?';

        System.out.println(first && second && third && fourth );








    }

}
