package day02methodcreation;

public class MethodCreation {

    // Main method static bir method oldugu icin static methodlarin icinde sadece static olan methodlar calisir.
    public static void main(String[] args) {

        System.out.println(toplamaYap(2.1, 5));

        System.out.println(ucSayiyiCarp(2, 2, 3));

        System.out.println(ilkIkiSayiToplayanUcuncuyuCarpan(7, 3, 2.5));

        /*
        sout yazip "Enter"'a basarsaniz i) System.out.println()  yazidirir ii) System.out.print()
        -ln ingililzcedeki line (satir) demektir println yazdigimizda yazdirdiktan sonra pointer (imleci) bir alt satira gecirir.
        yazdiracagimiz diger seyleri alt satira yazdirmaya yarar println.

         */

        // MethodCreation classinda objeckt olusturduk.

        MethodCreation myObject = new MethodCreation();





    }
    // Exmaple: TOplama islemi yapan bir method olusturunuz.

    public static double toplamaYap(double a, double b){
        return a+b;

    }
    // Example 2: Uc sayiyi bir biriyle carpan bir method olustur.

    public static double ucSayiyiCarp(double a, double b, double c) {
        return a*b*c;

    }
    // Exmaple 3: üc sayidan ilk ikisini toplayip ücüncü ile carpan method olusturup, sonucu ekranda yazdiriniz.

    public static double ilkIkiSayiToplayanUcuncuyuCarpan(double a, double b, double c){
        return (a+b) * c;
    }

}
