package day14arraysforeach;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        // Arrays'lerin icerisne  "primitive data type" leri ve "reference" (adres) degerleri  yerlestirilebilir.

        String str[] = new String[3];
        str[0] ="Java";
        str[1] ="is";
        str[2] ="surprise you";
        System.out.println(str); //[Ljava.lang.String;@1d251891
        System.out.println(Arrays.toString(str)); //[Java, is, surprise you]

        // String bir Array olusturunuz ve "Tom" ve "Tom" dan önceki tüm elemanlari ekrana yazdiriniz.

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w: arr
             ) {
            System.out.print(w + " ");
            if (w.equals("Tom")){
                break;
            }

        }

        // Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tüm elemanlari yazdiriniz.
        System.out.println();
        for (String w: arr
             ) {
            if(w.equals("Tom") || w.equals("Jane")){
                continue;

            }
            System.out.print(w + " ");

        }
        System.out.println();
        // Example 3: Bir ögretmen sinifindaki ögrencilerin isimlerini application'a yüklemek istiyor bunu saglayan code yaziniz.
                     // ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen girmek istediginiz ögrenci sayisini giriniz");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];


        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");
        for (int i = 1; i <= numOfStd ; i++) {

            System.out.println("Lütfen " + i + ". " + "ögrencinin ismini girniz");

            String stdName = input.next();

            if (stdName.equalsIgnoreCase("Q") ){
                break;
            }

            stdName = names[i-1];


        }
        System.out.println(Arrays.toString(names));


    }
}
