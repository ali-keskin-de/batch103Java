package day18arraylistspassbyvalue;

public class PassByValue01 {
    /*
    1) Java variable'larin orjinal değerlerini korumak ister.
    2) Veriable'lar method'lar İçinde kullanıldığında,
    Java metodun için Orjinal değil koymaz, o değerin kopyasını Üretir Ve metroda o kopya degeri yollar.
     Böylelikle orijinal degeri korumuş oluruz, Metot bu kopya üzerinde değişiklikleri yapar.
     Bu sisteme "Pass-By-Value" denir.

     Note : Java "Pass-By-Value" kullanir.
     Note : Bazı Programlama dilleri Orjinal değeri koruma altına almamıştır. Bu işi developerlara bırakmıştır.
      Bu tarz diller "pass by reference" kullanırlar
     */

    public static void main(String[] args) {
        int a = 5;
        // Static method olan "main method" un icerisinde hersey static olmalidir.
        // Cünkü main method static static  methodlar icerisinde sadece static olanlar calisir
        change(a);
        System.out.println(a);

        int ucret =100;
        int kopya= indirim(ucret);
        System.out.println(kopya);//90
        System.out.println(ucret);//100

    }
    public static void change(int a){
         a=a*3;
        System.out.println(a);
        ;
    }
    public static int indirim(int gomlekUcreti){
       gomlekUcreti=gomlekUcreti - 10;

        return gomlekUcreti ;
    }
}
