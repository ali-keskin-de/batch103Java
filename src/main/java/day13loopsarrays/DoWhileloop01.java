package day13loopsarrays;

import java.util.Scanner;

public class DoWhileloop01 {
    public static void main(String[] args) {
        // Example 1: Kullanicidan bir sayi aliniz, sayi 100'den kücük ise ekrana "Kazandin!" yazdiriniz.
        //            Aksi halde ekrana "Kaybettiniz" yazdiriniz
        //            Kullanici kazandikca oyun devam etmeli.

        Scanner input = new Scanner(System.in);
        int num = 0;
 /*
        // 1.yol

        do{
            System.out.println("Lütfen bir tamsayi girniz");
            num = input.nextInt();
            if (num<100){
                System.out.println("Kazandin!");
            }


        }while (num<100);

        System.out.println("Kaybettin!");

  */

/*
        // 2.yol

        do {
            System.out.println("Lütfen bir tamsayi girniz");
             num =input.nextInt();

            if (num<100){
                System.out.println("Kazandin!");

            }else {
                System.out.println("Kaybettin!");
                break;
            }

        }while(true);

 */


        // Example 2: Kullanicidan ismini aliniz ilk harfinin büyük harf olup olmadigini kontrol ediniz.

        do {
            System.out.println("Lütfen bir isim giriniz");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf >='A' && ilkHarf<= 'Z' ){
                System.out.println("Ismi basariyla girdiniz");
            }else {
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir.");
                break;
            }

        }while(true);

        // Infinite Loop: Sonsuz döngü
        // Artirma azlatma kisminda hata yapilirsa infinite loop sorunu olusur.
   /*
        for (int i = 1; i <4 ; i--) {

            System.out.println("Hi!");

        }

   */

    }


}
