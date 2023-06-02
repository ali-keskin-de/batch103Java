package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    /*
       Note: Class ==> Variable ==> Object ==> Object Kullanimi
                       Method
     */
    public static void main(String[] args) {

                  // Object nasil olusturulur.

        /*
        1) Objeyi olusturu iken kullanacagimz sinifin ismini yazariz.
          - Object olusturmak icin kalip lazimdir Class'lar birer kaliptir demistik objectlerin.
        2) sonra objemize bir isim veririz.
          -
        3) "=" isareti koyuyoruz
        4) new keyword kullaniriz
         - new keyword olmayan bir objeck'ti olustur demek.
        6) class ismini parantezle beraber yazariz.
          Car() Constructor (mutahit) yani obje yapicidir constructor olmadan objecktler olusturulamaz.
         */

        Car myHonda = new Car();

        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);

        myHonda.harekEt();
        myHonda.dur();


        // MethodCreation classinda objeckt olusturduk.
        MethodCreation myObject = new MethodCreation();

        System.out.println(myObject.toplamaYap(3, 5));


    }

    public void harekEt(){
        System.out.println("Honda guzel hareket eder...");
    }

    public void dur() {
        System.out.println("Honda güvenli durur...");
    }



}
