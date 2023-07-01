package day34exceptions;

public class E01 {

    public static void main(String[] args) {
        System.out.println(convertStringToInteger("123") + 2); //125
        System.out.println(convertStringToInteger("12ab") + 2); //NumberFormatException


    }

    // Bir String'i Integer'a ceviren methodu yaziniz?
     public static int convertStringToInteger(String str){


        try {
           return Integer.valueOf(str);

        }catch(NumberFormatException e){
            // NumberFormatException valueOf() method'u non-digit characters iceren bir String ile kullanildiginda atilir.

            str = str.replaceAll("[^0-9]", "");
            return Integer.valueOf(str);

        }

     }

}
