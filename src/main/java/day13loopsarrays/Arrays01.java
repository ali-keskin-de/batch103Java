package day13loopsarrays;

import java.util.Arrays;
import java.util.Collection;

public class Arrays01 {

    /*
    1) Ayni data type'da ,coklu data'i depolamak icin Java 'nin olusturdugu yapilar vardir.
      Bu yapılardan birisi de Array'lerdir.


     */
    public static void main(String[] args) {

        // Array nasil olusturulur?
        int stdAges[] = new int[7];// [0, 0, 0, 0, 0, 0, 0] biz bu array olusturdugumuzda default degerlerden array'i boyu kadar koyar.


        // Array nasil yazdirilabilir?
        System.out.println(Arrays.toString(stdAges));

        // Array'e nasil eleman eklenir?

        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 15;
        stdAges[5] = 16;
        stdAges[6] = 17;

        System.out.println(Arrays.toString(stdAges)); //[12, 11, 13, 14, 15, 16, 17]

        // Array'deki Herhangi bir elemanı nasıl yazdıra bilirim?

        System.out.println(stdAges[4]);

        // Example 1: Array'deki En küçük ve en büyük elemanı ekrana yazdıriniz.

        Arrays.sort(stdAges);

        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];

        int son = stdAges[stdAges.length - 1];

        System.out.println(ilk + son);//28

        // Note : length() Bir method Stringler de kullanılır. "length" Array'lerde kullanilir.

        // Example 2: stdAges Array'i icin tüm elemanlarin toplamini ekrana yazdiran bir cosde yaziniz.

        //1.yol
        int tot = 0;
        for (int i = 0; i < stdAges.length; i++) {
            tot =tot + stdAges[i];
        }
        System.out.println("1 " + tot);

        // 2.yol  En gelismis Loop foreach Loop'tur.
        int sum = 0;
        for (int w: stdAges
             ) {
            sum = sum +w;

        }

        System.out.println("2 " + sum);

        // 3.yol
        int i= 0; //Baslangic degeri
        int toplam = 0;

        while(i<stdAges.length) {
            toplam = toplam + stdAges[i];

            i++; // Artis azalalis


        }
        System.out.println("3 " + toplam);

        // 4. yol

        int j= 0; // baslangic degeri
        int total = 0;

        do {
            total = total + stdAges[j];

          j++;
        }while (j<stdAges.length);

        System.out.println("4 " + total);


        // Example 3: String bir array olusturunuz
        //    Bu Array'ee 5 tane isim yerlestiriniz  [Ali, Tom, Veli, Kemal, Cem]
        //    Bu isimlerdeki karakter sayilarini ekrana yazdiriniz

        String names [] = new String[5];
        names[0] = "Ali";
        names[1] = "Tom";
        names[2] = "Veli";
        names[3] = "Kemal";
        names[4] = "Cem";

        System.out.println(Arrays.toString(names));

       int sumCharacterSayisi= 0;
        for (String w: names
             ) {
            sumCharacterSayisi += w.length();

        }
        System.out.println(sumCharacterSayisi);


        // Example 4: Char bir array olusturunuz
                    // Bu array'e 5 eleman ekleyiniz
                    // Bu array'deki sadece büyük harfleri ekrana yazdiriniz.

        char arr [] = new char[5];
        arr[0] = 'A';
        arr[1] = 'c';
        arr[2] = 'D';
        arr[3] = 'k';
        arr[4] = 'M';
        for ( char w: arr
             ) {
            if(w>='A' &&  w<='Z'){
                System.out.print(w);
            }

        }
    }



}
