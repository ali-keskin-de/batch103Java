package day21accesssmodifiersinheritance;

public class Student {


    /*
    Access Modifier
    1) public  2)protected  3)default (Access Modifier'i default yapmak icin access modifier yazmayiz.) 4)private

        Note : access modifier'lari genisten dara dogru siralayiniz.
               public > protected > default > private

        Note : Acces modifier'lari birer birer aciklayiniz.
                // public her class'ta kullanilabilir.
                // protected olanlar baska package'lerden  kullanilamaz;
                  ancak baska package'de "child class" icinde kullanilabilir.
               //default olanlar baska package'lerden kullanilamazlar.
                // private olanlar sadece olusturulduklari Class icinde kullanilabilirler
        Note : "protected" ile "default" arasindaki fark nedir.
                 // protected olanlar baska package'lerden  kullanilamaz;
                  ancak baska package'de "child class" icinde kullanilabilir.
                  //default olanlar baska package'lerden kullanilamazlar.

       Note : Class'lar hangi access modifier'lar kullanilabilir?

            public, default kullanilabilir ama protected ve private kullanilamaz.

     */

    // public her class'ta kullanilabilir.
    public String stdName = "TomHanks";

    // protected olanlar baska package'lerden  kullanilamaz;
    // ancak baska package'de "child class" icinde kullanilabilir.
    protected String address = "Miami";

    //default olanlar baska package'lerden kullanilamazlar.
    String email = "th@gmail.com";

    // private olanlar sadece olusturulduklari Class icinde kullanilabilirler
    private String stdId ="20206517004";
}
