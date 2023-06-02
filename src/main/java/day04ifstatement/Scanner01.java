package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        /*
        Kullanicidan  ilk, orta ve soyismini alip ekrana yazdiriniz.

        Ali Mert Can
        123456678901

         */
      // 1. Yol
       Scanner input = new Scanner(System.in);

  //   System.out.println("Lütfen ilk isminizi giriniz...");
  //   String ilkIsim = input.next();

  //   System.out.println("Orta ismi giriniz...");
  //   String ortaIsim = input.next();

  //   System.out.println("Lütfen soyisminizi giriniz...");
  //   String soyisim = input.next(); // next methodu kullanicidan String degerleri almak icin kullanilir

  //   System.out.println("Lütfen tc kimlik numarasini giriniz...");
  //   String tcNo = input.next();

  //   System.out.println(ilkIsim+" "+ortaIsim+" "+soyisim+" ");
  //   System.out.println(tcNo);

  //   //2. Yol
  //   System.out.println("Ilk, orta ve soyisminizi giriniz ");

  //   String ilk =input.next();
  //   String orta= input.next();
  //   String soy= input.next();
  //   String tc= input.next();

  //   System.out.println(ilk + " " + orta + " " + soy + "");
  //   System.out.println(tc);

       // 3.yol

        System.out.println("ilk, orta ve soyisminizi giriniz...");

        String tamIsim = input.nextLine();

        System.out.println("kimlik numaranizi giriniz");
        String kimlikNo = input.next();

        System.out.println(tamIsim);

        System.out.println(kimlikNo);

        /*
        next() ==> Kullanicidan gelen String ifadenin sadece ilk tab'a kadar olani alir.
        nextLine() ==> kullanicidan gelen Strin ifadenin tamamini alir.
         */


    }
}
