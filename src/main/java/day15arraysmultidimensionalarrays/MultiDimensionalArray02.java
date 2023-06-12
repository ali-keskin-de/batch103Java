package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray02 {


    public static void main(String[] args) {

       // MultiDimensional Array kisa yolla nasil olusturulur.

        char arr[][] = {{'a','b'}, {'C','D','E'}, {'?'}};

        System.out.println(Arrays.deepToString(arr)); //[[a, b], [C, D, E], [?]]

        // example 1: Bir String multidimensional array'de icinde "a" olan elemanlari console'e yazdir.

        String brr[][] = {{"learn", "java", "it"}, {"is", "easy"}};

        // 1.yol
        for (String [] w:brr
             ) {

            for (int i = 0; i <w.length ; i++) {

                if (w[i].contains("a")) {
                    System.out.print(w[i] +" ");

                }

            }

        }
        System.out.println();
        // 2.yol
        for (String [] w:brr
             ) {
            for (String k: w
                 ) {
                if (k.contains("a")){
                    System.out.print(k +" ");
                }

            }

        }

    }
}
