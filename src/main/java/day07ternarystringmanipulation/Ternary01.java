package day07ternarystringmanipulation;

import java.util.Objects;

public class Ternary01 {
    public static void main(String[] args) {


        // Example 1: bir sayinin pozitif olup olmadigini ekrana yazdirin.

        // 1.way: if-else

        int a = 12;
        if (a>0){
            System.out.println("Pozitif");
        }else {
            System.out.println("Negatif");

        }

        // 2.way: ternary
                    // Condition  operator   condition dogru ise uyulanacak code :   Dogru degilse uygulanacak kode

        String sonuc = a>0        ?         "Pozitif"                           :             "Pozitif Degil";

        System.out.println(sonuc);

        // Example 2: iki sayidan kücük olani yazdiran kodu yaziniz.

        int b = 12;
        int c = 23;

        int min = b<c ? b : c ;

        System.out.println(min);

        // Example 3: verilen sayinin mutlak degerini hesaplayiniz.


        int d = -45;

      int abs =  d>0 ? d : d*(-1);

        System.out.println(abs);

        // Example 4: iki tane sayi ayni ise bu sayilari carpiniz degilse "Islem yapamam" mesaji veriniz.

        int e = 12;
        int f = 10;

        Object islem = (e>0 && f>0) || (e<0 && f<0)  ? e*f : "Islem yapamam";

        // Note : Eger ternary sonucu farkli data typeleri return ederse data type bütün class'larin atasi olan Objeckt class(type) secilir.

        // Javada her classin en az bir tane "parent" classi vardir, sadece "Object" class'in parent class'i yoktur





    }


}
