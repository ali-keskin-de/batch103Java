package day05ifstatetment;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        // Example 1:  Kullanoco gun numarasi girsin ama ekranda gün ismini görsün.
        // 2==> Montag 3==> dienstag

        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasini giriniz... ");

        byte günNo = input.nextByte();

        if (günNo==1){
            System.out.println("Sonntag");
        } else if (günNo==2) {
            System.out.println("Montag");

        }else if (günNo==3) {
            System.out.println("Dienstag");

        }else if (günNo==4) {
            System.out.println("Mittwoch");

        }else if (günNo==5) {
            System.out.println("Donnerstag");

        }else if (günNo==6) {
            System.out.println("Freitag");

        }else if (günNo==7) {
            System.out.println("Samstag");

        }else {
            System.out.println("yanlis numara girdiniz; 1,2,3,4,5,6,7 sayilarindan biri olmalidir");
        }
    }
}
