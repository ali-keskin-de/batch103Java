package day31maps;

import java.util.HashMap;


public class HashMap01 {

    public static void main(String[] args) {
        HashMap<String,Integer> stdAges = new HashMap();
        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom",76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        System.out.println(stdAges);//{Tom=76, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        // Key'i teekrarli yazar isek  en son yazilan entry'nin degerini kabul eder.
        // Bu yöntem value güncellemede kullanilir. Buna "Overwrite" denir.
        stdAges.put("Tom", 83);

        // HashMap'ler entry'leri rast gele siralar, bu nedenle cok hizli calisirlar.
        // Map'ler entry'leri "key"'lere bakarak siralama yaparlar.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        //replace(); key'i kullanarak Value'leri update etmek icin kullanilir.
        stdAges.replace("Ezel", 39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        // replace() Method'unu asagidaki gibi kullanirsak
        // Angelina key'ine sahip ve value'su 58 olan entry varsa gidip onun value'nu 61 yapacak.
        stdAges.replace("Angelina", 58,61);
        System.out.println(stdAges);// {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        // putIfAbsent(); Brand keyine sahip bir entry yoksa  bu entry ekle demektir.
        // Asagida görüldügü gibi Brad=58 entry'si oldugundan eklemedi yoksa ekleyecekti.
        stdAges.putIfAbsent("Brad",60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        stdAges.putIfAbsent("Ali", 60);// Ali key'i olmadigindan eklenecek
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        //Burada sanki getorDefault() methodu ile get() method'u arasinda fark yokmus gibi.!!!
        //getOrDefault("Tom",0); method'u Map'te varolan key'ler icin get() method'u ile ayni ciktiyi verir.
        //getOrDefault("Tom",0); method'u Map'te olmayan key'ler icin defaultValue verilen degeri verir.
        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom", 0));//83

        // getOrDefault(), verilen key'e sahip bir entry yoksa o zaman bana defaultValue ver demektir.
        // defaultvalue'nun data type map'teki value'nun data type ile ayni olmalidir.
        // buna karsin get() verilen key'e ait bir entry yoksa null verecektir.
        // Bu teknik bir terim oldugundan kullanici icin anlamsizdir.
        System.out.println(stdAges.get("Ayse"));// null
        System.out.println(stdAges.getOrDefault("Ayse", 0));//0

        HashMap<String, String> hauptstadtOfLand= new HashMap<>();
        hauptstadtOfLand.put("Türkei", "Ankara");
        hauptstadtOfLand.put("Deutschland", "Berlin");
        hauptstadtOfLand.put("Albaina", "Berlin");

        System.out.println(hauptstadtOfLand.getOrDefault("Polen", "Bu ülkenin baskaenti mevcut degil"));

        //containsValue(77)  Map'te value'lar arasinda verilen value arar varsa true yoksa false döner.
        System.out.println(stdAges.containsValue(77));//true
        System.out.println(stdAges.containsValue(99));// false

        // containsKey("Ali") method'u key'ler icerisinde "Ali" yi arar varsa true yoksa false döner.
        System.out.println(stdAges.containsKey("Ali"));//true
        System.out.println(stdAges.containsKey("Ayse"));//false

        // remove() iki türü var biri tek parametre aliyor romeve("Ali") Map'teki "Ali" key'ine sahip entry bulup siler.
        //remove() mehtod'unun iki parametre alani romeve("Ali", 77) eger böyle bir entry varsa siler yoksa silmez.


        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39} ==> "Ali=60" silindi

        stdAges.remove("Tom",81);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39} ==> Hic bir elemet silinmedi

        stdAges.remove("Tom",83);
        System.out.println(stdAges);//{Angelina=61, Ajda=77, Brad=58, Ezel=39} ==> Tom=83 silindi

       HashMap<String,Integer> kidsAges = new HashMap<>();
       kidsAges.put("John",12);
       kidsAges.put("Jim",22);
       kidsAges.put("Jack", 32);

       // stdAges.putAll(kidsAges); method'u stdAges Map'ine ekler ama kidsAges Map degismez.
       stdAges.putAll(kidsAges);
        System.out.println(kidsAges);//{John=12, Jack=32, Jim=22}
        System.out.println(stdAges);//{Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}


    }


}
