package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        // Example 1: Java'da aldiginiz Date'i "ay/gün/yil" olacak sekilde yazdiriniz.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2023-06-16

        // Ayı Rakam olarak görmek istiyorsa "MM/dd/yyyy" yazariz
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatted1 = dtf1.format(currentDate);
        System.out.println(formatted1); //   06/16/2023

        // Ayın kısaltmasını görmek istiyorsak "MMM/dd/yyyy" yazariz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formatted2 = dtf2.format(currentDate);
        System.out.println(formatted2); //  Haz/16/2023

        // Ayın tamamini görmek istiyorsak "MMMM/dd/yyyy" yazariz

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formatted3 = dtf3.format(currentDate);
        System.out.println(formatted3); // Haziran/16/2023

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formatted4 = dtf4.format(currentDate); // 6/16/2023
        System.out.println(formatted4);// bu tek basamakli aylari 1, 2 3 sekilinde yazdirir iken;
                                      // MM li olan format ise 01, 02, 03... seklinde yazdirir

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
       String formatted5 = dtf5.format(currentDate);
        System.out.println(formatted5);// 06/16/23

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");
        String formatted6 = dtf6.format(currentDate);
        System.out.println(formatted6);// 06/16/23  MM/dd/yy bu Formattan farkı tek basamaklı gün sayılarında 1, 2 ,3  seklinde iken,
                                       // "MM/dd/yy" Bu formatta ise 01, 02, 03, .... seklinde olur.

        // Java'dan aldiginiz Time'in formatini degistiriniz.
        LocalTime currentDate1 = LocalTime.now();
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm"); // "hh:mm" böyle yaparsak saat 16:00 iken bize 04:00 verir
                                                                      // ancak bu böyle dogru degildir.  Bu sebepten HH:mm yapmaliyiz
                                                                     // 24 saat sistemine cevirir.

        String formatted7 = dtf7.format(currentDate1);
        System.out.println(formatted7);

        LocalTime myTime1= LocalTime.of(16, 23, 54, 2354);
        System.out.println(myTime1);
        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");// böyle yaparsak java bize gündüzmü gecemi oldugunu AM ve ya PM koyarak gösterir.
        String formattedMyTime1 = dtf8.format(myTime1);
        System.out.println(formattedMyTime1);// 04:23 AM

        LocalTime myTime2 = LocalTime.of(16, 23, 54, 2354);
        System.out.println(myTime2);
        DateTimeFormatter dtf9 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyTime2 = dtf9.format(myTime2);
        System.out.println(formattedMyTime2);


    }
}
