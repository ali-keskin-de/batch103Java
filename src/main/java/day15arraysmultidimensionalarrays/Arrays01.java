package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        // binarySearch() Methodu bir elemanin Array'de var olup olmadigini kontrol eder.
        //                  binarySearch() Methodunu kullanmadan önce mutlaka sort() methodu'u kullanmalisiniz.
        //                  binarySearch() Methodunu aradiginiz eleman array'de varsa o elemanin index'ini return eder.
        //                  binarySearch() Methodunu aradiginiz eleman array'de yoksa "-a" seklinde bir negatif sayi alirsiniz.
        //                  Bu sayidaki " - " isaretinin anlami be eleman array'de yok demektir, "a" 'nin anlami olsaydi kacinci sirada olurdu demektir.

        //                  binarySearch() tekrarlayan elemanlar icin kullanilmaz.



        int arr[] = {12, 31, 43, 14};
        int sayi = 43;

        Arrays.sort(arr);//[12, 14, 31, 43]
        System.out.println(Arrays.toString(arr));//[12, 14, 31, 43]

        int idx = Arrays.binarySearch(arr, sayi);
        System.out.println(idx);//3 sayi elemanin kacinci index'te oldugunu verir.

        int sayi2 = 17;

        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc);// -3 yani 17 elemani array'in icinde olsaydi 3 sirada olurdu.


    }
}
