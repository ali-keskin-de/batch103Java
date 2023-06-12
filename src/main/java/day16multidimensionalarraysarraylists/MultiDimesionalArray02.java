package day16multidimensionalarraysarraylists;

public class MultiDimesionalArray02 {



    public static void main(String[] args) {
        // Bir Multidimensional array'de en kücük ve en büyük elemani veren kodu yazinniz.

        int arr [][] = {{2, 5, 1}, {83, 75}};

        int maxElement =arr[0][0];
        int minElement =arr[0][0];
        for (int w[]:arr
             ) {
            for (int k:w
                 ) {
                maxElement = Math.max(maxElement, k);
                minElement = Math.min(minElement,k);
            }

        }
        System.out.println("En kücük sayi : "+ minElement);
        System.out.println("En büyük sayi : "+ maxElement);

    }

}
