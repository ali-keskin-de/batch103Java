package day11loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Example 1: 3 ten 6'ya kadar tamsayilarin toplamini bulunuz?

        int sum = 0;

        for (int i = 3; i <7 ; i++) {

            sum +=i;


        }

        // System.out.println(sum); Note: Eger her loop döngüsündeki sonucu görmek isterseniz sout’u loop’u içerisine koyarsiniz.
        System.out.println(sum);

        //Example 2: 3 ten 6'ya kadar tamsayilarin carpimini bulunuz?

        int multiply =1;
        for (int i = 3; i <7 ; i++) {

            multiply *= i;


        }
        System.out.println(multiply);

        //Example 3: Size verilen  bir sayinin rakamlari toplamini bulunuz ?

        // Note : Java'da tamsayiyi tamsayiya bölerseniz sonuc tamsayi olur. Java virgülden sonrasini yuvarlamaz siler.

        int num =385;
       num = Math.abs(num); // Math() methodu ile sayinin mutlak degerini aldik

        int sonuc = 0;

        for (int i = num; i >0 ; i=i/10) {

            sonuc = sonuc + i%10;
            System.out.println(i%10); // Bu bize her basmaktaki sayiyi verir. 583 olmali ilk birler basamagi ...
        }
        System.out.println("s = " +sonuc);

        //Example 4: Size verilen String'i tersten calistiran code yaziniz?

        // Kaba ==> abaK

        String str = "kaba";

        String ters = "";

        for (int i =str.length()-1; i>-1 ; i--) {
            char c = str.charAt(i);
            ters = ters + c;

        }

        System.out.println(ters);





    }
}
