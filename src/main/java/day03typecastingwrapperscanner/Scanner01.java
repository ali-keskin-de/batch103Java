package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    // Scanner kullanicidan data almaya yarar, Scanner  kullanici ile etkilesim kurmanizi saglar.
    // Scanner bir java Class'idir. Bu class'i kullanabilmek import etmek gerekir, scanner classi util kütüphanesindedir.
    //Util faydali demek.
    public static void main(String[] args) {

                         // Kullanicidan Data almak icin yapilmasi gerekenler.

              // 1.Adim: Scanner Class'indan bir object olusturun ve Costurtur'in icerisine (System.in) yazilir.
            Scanner input = new Scanner(System.in);

            // 2. Adim: Kullaniciya bir mesaj verilir.
            System.out.println("Hey kullanici bana yasini ver");

           // 3. Adim: Kullanicidan aldigimiz datayi bir variable koyariz.
           byte age = input.nextByte();

        System.out.println("Hey senin yasin " + age);

    }
}
