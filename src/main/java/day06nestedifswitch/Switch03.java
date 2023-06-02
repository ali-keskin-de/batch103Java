package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Note : Switch de sadece int, byte, short, char,String data tipleri kullanilabilir
        // Note : Eger 3 den fazla durum varsa switch() tercih ederim (Hocanin kisisel tercihi)

        // kullanicidan islem ve iki sayi alarak silemin sonucunu ekrana yazdiran basit bir hesap makinasi yapiniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yapacaginiz islemi yaziniz: topla, cikar, carpim, bölüm");
        String islemTürü = input.next().toLowerCase();

        System.out.println("Lütfen iki sayi giriniz");
        double num1  =input.nextDouble();
        double num2  =input.nextDouble();

        switch (islemTürü) {
            case "topla":
                System.out.println("Toplam = " + (num1 + num2));
                break;
            case "cikar":
                System.out.println("fark = " + (num1 - num2));
                break;
            case "carpim":
                System.out.println("carpim = "+(num1*num2));
                break;
            case "bölüm":
                System.out.println("bölüm = "+(num1/num2));
                break;
            default:
                System.out.println("bu islem tanimlanmamistir");
        }
    }
}
