package day22inheritancepolymorphism;



public class Runner {

    /*
    Note : Inheritance'da variable'lar secilirken java object'in data type'ina bakar.
    1. Adim: öncelik istediginiz variable'i Object'i data typ'i olan Class'da arar.
    2. Adim: O class'a bulamazsa o zaman Parent Class'a bakar.
    3. Adim: Hicbir Parent Class'ta bullamazsa hat verir.

     */


    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println(cat1.a); // 14 Burda perant class'larda da a variable var ancak java hagi degeri getirecegini Datatype bakarak karar verir bu sebepten  14 gelir cünkü Cat classinin icerisindeki a'nin degeri 14.
        System.out.println(cat1.b); //34
        System.out.println(cat1.c); //45

        Mammal cat2= new Cat();
        System.out.println(cat2.a);//13
       cat2.eat(); // Cat eat.. bu Object'in Constructor Cat() oldugundan bu Class'taki Methodu getirdi.

        Animal cat3 = new Cat();;
        System.out.println(cat3.a);// 12

       // Object olusturulurken Object'in data type'i Child Class'lardan secilemez yani Constructor Mammal iken Cat class'indan bir Object olusturulamaz
        // Cat cat5 = new Mammal(); olmaz babayi cocuk üzerinden tanimlayamazsin diyor java.
        Cat cat4= new Cat();
        cat4.drink();// Mammal drink...

       // Object olustururken Object'in constructor Parent Class'tan ise data type'ni child Classlarda secemezsiniz.

        // Inheritance'ta variable secilirken data type'ina bakar secer ancak Methodlarda Constructor' bakar.
        // Öncelikle Constructor'i kullanilan Class'tan method'u alir.
        // eger constructor ile ayni isimde olan class'ta method yoksa Parent classlara gider varsa ordan alir. Yoksa hata verir.

        Mammal cat5 = new Mammal();
        cat5.eat();//Mammal eat..  bu Object'in Constructor Mammal() oldugundan bu Class'taki Methodu getirdi.

        Animal cat6 = new Animal();
        cat6.eat(); // Animal eat.. constructor Animal()

    }


}
