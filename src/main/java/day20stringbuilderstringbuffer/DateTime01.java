package day20stringbuilderstringbuffer;

import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {

    public static void main(String[] args) {

        // Example 8: Tom, Ali'den 3 yil 8 ay 13 gün sonra doğdu. Ali ise Veli'den 1 yıl 15 gün önce doğdu.
        //            Tom'un doğum tarihi 18 Kasım 2011 ise veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011, Month.NOVEMBER,18);

        LocalDate dobAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);
        // Tom, Ali'den sonra doğduğunda tuna doğum tarihi Ali'nin doğum tarihinden daha büyük bir sayı olacaktır.
        // Bu sebepten minus metodudur kullandık Ancak böylelikle Ali'nin doğum tarihini ulaşabiliriz.

        LocalDate dobVeli = dobAli.plusYears(1).plusMonths(0).plusDays(15);

        // Ali veliden önce doğduğundan Ali'nin doğum tarihi sayısal olarak Veli'nin doğum tarihin ney daha küçük bir sayı.
        // Bu sebepten büyük sayı elde edebilmek için Ali'nin doğum sayi ekleme yapmak zorundayız.
        // Bundan ötürü ulus metodunu kullandık.

        System.out.println("Ali : " + dobAli);
        System.out.println("Veli : " + dobVeli);


    }
}
