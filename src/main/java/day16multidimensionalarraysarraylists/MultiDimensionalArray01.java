package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {


        // Bir tane integer Multidimensional Array olusturunuz
        // Bu array'deki tüm sayilari toplamini veren kosdu yaziniz

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int sum = 0;

        // 1.yol

        for (int [] w: arr
             ) {

            for (int i = 0; i <w.length ; i++) {

                sum+= w[i];

            }

        }
        System.out.println(sum);

        // 2.yol
        int sum1=0;

        for (int [] w:arr
             ) {

            for (int k: w
                 ) {

                sum1+= k;

            }

        }
        System.out.println(sum1);

        /*
        Array veya Collection varsa "for-each-loop" kullanmak ilk tecihiniz olsun.
         */

        // Bir Multidimensional Array'i normal bir array'e ceviriniz.
        // {{2, 5, 1}, {32, 75}} ==> {2, 5, 1, 32, 75}

        int brr [][] = {{2, 5, 1}, {32, 75}};

        int count =0;
        for (int[] w:brr
             ) {
            count = count +w.length;
        }
        System.out.println(count);

        int crr[] = new int[count];

        int idx = 0;

        //1.yol
    /*

        for (int w[]:brr
             ) {
            for (int k:w
                 ) {
                crr[idx] =k;
                idx++;

            }
        }
        System.out.println(Arrays.toString(crr));


    */
        // 2.yol

        for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < brr[i].length; j++) {

                crr [idx] = brr[i][j];
                idx++;

            }

        }
        System.out.println(Arrays.toString(crr));


    }
}
