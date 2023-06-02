package day10stringmanipulations;

public class StringManipulations {

    public static void main(String[] args) {
        String a = "Java kolaydir";

        boolean b = a.startsWith("va",2);

        System.out.println(b); //true

        // stratsWith(): a.startsWith("va",2); kodu 2 characterden sonrasina bakar "va" ile basliyor;
        // eger onunla basliyorsa true return eder, baslamiyorsa false return eder.


        /*
        replaceFirst("a","*"); kodu bir Stringteki ilk a'nin görüntüsünü "*" se cevirir
        replace("a","*"); kodu bir Stringteki  a'nin tüm görüntülerini "*" se cevirir
         */
       String c = a.replaceFirst("a","*");
        System.out.println(c); // J*va kolaydir

        // concat(): i) concat method'u iki string bir birine eklemeye yarar.
                   //Bu islemi bunu + operatorünüde kullana biliriz.
                   // Java bir islem icin bir method üretmis ise o method "best practice" dir.


        String d = a.concat(" Anladin mi?");
        System.out.println(d);//Java kolaydir Anladin mi?

        // trim(): trim method'u bastaki ve sondaki spaceleri siler.
        String e = "  Tom Hanks   ";
        String f =   e.trim();
        System.out.println(e);//   Tom Hanks
        System.out.println(f);//Tom Hanks

        //compareTo() :  i) h.compareTo(i); alfabetik (lexicogarphic) olarak karsilastirir
                         // Büyük harf kücük harfe duyarlidir
                         // Büyük harf kücük harfe duyarli olmasini istemiyorsak h.compareIgnoreCase(i); method'unu kullaniriz.
                        // h.compareIgnoreCase(i); bu kod'ta "h" nin alfabetik sirasindan "i" alfabetik sirasi cikarilir.
        String h = "Java";
        String i = "Java";

        int k = h.compareTo(i);

        // a.repeat(5); bu code a String'ini 5 defa yazdirir.
                       //ii) bize String return eder.
        // Note: Windows ==> ctrl e basili tutarak maus'umuzu methodun üzerine getirip tiklarsak methodun icerisine gireriz
               // mac'te bu command==> tusu ile gerceklesir
       String  n = a.repeat(5);
        System.out.println(n); //Java kolaydirJava kolaydirJava kolaydirJava kolaydirJava kolaydir





    }
}