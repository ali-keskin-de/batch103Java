package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    /*
    Kullanicidan gün sayisini aliniz gün ismini yazsin.

    1==> Pazar, 2 ===> Pazertesi
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Nummer des Tages ein... ");
        byte tagNo = input.nextByte();

        //1. Weg.

        if (tagNo==1){
            System.out.println("Sonntag");
        } else if (tagNo==2) {
            System.out.println("Montag");

        }else if (tagNo==3) {
            System.out.println("Dienstag");
        }else if (tagNo==4) {
            System.out.println("Mittwoch");
        }else if (tagNo==5) {
            System.out.println("Donnerstag");
        }else if (tagNo==6) {
            System.out.println("Freitag");
        }else if (tagNo==7) {
            System.out.println("Samstag");
        }else {
            System.out.println( "Bitte geben Sie eine passende Nummer ein" );
        }

        // 2.Weg

       /*
       Case bedeutung Situation (Durum).
        */

        switch (tagNo){
            case 1:
                System.out.println("Sonntag");
                break;
            case 2:
                System.out.println("Montag");
                break;
            case 3:
                System.out.println("Dienstag");
                break;
            case 4:
                System.out.println("Mittwoch");
                break;
            case 5:
                System.out.println("Donnerstag");
                break;
            case 6:
                System.out.println("Freitag");
                break;
            case 7:
                System.out.println("Samstag");
                break;
            default:
                System.out.println("Bitte geben Sie passende Nummer ein");


        }

    }

}
