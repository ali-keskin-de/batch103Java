package day08stringmanipulations01;

public class StringManipulations02 {

    public static void main(String[] args) {
        // Example 1: Bir String'deki space haric kac tane character kullanildigini gösteren kodu yaziniz.
        //

        String str = "Ali okula gitti.";

        int num = str.replace(" ", "").length();

        System.out.println(num);

        // 10) replace(): Method'u bir string icerisindeki characteri veya charakterleri  degistirmek icin kullanilir.
        // construtor icerisine ilk olarak degistrimek istesdiginiz characteri veya characterleri yazarsiniz, virgülden sonra ikinci charactere veya characterler  yerine koymak istedigimiz characteri yazariz.
        // str.replace(" ", ""); burda bosluklar yerine hiclik koyduk.

        // Example 2: Bir String'deki tüm 'a' harflerini 'A' ile degistiriniz.

        String s= "Ankara'nin tasina gözlerimin yasina bak";
        String newS = s.replace('a', 'A');
        System.out.println(newS); //AnkArA'nin tAsinA gözlerimin yAsinA bAk

        // Example 3: Bir String'teki tum "kara" kelimeleri yerine "*" koyunuz.

        String t = "Kara kara düsünmek Ankara";
       String newT = t.replace("kara", "*");

        System.out.println(newT); //Kara * düsünmek An*

        // Example 4: Bir String'teki tüm sayilari "*" a ceviriniz.

        String stdId = "AC202117004";

        String newStdId= stdId.replaceAll("[0-9]", "*");
        System.out.println(newStdId);

        /*
         Bir grup data'yi ifade eden kodlara "Regex" denir.

         "Regex" Regular Expressions in kisaltilmis halidir. yani [0-9] 0'dan 9 kadar rakamlari,
         [A-Z] büyük A dan büyük Z ye kadar bütün harfleri,  [a-z] büyük a dan büyük z ye kadar bütün harfleri denilebilir.

         1) tüm rakamlar      ==> [0-9]
         2) tüm kücük Harfler ==> [a-z]
         3) tüm büyük Harfler ==> [A-Z]
         4) tüm Harfler       ==> [a-zA-Z]
         5) sesli Harfler     ==> [aeiouAEIOU]
         6) Space             ==> [ ]
         7) tüm rakamlar ve tüm harfler     ==> [0-9a-zA-Z]
         8) tüm noktalama isaretleri ==> \\p{Punct}
         9) Rakamlar haric tüm characterler ==> [^0-9]
         10) kucuk harfler haric tüm character ==> [^a-z]

         */

        // Example 5:  Verilen bir String'teki  kullanilan isaretleri ve rakamlar ve space characteri haric
          // tüm characterlerin sayisini bulan method'u yaziniz.

        String u = "Ali 13 yasinda, dersem inanma!...";

       int result = u.
                      replaceAll("[0-9]", "").
                      replace(" ", "").
                      replaceAll("\\p{Punct}","").
                      length();

        System.out.println(result);

        // Example 6: Bir password'un geceerli olmadigini asagidaki kurallara göre test eden kodu yaziniz.
        //      i) Space haric en az sekiz character olmalidir
        //      ii) En az bir sembol icermelidir
        //      iii) En az bir Rakam
        //      iv) En az bir büyük Harf icermelidir
        //      v) En az bir kücük Harf icermelidir

        String pwd = "B78c? K!M";

        //      i) Space haric en az sekiz character olmalidirss
        boolean first = pwd.replace(" ", "").length()>7;

        //      ii) En az bir sembol icermelidir

        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        //      iii) En az bir Rakam

        boolean third = pwd.replaceAll("[^0-9]", "").length() > 0;

        //      iv) En az bir büyük Harf icermelidir
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;

        //      v) En az bir kücük Harf icermelidir

        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if (pwdGecerli) {
            System.out.println("Password Gecerlidir...");
        }else {
            System.out.println("Password gecerli degildir...");
        }

        // Example 7: Bir String'teki noktalama isaretleri haric character sayisini gösteren kodu yaziniz.

        String cumle= "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacal?...";

        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number); // 6

        // Note : Haric ^ isaretini kullanacak ise her zaman köseli parantez icinde kullanmaliyiz


        // Example 8: Verilen bir String "Al" ile basliyor "x" ile bittiyorsa ekrana "Harika" yazdirin.

        String v = "Alex";

        boolean baslangic = v.startsWith("Al");
        boolean bittis = v.endsWith("x");

       String sonuc = baslangic && bittis ? "Harika" : "Normal";
        System.out.println(sonuc);

        /* 11) startsWith() : i) Bu method bir string'in neyle basladigini kontrol etmektedir.
                              ii) Bu method boolean data type da bir veri bize return eder.

           12) startsEnd() : i) Bu method bir string'in neyle bittigini kontrol etmektedir.
                              ii) Bu method boolean data type da bir veri bize return eder.
         */



    }
}
