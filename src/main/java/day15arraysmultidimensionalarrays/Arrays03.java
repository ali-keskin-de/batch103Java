package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        // Example 1: Bir String'teki sesli harfleri sayisini bulan kodu yaziniz.
        // a,e,i,o,u,A,E,I,O,U

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay";
        str= str.toLowerCase();

        String words[]= str.split("");
        System.out.println(Arrays.toString(words));

        int counter=0;
        for (String w: words
             ) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }

        }
        System.out.println(counter);

   // birden fazla durum icin ayni seyi yapacaksaniz yukardaki switch syntaksini kullanabiliriz.Böylelikle code tekrarindan kurtuluruz.

    }
}
