package day03typecastingwrapperscanner;

public class TypeCasting01 {

    // Type Casting: Bir numeric data tipini baska bir numeric data tipine cevirmektir.

    /*
    byte < short < long < int < float < double < boolean < char

    Büyükten kücüge gitmeye Explicit Narrowing denir. Örnegin short' ta byte'ta cevirmeler bir Explicit Narrowing'tir.

    Kücükten büyüge cevirmeyede Auto Widening denilmektedir. Örnegim short'u long'a cevirmeye denir.
     */

    public static void main(String[] args) {
         byte age = 23;

         int newAge = 23;

         long population = 1234;

         int newPopulation = (int) population;

         // Example 1: shot'u double'a ceviren kodu yaziniz.

        short numofStudents= 235;

        double newnumofStudents = numofStudents; // Auto Widening

        // float'i byte ceviren bir kod yaziniz?

        float price = 12.95F;

        byte newPrice = (byte)price; // Explicit Narrowing

        System.out.println(newPrice); // ==> Java ondalik sayiyi, tam sayiya yuvarlamaz,
                                     // ondalik sayinin tam olmayan kismini siler sadece tam sayiyi yazaz

        int number = 515;
         byte newNumber = (byte) number;

        System.out.println(newNumber); // 3 ==> java 515'i 256(byte taki sayilarin sayisi)'e böler kalani verir.


        int num = 510;

        byte newNum = (byte) num;

        System.out.println(newNum);// -2
         // mod 256 254 = -2 (mod256)

    }
}
