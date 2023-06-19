package day22inheritancepolymorphism;

public class CatRunner {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
    }

    //Note: 1) Constructorlar yukarda görüldüğü gibi Parent’ta Child’a doğru calistirilirlar.
    //      2) Java en üst parent Constructor'a Çıkabilmek için "super()" kodunu kullanir
    //      3) "super()" Kodu her Constructor'in "ilk satirinda" "gizli olarak bulunur.
    //      4) "super()" kodunu istediginizde görünür olarak yazdirabilirsiniz.
    //      5) "super()" kodunu görünür olarak yazarsaniz mutlaka ilk satirda olmalidir.
    //      6) "super()" kodu Parent Class'tan constructor cagirmaya yarar.
}
