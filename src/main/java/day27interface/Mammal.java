package day27interface;

/*
  1) Class     ---> Class         :extends
     interface ---> interface     :extends
     Class     ---> interface     :implements
     interface ---> Class         :olmaz

     ayni ise extends farkli ise implement kullan. "interface" i Class'in child'i yapma.

    Note : "interface" child'i yine bir interface ise parentinin methodlarini override etmek zorunda degil.

    // "interface" teki tüm variable'lar "final" dir.
    // Bu yüzden interface icerisinde olusturulan bütün variable'lara deger atamasi yapilmak zorundadir.
    // final variable'lar sonradan degistirilemeez.


       Abstract Class ile interface arasidaki farklar nelerdir?
       1) Abstract Class'lar hem "abstract" hemde "concrete"  methodlari icerebilirler.
          Buna karsin interface'ler sadece abstract methodlari icerirler.
          Ama interfacelerin icerisinde static ve default keyword'lari kullanarak concrete methodlar üretebilirsiniz
       2) Abstract Class'lar multiple inheritance'i desteklemez ama interface'ler destekler.
       3) Abstract Class'lar  icinde her türlü variable olusturulabilir, interface'ler icindeki variable'lara public,
          ve final olmak zorundadir.
       4) interface class`in child`i olmaz ama abstract class, class'in child olabilir.
       5) abstract class'larda constructor vardir, ama object üretemez, interfacelerde constructor yoktur obje üretemez.


 */

public interface Mammal extends Animal {

    String feedBaby ="Milk";
    int age =6;
}
