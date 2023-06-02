package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        // Kullanicidan bir diktörgenin  en ve boyunu alip alan ve cevresini hesaplayiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("diktörtgenin en'ini veriniz");
        int en = input.nextInt();

        System.out.println("diktörtgenin Boyunu veriniz");
        int boy = input.nextInt();

        System.out.println("Alan = " + en * boy);

        System.out.println("cevre = " + 2 * (en + boy));
    }
}
