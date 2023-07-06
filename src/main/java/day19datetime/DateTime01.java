package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {


        // Javada iki şekilde obje oluşturabiliriz.
        // 1- New Keyword ile class'ta constructor kullanarak sıfırdan bir obje oluşturabiliriz.
        // 2- İkincisi mevcut obje'yi dönüştürerek oluşturabiliriz. Asagidabu sekilde olusturdugumuz objeckt'i görebilirsiniz.


        // Example 1: "Anlık tarihi"(Current Date) Ekrana yazdıran kodu yazınız.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2023-06-15

        // Example 2: "Anlık zaman"(Current Time) Ekrana yazdıran kodu yazınız.

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);// 20:47:40.914936

        // Example 3:  "Anlık tarih" (Current Date) ve "Anlık zaman" (Current Time) Ekrana yazdıran kodu yazınız.

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);// 2023-06-15T20:51:43.789829

        // Example 4: Japonyadaki "Anlık tarih" (Current Date) ve "Anlık zaman" (Current Time) Ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2023-06-16T03:57:58.748503

        // Example 5: Istanbuldaki "Anlık tarih" (Current Date) ve "Anlık zaman" (Current Time) Ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTimeInIstanbul= LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);//2023-06-15T22:00:24.437296

        // Note : Genellikle önce kita ismi sonra sehir ismi yazilir.

        // Example 6: Bugünden 789 gün sonra emekli olacağına göre, emeklilik tarihini hesaplayan kodu yazınız.

        LocalDate countDate = LocalDate.of(2023, 6, 15);

        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        // Example 7: İki çocuğunuzun doğum tarihleri arasındaki farkı gün olarak hesaplayan kodu yazınız.

        LocalDate dobSafiye = LocalDate.of(2017, 01, 04);
        LocalDate dobRukiye = LocalDate.of(2019, 04, 16);

        // Between daha eski olan tarih daha önce yazilmali.
        long diff = ChronoUnit.DAYS.between(dobSafiye, dobRukiye);
        System.out.println(diff);

        // Example 8: Tom, Ali'den 3 yil 8 ay 13 gün sonra doğdu. Ali ise Veli'den 1 yıl 15 gün önce doğdu.
        //            Tom'un doğum tarihi 18 Kasım 2011 ise veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011, 11, 18);
        LocalDate dobAli= dobTom.minusYears(3).minusMonths(8).minusDays(13); // Method Chain.
        System.out.println("Ali'nin dogum tarihi "+dobAli); // 2008-03-05
       LocalDate dobVeli = dobAli.plusYears(1).plusMonths(0).plusDays(15); // 2009-03-20
        System.out.println("Velinin dogum Tarihi : " + dobVeli);

        //Example 9: Istanbul'un fethi ile cumhuriyetin kurulmasi arasinda kac ay oldugunu gösteren kodu yaziniz.
        //         29 Mayis 1453 ==> Istabul'un fethi       29 Ekim 1923 ==> Cumhuriyetin kurulusu

        LocalDate fetihIstanbul = LocalDate.of(1453, 05, 29);
        LocalDate kurulusCumhuriyet = LocalDate.of(1923, 10, 29);

       long diffMonths = ChronoUnit.MONTHS.between(fetihIstanbul, kurulusCumhuriyet);
        System.out.println(diffMonths);

        // Example 10 : Verilen tarihin hangi burcta olduğunu gösteren kodu yazınız.

        LocalDate myDate = LocalDate.of(1989, 3, 28);

        int day = myDate.getDayOfMonth(); // yukardaki tarihte ayin gününü verir.
        System.out.println(day);
        int month = myDate.getMonthValue();// yukardaki date ayini verir.
                   myDate.getMonth(); // bana yukardaki date'i ayinin ismini verir

        System.out.println(day + "-" + month); // 7-12

        if (day>=21 && month==3){

                System.out.println("Koc burcu");

        } else if (day<=20 && month==4) {

            System.out.println("Koc burcu");
        } else if (day>=21 && month==4) {
            System.out.println("Boga burcu");

        }else if (day<=20 && month==5){
            System.out.println("Boga burcu");
        }
        // 2.Yol

        if ((day>=21 && month==3) ||(day<=20 && month==4)){
            System.out.println("Koc burcu");
        } else if ((day>=21 && month==4) || (day<=20 && month==5)) {
            System.out.println("Boga burcu");

        }


    }
}
