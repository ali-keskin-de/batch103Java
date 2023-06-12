package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    public static void main(String[] args) {

        // Bir Arry'in elemanlari Array ise bu Array'ler "Multidimensional Array" dir.

        // 1) Multidimesional Array nasil olusturulur.

        int arr[][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]

        // 2) multidimensiol Array'lere eleman ekleme

        arr[0][0] =3;
        arr[0][1] =-4;
        arr[1][0] =6;
        arr[1][1] =18;
        arr[2][0] =-7;
        arr[2][1] =0;

        // 3) multidimensiol Array'lere console'a nasil yazdirilir.

        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]

        // 4) Multidimesional array'lerde elemanlardan biri nasil yazdirilir.
        System.out.println(Arrays.toString(arr[1])); //[6, 18]
        // arr[1] bir array oldugundan dolayi bir array'i nasil yazdiriyorsak äyle yazdiririz

        // 5) Multidimesional array'lerde ic elemanlardan biri nasil yazdirilir.

        System.out.println(arr[1][0]);// 6
        // bu int bir deger oldugundan dirket böyle yazdirabiliriz


        // Example 1: String bir multidimensional Array olusturunuz
        //  elemanlari ekleyiniz
        // toplam eleman sayisini ekrana yazdiran kodu yaziniz

        String brr[][] = new String[4][3];

        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";

        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";

        brr[2][0] = "G";
        brr[2][1] = "H";
        brr[2][2] = "I";

        brr[3][0] = "J";
        brr[3][1] = "K";
        brr[3][2] = "L";

        System.out.println(Arrays.deepToString(brr));//[[A, B, C], [D, E, F], [G, H, I], [J, K, L]]

        int sumElement = 0;

        for (String [] w: brr
             ) {
            sumElement = sumElement +w.length;


        }

        System.out.println(sumElement);


    }
}
