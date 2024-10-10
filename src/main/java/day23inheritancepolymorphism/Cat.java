package day23inheritancepolymorphism;

public class Cat extends Mammal {

    public void meow() {
        System.out.println("Cat meow");
    }
    // Bunun anlami nedir? Bu method Cat Class'ta olusturulmus bir method degil. Parent Class'tan alinmis method.
    @Override
    public void eat() {
        System.out.println("Cat eat...");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return (a*b)+1;
    }

    // Asagidaki Method "Overriding Method"
    @Override
    public Mammal create() {
        return new Mammal();
    }

    /*
     Bu method final oldugundan override edilemez.
    @Override
    public final double divide(int a, int b){
        return a/b;
    }
     */

    /*
    @Override Annotation'ini kullanarak, Java'nin yaptigimiz override islemini kontrol etmesini saglariz.
    1) Ovverride yaparken "method'un body" ' sini degistiririz.
    2) Method Signature'a (isim ve parametre) dokunulmaz.
    3) Ovverride yaparken "inheritance" olmak zorundadir.
    4) Override yaparken "access modifier" lar belli kurallara göre farklilastirilabilirler.
        i) private methodlar override yapilamazlar.
        ii) Child Class'daki "override" edilen method'un access modifier'i
           Parent class'daki method'un access modifier'i ile ayni vaya genis olmalidir
        iii) "default method" lar ayni package icindeyse override edilebilirler,
             farkli package'den override edilemezler.
    5) Parent Class'taki methodun return type void ise return type degistirilemez.
    6) Parent Class'taki methodun return type Primitive ise return type degistirilemez.
    7) Parent Class'taki methodun return type Wrapper ise return type degistirilemez.
    8) Parent Class'taki methodun return type Parent Class ise return type Child'lardan biri olabilir.
        Note : Child Class'daki return type Parent Class'dakinden genis olamaz.
        Note : Aralarinda Praent iliskisi olmayan Class'lar retun type degisiminde kullanilamazlar.
             Mesela "Short" , "Integer" dan kucuktur, fakat aralarinda "Parent Child" iliskisi olmadigindan
             "Integer" yerine "Short" kullanamazsiniz.
             Note : Child daki method'un Return Type'indan  Parent'teki methodun Return type'ina gidiste
                   "IS-A" realtionship olmalidir
             Note : Aralarinda "IS-A" Relationship olan Data Type'lara "Convariant" denir
    9) final method'lar override edilemezler, cunku overriding 'de method body degisitirilir,
    fakat final methodlarda method body'si degistirilemez.
    Bu nedenden Overridde edilemezler.

    10) Polymorphism = Overloading + Overriding
    Note : Polymorphism nedir ? derlerse Overloading ve Overriding’i beraber anlatın.
    12) Overloading ile Overriding arasındaki farkları nelerdir?
    i) Overloading icin Inheritance gerekmez fakat Overriding icin inheritance gerekli.
    ii) private Method’lar Overload edilebilir, Override edilemezler.
    iii) final method’lar Overload edilebilirler, Override edilemezler
    iV) Overloading static polymorphism olarak , Overriding dynamic polymorphism
      Çünkü static Methodlar Overload edilebilir, Override edilemez.
     v) Overloading’de method signature değişir ama Overriding’te signature’a    		dokunulmaz

     */

}
