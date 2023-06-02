package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
        Note: Java primitive lere methodlar ekleyerek yeni bir Structure (yapi)  olusturdu, bu yapiya "Wrapper Class" denir.

        Wrapper : seker kayitlarina sakiz kagitlarina veya dürümü saran kagitlara wrapper denir.

    Primitive      Wrapper
        byte  ==>  Byte
        short ==>  Short
        int   ==>  Integer   **
        long  ==>  Long
       float  ==>  Float
       double ==> Double
      boolean ==> Boolean
         char ==> Character  **

         Wrapper Class'larda Non-Primitivedir

         */

        byte primitiveByte = 12; // primitiveByte yazip nokta koydugunuzda method göremeyiz cünkü primitive datalarin methodlari yoktur.

        Byte wrapperByte = 12;// wrapperByte yazip nokta koydugumuzda method'lar gelir cünkü wrapper Class'lar Non-primitive'dir ve methodlar icerirler.

        // Example 1:  byte data type'da en kücük deger ve en büyük degerleri ekrana yazdiriniz.

        System.out.println(Byte.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);

        // Example 2: short, int , long data type'lerinin en büyük ve kücük degerlerini ekrana yazdiriniz.

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // Primitive datalar nasil wrapper cevirilir. Autoboxing denilmekte bu isleme.



        float f1 = 13.99F;

        Float wrapperF1 = f1;

        // wrapper datalar nasil primitve cevirilir.Unboxining denir buna.

        Character w1 ='s';

        char primitiveW1 = w1;

        // Note: Java unboxing ve Auto boxing i java tarafindan otomatik olarak yapilir.




    }
}
