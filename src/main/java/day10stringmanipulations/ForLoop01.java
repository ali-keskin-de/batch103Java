package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example 1: Ekrana 5 defa "Hi" yazdirin.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // Tekrarli islemler icin Loop kullanilir.
        // Dört cesit Loop vardir
        // i) for-loop
        // ii) while-loop
        // iii) do-while-loop
        // iv) for-each-loop

        // i) for-loop
        // Example 2: Ekrana 5 defa "Hi" yazdirin.

        /*
             -Baslangic degeri i'nin ;   i calisma sarti ; i'nin artirma (Increment), veya azaltma (Decrement)
        for (int i = 0          ;              i < 5;                   i++) {
                    System.out.println("Hi");

                }
         */
        // java sagdan sola yukardan asagiya dogru code'lari okur.

        for (int i = 1; i < 6; i = i+1) {
            System.out.println("Hi");

        }


        // Example 3: 4 den 7'ye kadar tüm tamsayilari ekrana yazdiriniz.

        for (int i = 4; i <8 ; i++) {

            System.out.print(i + " " );

        }
        System.out.println();

        // Example 4: 14 den 5 e kadar tamsayilari yazdiriniz.

        for (int i = 14; i >4 ; i--) {

            System.out.print(i + " ");

        }
        System.out.println();
        // Example 5: 14 den 5 e kadar ciftsayilari yazdiriniz.

        for (int i = 14; i >5 ; i=i-2) {

            System.out.print(i + " ");

        }
        System.out.println();

        // 2.Yol

        for (int i = 14; i >5 ; i--) {

            if (i%2 == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println();
        // Example 6: 28 den 157 e kadar teksayilari yazdiriniz.

        for (int i = 28; i <157 ; i++) {

            if (i%2 != 0){
                System.out.print(i + " ");
            }

        }
        System.out.println();

        // Example 7 "Java" String'ini "J*a*v*a" String'ine ceviren kodu yaziniz

        String str = "Java";

        for (int i = 0; i <str.length() ; i++) {

            System.out.print(str.charAt(i) + "*");

        }
        System.out.println();
        // Example 7: Size verilen string'teki tekrarsiz karakterleri yazdiriniz

        String s = "Hellooo Ali";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (s.indexOf(c) == s.lastIndexOf(c)){
                System.out.print(c);
            }

        }





    }
}
