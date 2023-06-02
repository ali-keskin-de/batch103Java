package day05ifstatetment;

import java.util.Scanner;

public class IfStatement03 {

    /*
    Iki tane String'in bir birine esit olup olmadigini anlamak icin "==" degil ,"equals" kullaniriz.
    Iki tane String'in bir birine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir.

      i) equals() ==> Büyük harf ve kücük harf hassasiyeti vardir; yani "A" ile "a" ayni degildir.
      ii) equalsIgnoreCase() ==> Büyük harf ve kücük harf hassasiyeti yoktur; yani "A" ile "a" aynidir.

     */
    public static void main(String[] args) {

        // Example 1: kullanicidan gün ismi aliniz ve kullaniciya hafta ici mi, haftasonumu söyleyelim


        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz...");
        String gun = input.next();
       // 1.yol
        if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta Sonu...");
        } else if(gun.equalsIgnoreCase("Pazertesi")){
            System.out.println("Hafta Ici...");
        }else if(gun.equalsIgnoreCase("Sali")){
            System.out.println("Hafta Ici...");
        }else if(gun.equalsIgnoreCase("Carsamba")){
            System.out.println("Hafta Ici...");
        }else if(gun.equalsIgnoreCase("Persembe")){
            System.out.println("Hafta Ici...");
        }else if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta Ici...");
        }else if(gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta Sonu...");
        }else {
            System.out.println("Gecerli bir gün ismi giriniz");
        }
        // 2.yol

        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi") ){
            System.out.println("Hafta Sonu...");
        } else if (gun.equalsIgnoreCase("Pazertesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta Ici...");

        }else {
            System.out.println("Gecerli bir gün ismi giriniz");
        }

        // 3.Yol:
        // Kod standartlarinda parantez ici kodlari olabildigince kisa tutmaya calisiriz.
        boolean haftaSonu =gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIci = gun.equalsIgnoreCase("Pazertesi") ||
                           gun.equalsIgnoreCase("Sali") ||
                           gun.equalsIgnoreCase("Carsamba") ||
                           gun.equalsIgnoreCase("Persembe") ||
                           gun.equalsIgnoreCase("Cuma");

        if (haftaSonu){
            System.out.println("Hafta Sonu...");
        } else if (haftaIci) {
            System.out.println("Hafta Ici...");

        }else {
            System.out.println("Gecerli bir gün ismi giriniz");
        }

    }
}
