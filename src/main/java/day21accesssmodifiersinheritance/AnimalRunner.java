package day21accesssmodifiersinheritance;

public class AnimalRunner {

    /*
    1) "Inheritance " sayesinde;
            i) Code tekrarindan kurtuluruz
            ii) Code taminir (maintenance) kolay olur
            iii) Child class'lari daha atomic yapmis oluruz

    2) Bir Class'i Başka bir Class'a Child yapmak icin "extends" keyword'unu kullaniriz.
    Child yapmak istedigimiz Class'a gidip class isminden sonra "extends" yazdiktan sonra Parent Class'in ismini yazariz.

    3) Child class object'leri  Parent class'in method() ve veriable'larini kullanabilir.

    4) Ancak bunun tersi mümkün degildir. Yani;  Parent class object'leri  child class'in method() ve veriable'larini kullanamaz.

    5) Object class bütün class'larin atasidir (Parent)
    ancak bu java tarafindan bilindiginden class'ta extends keyword'u ile bellirtilmesine gerek yoktur. Java bilineni belirtme geregi hic bir zaman duymaz.
   Java'da Object class disindaki her Classin Parent'i vardir. Diger bir deyisle Javada Parent'i olmayan tek Class Object class'tir

   6) “private” method’lar ve “variable” ‘lar direkt child classlardan kullanılamaz.
     “protected” method’lar ve variable‘lar child classlardan kullanılabilir. Baska package'tada olsa kullanilabilir.
     “default” method’lar ve variable‘lar ayni package'taki child classlardan kullanılabilir.
     “public” method’lar ve variable‘lar child classlardan kullanılabilir.

     Note : "Child Class'lar tarafindan kullanilabilir demek, Inherit edilebilir demektir.
     7) 4 tip inheritance vardir.
        i) Multilevel Inheritance: Java bunu kabul eder.
        ii) Hierarchical Inheritance: Bir parent icin coklu child, Java bunu kabul eder.
        iii) Multiple Inheritance: Bir child'a coklu parent, Java bunu desteklemez (Java does not suppert Multiple Inheritance)
        iv) Singel Inheritance: Bir Child class icin bir parent Class demektir.Java bunu destekler.

     */
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();

    }
}
