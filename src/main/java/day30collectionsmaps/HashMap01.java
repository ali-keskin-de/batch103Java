package day30collectionsmaps;


import java.util.*;

public class HashMap01 {

    /*
      1) Map'lerde sözlükteki kelime ve manalari gibi calisir.
        Bir kelimenin tek ve bir seslendirim ve yazimi vardir ancak bir kelime birden cok anlama sahip olabilir.
      2) Map'ler Key, Value yapisini (structure) kullanirlar. Bu yapilara Entry denir, hepsine birdende EntrySet denir.
      3) "Entry"'ler benzersizdir.
      4) Key ve Value'lar ayri data type' de olabilirler.
      5) HashMap'ler "entry"leri rastgele siraler, bu nedenle en hizli map'lerdir.
      6) Map'ler Collection degildir farkli bir yapidir.


     */


    public static void main(String[] args) {

        // Map'ler nasil olusturulur?
        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        // Entry'ler nasil eklenir bir Map'e?
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Albania", 3000000);
        countryPopulations.put("USA", 450000000);
        countryPopulations.put("Turkiye", 83000000);
        countryPopulations.put("Netherland",18000000);

        System.out.println(countryPopulations);// {USA=450000000, Albania=3000000, Germany=83000000, Netherland=18000000, Turkiye=83000000}

        // get(); Method'u "key" ile calisir ve "value" kismini veirir.
      int usaPopulation =  countryPopulations.get("USA");
        System.out.println(usaPopulation);//450000000


        // Bütün "key"leri nasil alabiliriz?
        //keySet();  Bütün key'leri verir
        Set<String> keys = countryPopulations.keySet();
        System.out.println(keys);// [USA, Albania, Germany, Netherland, Turkiye]

        // Bütün "Value"'lari nasil alabiliriz?

        Collection<Integer> values = countryPopulations.values();
        System.out.println(values);//[450000000, 3000000, 83000000, 18000000, 83000000]

        // Example 1: countryPopulationsn map'indeki ülkelerin nüfuslarinin ortalmasi nedir?

        Collection<Integer> values01 = countryPopulations.values();
        int sum =0;

        for (Integer w:values01
             ) {
            sum +=w;
        }

        //size()
        int ortalama= sum/values01.size();
        System.out.println(ortalama);//127400000

        //entrySet(); Method'u entry'leri kalip halinde alip bir Set'in icerisine koyar.
        Set<Map.Entry<String,Integer>> entries = countryPopulations.entrySet();
        System.out.println(entries);

        //Note : Loop'lar Map'lerde kullanilamaz biz eger Map'lerdeki entry'ler icinde gezmek icin onlari Set'lere cevirmemiz gerekir.
        //   bunun icin entrySet() method'unu kullaniriz.

       // Example 2: countryPopulations Map'indeki ülkelerinin Character sayilari ile nüfuslarinin toplamini bulunuz.


        int toplam= 0;
        for (Map.Entry<String,Integer> w:entries
             ) {
            toplam += w.getKey().length()+ w.getValue();

        }
        System.out.println(toplam);//637000034












    }
}
