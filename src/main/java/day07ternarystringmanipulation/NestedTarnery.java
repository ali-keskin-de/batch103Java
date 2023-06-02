package day07ternarystringmanipulation;

public class NestedTarnery {

    public static void main(String[] args) {
        /*
        Verilen yilin "Leab Year" (Artik Yil) olup olmadigini kontrol eden kodu yaziniz.

        i) Yil 100'e bälünürse 400'e de bölünmelidir. ==> 1600 Leap Year  , 1800 not Leap Year
        ii) Yil 100'e bölünmezse 4'e bölünmelidir     ==> 1996 Leap Year  , 2001 not Leap Year
         */

        int year = 1800;

      String result =  year%100==0 ? (year%400==0 ? "Leap Year" : "not Leap Year") : (year%4==0 ? "Leap Year" : "not Leap Year");

        System.out.println(result);

         /*
           Asagidaki kurallara göre kodun dogru olup olmadigini kontrol ediniz.
           i) Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir.
           ii) Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir.
         */
         String pwd = "i2a3de54";

        String pwdSonuc = pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Gecerli password" : "Gecersiz password" ) : (pwd.charAt(0)=='i' ? "Gecerli password" : "Gecersiz password") ;


        System.out.println(pwdSonuc);

    }
}
