package day35exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
   /*
  1) Runtime Exceptions : Kodları calistirirken alinan Exception’lara Runtime Exception denir.
   ArithmeticException,NullPointerException,NumberFormatException,ArrayIndexOutOfBoundsException,
   StringIndexOutOfBoundsException "Runntime Exceptions"'a örnektir.

  Runn Time exception'lara "Unchecked Exception"  denir

  2) Compiletime Exception :  Kodlar yazılırken alinan exceptionlara denilmektedir.
         - compile : derlemek demektir, yani yazılan kodların 0 ve 1 çevrilmesidir.

   Compile Time Exception’lar 2Checked Exception”’da denir.!!!!!

   3) Java'da hatalar temelde 2 ayrilir.
      i) Exception   ii) Error'lar iii)- Virtual Machine Erro

      exception'lar handel edilenilir (cözülebilir problemler denilebilir)
      error'lar handel edilemeyen problemler(Çözülemeyen problemler denilebilir)
       örnek Error
       1- StackOverflow Error : stack memory'nin dolup calisamaz hale gelmesidir.
       2- Out of Memory Error : Buda Heap memory ile ilgilidir dolmasi durumunda alinir.
       3- Virtual Machine Erro

       Note : FileNotFoundException : Java’ya bir dosyayı bul dediğinizde, Java “dosyanın Adresi” ve “dosyanın varligi” konusunda hata olursa ne yapması gerektiğini söylenmesini ister.

          IOException : “IO” Input Out demektir.
      *** IOException, FileNotFoundException’in parentidir


    */

  // 1.Way : Exception'i method signature satirina ekledik.
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day35exceptions/TextFile");

        int i=0;
        while ((i=fis.read())!=-1) {

            System.out.print((char)i);

        }


    }

}
