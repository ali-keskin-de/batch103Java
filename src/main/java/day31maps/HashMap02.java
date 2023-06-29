package day31maps;


import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        //Meshur interview sorusu

        // Example 1: Type code to print the number of occurrences of word in a sentence
        // Verilen cümledeki kelimelerin görünüm sayisini veren kodu yaziniz.
        // "I like you, like like!" => I=1, like=2, you=1

        String sentence= "I like you, like like!";

        // Noktalama isaretlerini sildik
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        // kelimelerle calismaliyim bu yüzden split(" ") kullaniriz.

       String []  words = sentence.split(" ");

        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        HashMap<String, Integer> occ = new HashMap<>();
        // "words" array'indeki kelimeler birer birer Map'de var mi , yok mu diye kontrol edilecek.
        // "words" array'indeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilir.
        // "words" array'indeki kelimeler Map'de varsa Map'e value'su 1 artirilarak yerlestirilir.

       // 1. weg (mein)
        /*
        for (String w:words
             ) {
           if (!occ.containsKey(w)){
               occ.put(w, 1);

           }else if(occ.containsKey(w)){
               occ.replace(w, occ.get(w)+1);
           }


        }
        System.out.println(occ);//{like=3, I=1, you=1}

         */


        // weg 2 (Hocanin Kodu)


        for (String w:words
             ) {
            Integer numOfOccurrence = occ.get(w);

            if(numOfOccurrence==null){
                occ.put(w,1);
            }else{
                occ.replace(w,numOfOccurrence+1);
            }

        }
        System.out.println(occ);//{like=3, I=1, you=1}
    }




}
