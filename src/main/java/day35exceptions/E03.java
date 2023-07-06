package day35exceptions;

public class E03 {

    /*
                       interview sorusu:  Throw ile thorws arasindaki farklar  nelerdir?

                         1) "throws" method signature satirinda kullanilir,"throw" is method body icinde kullanilir.
                         2) "throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
                           "throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
                        3) "throw" dan sonra sadece Exception Class isimleri yazilir.
                           "throws" dan sonra Exception Class'tan object olusturulur.



     */

    public static void main(String[] args) {
        try {
            printAge(-1);
        }catch (IllegalArgumentException e) {
            System.out.println("Negative ages are not valid");
        }



    }

    // Example 1: Kullanicidan alinan yas'i console yazdiran methodu yaziniz.

    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Used negative integer for age");
        }
        System.out.println(age);

    }
}
