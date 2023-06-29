package day32maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    1) TreeMap "thread-safe" ve "synchronized" degildir.
      Note : Map'lerde "multi thread" kullanmaniz gerekirse sadece Hashtable kullanabilirsiniz.
    2) TreeMap'ler value'larda null kullanimina müsade eder, keylerde etmez.
    3) TreeMap entry'leri entry'leri natural order'a göre siraya koyar.Bu yüzden oldukca yavastir.
     */

    public static <TreeMaps> void main(String[] args) {

        Long t1= System.nanoTime();
        TreeMap<String, Integer> countryPopulations =new TreeMap<>();

        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Albania", 3000000);
        countryPopulations.put("USA", 450000000);
        countryPopulations.put("Turkiye", 83000000);
        countryPopulations.put("Brasil",215000000);
        countryPopulations.put("France",75000000);
        countryPopulations.put("Finland",8000000);
        countryPopulations.put("Madagaskar",30000000);
        countryPopulations.put("Belgium",12000000);

        System.out.println(countryPopulations);

        Long t2= System.nanoTime();

        HashMap<String,Integer> countryPop = new HashMap<>();
        countryPop.put("Germany", 83000000);
        countryPop.put("Albania", 3000000);
        countryPop.put("USA", 450000000);
        countryPop.put("Turkiye", 83000000);
        countryPop.put("Brasil",215000000);
        countryPop.put("France",75000000);
        countryPop.put("Finland",8000000);
        countryPop.put("Madagaskar",30000000);
        countryPop.put("Belgium",12000000);

        TreeMap<String, Integer> countryPop02 =new TreeMap<>(countryPop); //Burda HashMap'ten TreeMap yapiyoruz.
        System.out.println(countryPop02);
        Long t3= System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);

    }
}
