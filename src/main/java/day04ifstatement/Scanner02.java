package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
    Note: char variable'lari matematiksel islemlerde kullanirsaniz, Java size onlarin ASCII degerlerini kullanir.
    örnegim; System.out.println('A' + 'C'); ekranda AC yerine 132 yazdirir

    Note: Javada + seblonun iki anlami vardir i) Toplama ii) birlestirme (concatenation) .
         Java "+" sembolunu görünce önce toplama islemi yapmaya calisir, yapamazsa o zaman concatenation yapar.
     */
    public static void main(String[] args) {


 //     // Example 01: Kullanicidan ilk ve soyisimlerini aliniz ve ekrana bas harflerini yazdiriniz.
 //     // örn Ali Can ==> AC
 //
      Scanner input = new Scanner(System.in);
 //     System.out.println("Ilk isminiz giriniz...");
 //     char ilk = input.next().charAt(0);
 //     System.out.println("Soy isminizi giriniz...");
 //     char son= input.next().charAt(0);
 //     // char=> karakter demek At -de da'dir yani anlami girilen karakterden charAt(x) x indextedki karakteri al demek unutmayalim ki index 0 baslar.

 //     System.out.println(""+ilk+son);

        /* + isaretinin anlami javada iki tanedir Toplama ve Birlestirme eger
        biz System.out.println(ilk+son); yaparsak bunu matematiksel islem zannedip bize ilk ve son char degerlerinin Ascii degerlerini verir
        ve bir bu iki degerin toplamini görürüz ancak basina bir bos bir string koyarsak artik bunu bir bilestirme olarak algilar, cünkü string'ler ile
        matematiksel islemler java yapamaz

         */

        // 2.Yol:

        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine();//Ali Can

        char ilkHarf = tamIsim.charAt(0);//A
       char sonHarf = tamIsim.split(" ")[1].charAt(0);

        System.out.println(""+ilkHarf+sonHarf);

        /* split parcalanmak demek, peki nerden parcalayacak tamIsim.split(" ")[1].charAt(0) --> sonra ilk space'ten parcala demek bu split(" "),
        peki [1] bu ne demek buda böldügü her parcaya bir index verir
         java Ali--> index 0, Can--> index 1 ben burda bunu kasdediyorum index birdeki elemani ver demek charAt(0) da Can daki 0. indexi ver demek


         */



    }
}
