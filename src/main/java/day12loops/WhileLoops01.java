package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

        //Example 1: 3 ten 10 'a kadar tamsayilari ayni satirda ekrana yazdiran code yaziniz.

        //1.Weg

        for (int i = 3; i <11 ; i++) {
            System.out.print(" " + i);

        }
        //2.Weg
        System.out.println();
        int i = 3;

        while (i < 11) {

            System.out.print(" " + i);

            i++;
        }

        System.out.println();
        // Example 2: 17 den 4 'e kadar tüm cift sayilari ekrana ayni satirda yazdiran kodu yazdiriniz.

        int s = 17;

        while (s > 3) {
            if (s%2 == 0){
                System.out.print(s + " ");
            }
            s--;

        }
        System.out.println();

        // Example 3: 12'de 67'e kadar sayilarin toplamini veren kodu yaziniz.

        int e = 12;// baslangic degeri
        int sum = 0;

        while(e<68){ // sart

            sum = sum + e;


            e++;
        }
        System.out.println(sum);

        // Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz

        int num = 3851;
        num = Math.abs(num);
        int result =0;

        while (num>0) {

            result = result + num%10;

            num=num/10;
        }
        System.out.println(result);

        // Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz.
        // 3 ==> 3x1=3  3x2=6  3x3=9 ... 3x10=30

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen bir sayi giriniz");
        int sayi =input.nextInt();

        int a = 1; // baslangic degeri
             //condition
        while (a<11){

            System.out.println(sayi + " x " + a + " = " + (sayi * a));// code block (scoop) arasinda kalankisim
            a++;
        }



    }


}
