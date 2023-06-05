package day14arraysforeach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {

    public static void main(String[] args) {


        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari sona koyunuz.
                    // [2, 3, 12, 0, 0, 0, ]


        int arr[] = {0, 2, 3, 0, 12, 0};

      int newArr[]= new int[arr.length];

        int idx =0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] !=0){
                newArr[idx] = arr[i];
                idx++;

            }
        }
        System.out.println(Arrays.toString(newArr));

        // Example 2: bir array'in icinde her hangi bir elemanin olup olmadigini gösteriniz ve kac kere tekrarlandigini gösteriniz
        // [2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> Aradiginiz : 2 elemani var 3 kere tekrarlandi
                       //   ==> Kullanici 6'yi sordu ==> Aradiginiz eleman 6 yok ve 0 kere tekrarlandi

        int nums[] = {2, 1, 2, -3, 2};
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aradiginiz elemani giriniz");
        int arananEleman = input.nextInt();

        int counter =0; // "flag": Bazi durumlarin var olup olmadigini kontrol etmek icin "flag" kullanilir.

        for (int w :nums
             ) {
            if (w == arananEleman){
                counter++;
            }
            
        }

           if (counter>0){
               System.out.println("Aradiginiz : "+arananEleman + " elemani var " + counter+ " kere tekrarlandi ");
           }else{
               System.out.println("Aradiginiz eleman " + arananEleman + " yok ve " + counter + " kere tekrarlandi");
           }


           // Example 3: size verilen bir cümlede en uzun kelimeyi veren kodu yaziniz.
           //        "Java kolaydir calisana, en kolay ki calismayana."   Punctuation = noktalama demek

         String sentencen = "Java kolaydir calisana, en kolay ki calismayana.";

           // String manipulations methodlari yardimiyla noktalama isaretlerinden kurtulduk.
            sentencen = sentencen.replaceAll("\\p{Punct}", "");
        System.out.println(sentencen);//Java kolaydir calisana en kolay ki calismayana

        //String'i space göre kelimelere ayirdi.
        String words[] = sentencen.split(" ");

        // Array'in icindeki stringleri uzunluklarina göre karsilastirdi
        // Comparator : karsilastirici demektir sort() metodu dan bu karsilastirmaya göre kücükten büyüge dogru siraladi
        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));

        System.out.println(words[words.length - 1]);//calismayana


    }
}
