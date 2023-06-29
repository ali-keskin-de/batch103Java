package day32maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap01 {



    //Example 1:  Verilen bir String'te hangi harfin kac defa kullanildigini veren method olusturunuz.
    //            "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=0

    public static void main(String[] args) {
        String s= "Hello Henry!";
        System.out.println(getTheNumofOccurencesOfLetters(s)); //{r=1, e=2, H=2, y=1, l=2, n=1, o=1}

        
/*
        String sentence = "Hello Henry!";
        sentence = sentence.replaceAll("\\p{Punct}", "").replaceAll(" ", "").trim();
        System.out.println(sentence);
        String[] letters = sentence.split("");

        HashMap<String, Integer> occ = new HashMap<>();

 //     for (String w : letters
 //     ) {
 //         if (!occ.containsKey(w)) {
 //             occ.put(w, 1);

 //         } else if (occ.containsKey(w)) {
 //             occ.replace(w, occ.get(w) + 1);
 //         }
 //     }
 //     System.out.println(occ);{r=1, e=2, H=2, y=1, l=2, n=1, o=1}



        for (String w: letters
             ) {
            Integer numOfLetter = occ.get(w);
            if (numOfLetter==null){
                occ.put(w,1);

            }else{
                occ.replace(w, numOfLetter+1);
            }


        }
        System.out.println(occ);//{r=1, e=2, H=2, y=1, l=2, n=1, o=1}
   */

    }

    // 3.weg
   public static TreeMap<String, Integer> getTheNumofOccurencesOfLetters(String sentence){

       // Asagidaki iki yöntemlede bir string'teki harfler disindaki herseyden temizleriz.
       //sentence = sentence.replaceAll("\\p{Punct}", "").replaceAll(" ", "").trim();
       sentence = sentence.replaceAll("[^A-Za-z]", "");
       String[] letters = sentence.split("");

       // Görünüm sayilarini depolamak icin Map.
       TreeMap<String, Integer> occ = new TreeMap<>();// Alfabetik sirada verir.

       for (String w: letters
       ) {
           Integer numOfLetter = occ.get(w);
           if (numOfLetter==null){
               occ.put(w,1);

           }else{
               occ.replace(w, numOfLetter+1);
           }


       }

       return occ;
   }


}
