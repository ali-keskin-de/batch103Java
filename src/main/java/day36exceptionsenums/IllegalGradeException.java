package day36exceptionsenums;
  /*

    1) Custom Exception Class olusturmak icin Exception Class'a extends etmeliyiz.
      Exception Class'a extends ederek olusturdugumuz Custom Exception "Compile Time Exception" olur.

    2) Custom Exception Class olustururken "constructor" olusturmaliyiz.
      Bu "constructor" parent'taki constructor'i cagirmalidir.
      Bu "constructor" message verecek veya vermeyecek sekilde olusturulabilir.

    3) Custom Exception Class olusturdugumuzda ismin sonunda "Exception" kelimesini kullanmalisiniz.
      IllegalGradeException'da oldugu gibi.

     */


public class IllegalGradeException extends Exception {

    public IllegalGradeException(){
        super(); // yazarsak parent'ta git objeyi ordan olustur demis oluruz.
    }
    public IllegalGradeException(String message){
        super(message); // Eger konsola bir message yazdirmak istiyorsak böylede olusturabiliriz.
    }


}
