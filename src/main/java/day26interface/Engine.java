package day26interface;
/*
    1) Bir Interface icerisinde Concrete Method bulunamaz
    2) Interface icindeki methodlarin abstract oldugunu java bilir,
     bu yüzden "interface" icindeki "abstract method'larda" abstract keyword kullanmaya gerek yoktur.
    3) Interface icerisindeki methodlarin tamami public'tir.
      bu yüzden interface icerisinde abstract method olustururken "access modifier" yazmaya gerek yoktur.
    4) Bir "interface" bir "class" in parent'i yapmak istediginizde "extends" keyword yerine "implements"
       keyword kullanir.
    5) "Concrete Child Class" lar "parent interface" abstract methodlari override etmek zorundadirlar.

    6) interface'ler bir applicationda "Concrete Child Class" larin yapmak zorunda olduklari
     fonksionlari barindirirlar.  Bu yüzden interface'lerede "to-do list" te denir.

    7) Birden fazla "parent Interface "icinde ayni isimli abstract methodlar olusturabilirsiniz.
       abstract mehodlarin body'si olmadigi icin child class'lar ayni isimli methodlardan herhangi birini
       override ederek kullanabilirler.

    8) Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturdugumuzda
       bu methodlarin return typelari  ayni olmak zorundadir.

    9) Normalde interface'lerin icerisine Concrete Method kullanilmaz
       ama bazi özel durumlarda Corcrete method koymamiz gerekirse;
       "default" keyword'unu asagidaki gibi kullanarak "interface" icine "concrete metod"
       koyabiliriz.
                    i) default void eco(){ System.out.println("Uses gas less...");}
                    ii) "static" keyword'unu asagidaki gibi kullanarak "interface" icine "concrete method"
                    koyabilirsiniz static void stop(){System.out.println("Stop securely...");}

   10) "default" ve "static" keyword'u ile "interface" lerde olustrudugunuz methodlari
      concrete Child Class'lar kullanmak zorunda degillerdi.

   11) "default" keyword'unu kullanarak olustrudugunuz concrete method'lara "object" olusturarak ulasabilirsiniz.
       "static" keyword'unu kullanarak olustrudugunuz concrete method'lara "object" olusturmaya gerek yoktur,
       interface ismi yeterlidir.
   12) "interface" lerden "object" olusturulamaz. Interface’lerin constructor yoktur.
        Bu yüzden interface icerisindeki default concrete methodlara ulasmak icin child concrete class'lardan method olusturulur.




     */


public interface Engine {

     void start();
     void payment();

     default void eco(){
          System.out.println("Uses gas less...");
     }
     static void stop(){
          System.out.println("Stop securely...");
     }

}
