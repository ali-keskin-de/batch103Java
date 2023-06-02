package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        Kullaniciya ay ismi sorunuz  ve verdigi ay isminden sonraki ay isimlerini yazdiriniz.

         */
        // Note : toLowerCase() String bir degerde bütün harfleri kücük harflere cevirir
        // Note : toUprCase() String bir degerde bütün harfleri büyük harflere cevirir

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Monatnames ein");
        String nameMonat = input.next().toLowerCase();

        switch (nameMonat){
            case "januar":
            System.out.println("Januar");
            case "februar":
             System.out.println("Februa");
            case "marz":
                System.out.println("Marz");
            case "mai":
                System.out.println("Mai");
            case "Juni":
                System.out.println("Juni");
            case "juli":
                System.out.println("Juli");
            case "august":
                System.out.println("August");
            case "september":
                System.out.println("September");
            case "oktober" :
                System.out.println("Oktober");
            case "november":
                System.out.println("November");
            case "dezember" :
                System.out.println("Dezember");
                break;
            default:
                System.out.println("Bitte geben Sie passende Monatname ein");

    }


    }
}
