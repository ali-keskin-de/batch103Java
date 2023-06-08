package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {


    public static void main(String[] args) {

        /*
                  1) Math.min() :

                   min() methodu, verilen iki sayı arasındaki en küçük sayıyı döndürür. İki parametre alır
                   ve bu parametreler arasındaki en küçük değeri döndürür.

                    Örneğin:
                             int minNumber = Math.min(5, 10);
                             System.out.println(minNumber); // Çıktı: 5

                   Yukarıdaki örnekte, min() methodu 5 ve 10 parametrelerini alır ve 5'i döndürür,
                    çünkü 5, verilen sayılar arasında en küçük olanıdır.


                 2) Math.max():

                  max() methodu ise verilen iki sayı arasındaki en büyük sayıyı döndürür. İki parametre alır
                  ve bu parametreler arasındaki en büyük değeri döndürür.

                  Örneğin:
                          int maxNumber = Math.max(5, 10);
                          System.out.println(maxNumber); // Çıktı: 10


                Yukarıdaki örnekte, max() methodu 5 ve 10 parametrelerini alır ve 10'u döndürür,
                 çünkü 10, verilen sayılar arasında en büyük olanıdır.

         */

        // Example 2: Size verilen pozitif ve negatif elemanlar iceren bir integer array'deki "en büyük negatif" ve "en kücük pozitif" elemanlari bulunuz.

        int arr[] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr);
         int maxNegative = arr[0];             // reference deger bu deger yardimiyla kiyaslama yapacagiz
         int minPositive = arr[arr.length-1];  // reference deger bu deger yardimiyla kiyaslama yapacagiz

        for (int w:arr
             ) {

            if (w <0){
                maxNegative = Math.max(maxNegative, w);
            }
            if (w>0){
                minPositive = Math.min(minPositive, w);
            }


        }
        System.out.println(" max negative sayi :  " + maxNegative + " ve min positive sayi : " + minPositive);



    }
}
