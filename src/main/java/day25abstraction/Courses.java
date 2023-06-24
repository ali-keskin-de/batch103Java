package day25abstraction;

public abstract class Courses {
    /*
    1) Bazen parent class'daki metodun bodys'si hicbir child class tarafindan kullanilmaz.
       Bu durumda  parent'taki method'a body yazmak hic kullanilmadigi icin mantikli degildir.
       Kodlama Mantiginda kullanilmayan kode yazilmaz
    2) Body'si olmayan method'a "Abstract Method" denir.
       Abstract ingilizcede "vucütsuz veya soyut" denir
    3) Methodun body'sini yazmayinca java hata verir,
    bizde abstract keyword'unu kullanarak Java'ya bu method'un abstract methohd oldugunu söyleriz

    4) Abstract keyword'unu  kullaninca elde ettigimiz abstract method normal class'larda konulamaz,
     o yüzden class'ida abstract yaparuz

    5) Bir Paarent'taki method abstract ise bütün Child classlar abstract method'u override etmek zorundadir.
       Bu yüzden tum child'lar icin mecburi olmasini istedigimiz fonksionlari abstract yapmak mantikli bir secimdir.

    6) Body'si olan methodlar(Concrete Method) abstract classlarin icerisine yazilabilir,
     bodys'i olmayan Methodlar (Abstract Method) Concrete Class'larin icerisine yazilamazlar.

    7) Abstract keyword ile "method body" bir method'ta ayni anda kullanilmaz.

    Note : Aslinda body'si olmayan method yarim bir method'tur (abstract method)
    override edilerek child classlar tarafindan yarim kalan bu method tamamlanir.
    yani babanin tamamlamadigi isi cocuklarinin tamamlamasi gibi.

    Note : Abstract class'lardan obje olusturulursa olusan obje mükemmel olur mu?
          Abstract Class'larin icinde body'siz(abstract method) lar oldugundan
          objlerde olusturuldugu class'in bütün özelliklerini aldigindan dolayi objeler kusurlu eksik olur.
          Ancak mükemmel objeler mükemmel calisirlar  ve app mükemmel calisir.
     8) Abstract classlardan object üretilemezler.
     Abstract class'lar iclerinde eksik yapilar (abstract methodlar) barindiriyorlar.
     Buda mükemmel objeler üretmenin önünde engeldirler.
     Java eksik onje istemez cünkü eksik obje eksik is yapar ve buda app bozar.
     Java application'i korumak icin abstract class'lardan object üretimine izin vermez.

     9) "abstract class'larin constructor'i vardir ancak object olusturamazlar.

     10) final method'lar abstract olamazlar

     11) private methodlar  abstract olamazlar.

     12) Abstract Class'larin child'lari abstract olabilir (Cinlerin cocuklari cin olabilir :))

     */

    /*
    Meshur bir Interview sorusudur!!!!

    "final keyword"'u aciklar misiniz?
    "final keyword"  i) variable'larda  ii) method'larda  iii) class'larda kullanilabilir.

    i) variable'larda kullanildiginda  a) o variable'a kesinlikle deger atamasi yapilmalidir
                                       b) kesinlikle atan bu deger degistirilemez.

    ii) Methodlarda kullanildigida a) Method'un body'si degistirilemez
                                   b) o method override edilemez

   iii) Class'larda kullanildiginda a) O Class'in Child'lari olamaz ama final class'in kendisi Child class olabilir.


     */

    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }

}
