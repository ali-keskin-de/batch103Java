package day32maps;

import java.util.HashMap;

public class HashMap02 {

    /*


    HashMap<String,String> capitals = new HashMap<>(); Oluşturduğumuzda Java memory de 16 kutucuk oluşturur
    Ve o kutuları sırasıyla 0 den baslar 15'e kadar indeksler.Kutuların içi boştur bu kutulara "Bucket" denir.
    HashMap'ler ilk Oluşturulduğunda Kutular boştur.

    capitals.put(“USA”, “Washington”);
    Kodunu yazdığımızda, Java key için bir hashcode üretir. örneğin bu hashcode kodu 34 olarak ürettiğini farzedelim.
    Bu hes kodu 16'ya böler 34 ÷ 16 kalan 2 olur. Java kalan 2 odaklanır.
     Ve 2. indeks’teki kutucuğa gidip bu entry LinkedList olarak.
    capitals.get(“USA”); denildiğinde Java daha önce ürettiğim bu hashcode bilir ve gider ordan entry bulur.
    Daha önce oluşturduğu bir key’in value’sünde bir değişiklik yapılırsa koyduğu yerdeki entry bulur ve Value’sunu sadece değiştirir.
    Zamanla buckets dollar bu bakitlarin 12 tanesi dolduğunda java yeni bir 16’li oluşturulur.
    ve daha sonra yeni Dashcode’ları 32’ya bölmeye baslar.


     */

    public static void main(String[] args) {
        // HashMap arkasinda calisan mekanizmayi nasil Calisir?

        HashMap<String,String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.put("Italy", "Roma");
        capitals.put("Turkei", "Ankara");
        capitals.put("Turkei", "Istanbul");

    }
}
