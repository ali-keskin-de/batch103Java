package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {
        // Example 1: Japonya ile Almanya arasındaki zaman farkını hesapla kodu yazınız.

        LocalDateTime timeDeutschland = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeDeutschland);
        LocalDateTime timeJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeJapan);
       long diff = ChronoUnit.HOURS.between(timeDeutschland,timeJapan);
        System.out.println(diff);

        // Example 2: Sabit bir tarih oluşturnuz.

        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13 );
        System.out.println(myDate);// 2011-04-13

        /*
        Java'da sabit datalari(Gün isimleri, ay isimleri, Amerika'da ki eyalet isimleri etc.) depolamak  ve gerektiginde kullanmak icin
        depolar Oluştururuz. Bu depolara "Enum" denir
         */

        // Example 3: USA icin "Woow!", UK icin "Big", CANADA icin "Cold", TURKEY icin "Vatan", GERMANY icin "Araba", RWANDA "cay".

      Countries country = Countries.UK;

      switch(country){
          case USA:
              System.out.println("Woow!" );
              break;
          case UK:
              System.out.println("Big" );
              break;
          case CANADA:
              System.out.println("Cold" );
              break;
          case TURKEY:
              System.out.println("Vatan" );
              break;
          case GERMANY:
              System.out.println("Araba" );
              break;
          case RWANDA:
              System.out.println("cay!" );
              break;

          default:
              System.out.println("Tanimlanmamis ülke");
      }


    }

}
