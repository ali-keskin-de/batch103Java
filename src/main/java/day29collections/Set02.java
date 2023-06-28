package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set02 {

    public static void main(String[] args) {
        // Ögrenci mail adres'lerini natural order'a göre siralanmis olarak depolayiniz.

        TreeSet<String> stdMail = new TreeSet<>();

        stdMail.add("abc@gmail.com");
        stdMail.add("abd@gmail.com");
        stdMail.add("abe@gmail.com");
        stdMail.add("abl@gmail.com");
        stdMail.add("abf@gmail.com");
        stdMail.add("abg@gmail.com");
        stdMail.add("abh@gmail.com");
        stdMail.add("abi@gmail.com");
        stdMail.add("abj@gmail.com");
        stdMail.add("abk@gmail.com");

        System.out.println(stdMail);

        // Weg 2: HashSet TreeSet'lerden hizli calistigindan bu methodu kullaniriz. Bu daha hizli calisir.

        HashSet<String> stdMailHs= new HashSet<>();
        stdMailHs.add("abc@gmail.com");
        stdMailHs.add("abd@gmail.com");
        stdMailHs.add("abe@gmail.com");
        stdMailHs.add("abl@gmail.com");
        stdMailHs.add("abf@gmail.com");
        stdMailHs.add("abg@gmail.com");
        stdMailHs.add("abh@gmail.com");
        stdMailHs.add("abi@gmail.com");
        stdMailHs.add("abj@gmail.com");
        stdMailHs.add("abk@gmail.com");

        TreeSet<String> stdMailHsTs= new TreeSet<>(stdMailHs);
        System.out.println(stdMailHsTs);

    }
}
