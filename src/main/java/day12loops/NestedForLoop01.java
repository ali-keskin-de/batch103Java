package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        // Example 1: Asagidaki sekli ekrana yazdiran code yazdirin.
        //        *****
        //        *****
        //        *****


        for (int i = 1; i <4 ; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz");
        int satir = input.nextInt();

        System.out.println("Lütfen sütün sayisini giriniz");
        int sütün = input.nextInt();

        System.out.println(" Lütfen girmek istediginiz character'i giriniz");
        char c = input.next().charAt(0);

        for (int i = 1; i <satir +1 ; i++) {

            for (int j = 1; j <sütün+1 ; j++) {
                System.out.print(c);

            }
            System.out.println();

        }
        // Example 2: Asagidaki sekli cizen code yaziniz.
        //     1
        //     1 2
        //     1 2 3
        //     1 2 3 4

        for (int i = 1; i <6 ; i++) {

            for (int j = 1; j <i ; j++) {
                System.out.print(" " + j);

            }
            System.out.println();

        }

        // Example 3: Asagidaki sekli cizen code yaziniz
        //       * * * *
        //       * * *
        //       * *
        //       *
        int row =4;

        for (int i =1 ; i <row +1 ; i++) {

            for (int j = row; j+1 >i ; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }





    }
}
