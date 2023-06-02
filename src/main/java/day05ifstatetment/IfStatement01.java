package day05ifstatetment;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        // Example 1: Kullanicidan alinan sayinin tek mi ,cift mi oldugunu ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int s = input.nextInt();


       // 1.Yol
        if(s%2==0){
            System.out.println("Cift sayi...");
        }
        // Javada esit degildir "!=" sembolleri ile ifade edilir.
        if (s%2!=0){
            System.out.println("Tek sayi...");
        }
       // 2.yol

        if(s%2==0){
            System.out.println("Cift sayi...");
        }else {
            System.out.println("Tek sayi...");
        }
        // else ingilizcede degilse anlaminda.

        // Example 2: Bir sayinin negative, positive,nötür oldugunu yazdirin.

        System.out.println("bir sayi giriniz...");
         double d = input.nextDouble();

         if(d>0){
             System.out.println("Sayi Positive");
         }else if (d==0){
             System.out.println("sayi nötür");
         }else {
             System.out.println("Sayi Negative");
         }

    }
}
