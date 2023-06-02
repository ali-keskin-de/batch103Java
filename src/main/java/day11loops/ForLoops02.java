package day11loops;

public class ForLoops02 {
    public static void main(String[] args) {


        //Example 1: bir String'teki "m" characterleri haric tüm characterleri yazdiriniz.
        // Andromeda ==> Androeda
        String str = "Andromeda";



        // 1.Weg
        for (int i = 0; i <str.length() ; i++) {

            char c = str.charAt(i);

            if (c != 'm'){
                System.out.print(c);
            }

        }

        // continue; bir Keyword'tir java bu keyword görünce for-loop icerisinde sizi direkt azaltma artirma operatörüne tasir.
        // continue'da sonraki kode calismaz.

        // 2.Weg
        System.out.println();
        String str1 = "madam";
        for (int i = 0; i < str1.length(); i++) {

            char c = str1.charAt(i);

            if (c == 'm'){

                continue;

            }else {
                System.out.print(c);
            }

        }

        //Example 2: 1'de 100'e kadar 6 ile bölünebilenler haric tüm sayilari ekrana yazdiriniz

        int num = 100;

        for (int i = 1; i <num ; i++) {

            if(i%3==0 && num%2==0){
                continue;
            }else {
                System.out.print(" " + i);
            }

        }

        //Example 3: Size verilen bir string'teki "m" den önceki karakterleri yazdiriniz.

        String s = "Luxemburg";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c=='m'){
                break;
            }else {
                System.out.println(c);
            }

        }

        // break; keyword'nu gördükten sonra sizi loop'in disina atar.

    }
}
