package day27interface;

public interface Animal {

    void eat();
    void drink();

    // 1) "interface" teki tüm variable'lar "final" dir.
    //    Bu yüzden interface icerisinde olusturulan bütün variable'lara deger atamasi yapilmak zorundadir.
    //    final variable'lar sonradan degistirilemeez.
    // 2) interface'teki tüm variable'larin access modifier'larin (default) degeri public'tir ve yazilmasina gerek yoktur.
    // 3) interface'teki tüm variable'larin otomatik (default) olsrsk dtstiv'tir ve yazilmasina gerek yoktur.
    // Interface'lerde variable cagrilirken interface ismi ile cagirin,
    // bu hem static variable  olmanin geregi, hem de kodun okurlulugu acisindan güzeldir.
    int age = 4;
}
