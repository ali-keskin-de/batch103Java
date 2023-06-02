package day06nestedifswitch;

import java.util.Scanner;

public class Ifstatement01 {
    public static void main(String[] args) {

        // Type a code, get age from user and decide which stage on it
        // Kullanicidan yas degeri alan ve hangi yas evresinde oldugunu asagidaki tabloya göre ekrana yazdirin
        // 0 - 4 => baby
        // 5 - 12 => child
        // 13 - 20 => teenager
        // 21 - 30 => adult
        // else (not excepted age)

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yasinizi giriniz");
        int yas = input.nextInt();
        if (0>yas) {
            System.out.println(" Gecerli bir yas araligi giriniz");
        }else if(yas<5){
            System.out.println("Baby");
        } else if (yas<13) {
            System.out.println("Cocuk");

        } else if (yas<21) {
            System.out.println("Genc");

        } else if (yas<31) {
            System.out.println("Yetiskin");

        }else {
            System.out.println("Tanimlanmamis deger...");
        }
        // sinir degerlere bakilarak yapilan teste " Sinirt deger Analizi" denir.
        // Sinir Deger Analizi => Boundary Value Analyze Test

    }
}
