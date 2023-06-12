package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names); //[Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        // Note : RemoveAll() method'unda ilk list degisir, ikici list degismez.
        // yani "names" list'i degisir iken "cities" list'i degismez

        names.removeAll(cities);

        System.out.println(names); // [Thomas, Tahsin]



        // 11) containsAll() i) bir list'te coklu kontrol yapmak istersek containsAll() methodunu kullaniriz.
        //                  ii) aradigimiz elementlerin hepsi varsa bize boolean olarak true return eder yoksa false
        List<String> vornames = new ArrayList<>();

        vornames.add("Tom");
        vornames.add("Thomas");
        vornames.add("Tahsin");
        vornames.add("Trump");
        vornames.add("Taceddin");

        List<String> myNames = new ArrayList<>();
        myNames.add("Tom");
        myNames.add("Thomas");
        myNames.add("Tahsin");
        System.out.println(myNames);
        System.out.println(vornames);


       boolean sonuc = vornames.containsAll(myNames); // bu aranan myNames list'inin bütün elementleri varsa bize true return edecek.
        System.out.println(sonuc); // Bütün elementler var oldugundan true return eder.

       // Note : elementlerden herhangi birisi yoksa false verir ancak hepsi varsa true verir.

        List<String> a = new ArrayList<>();

        a.add("Shoes");
        a.add("Tv");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        // Example 1: "a" listindeki "Shoes" ilk görünümünü siliniz.

        a.remove("Shoes");
        System.out.println(a);
        // Example 1: "a" listindeki "Shoes" tümünü  siliniz.

        List<String> silinecekElementler = new ArrayList<>();
        silinecekElementler.add("Shoes");

        a.removeAll(silinecekElementler);
        System.out.println(a);//[Tv, Radio, Laptop, Book]

        // Example 3: bir tane salary listi olusturun, eger salayr 10000'den az ise %20  10000'de cok ise %10 zam yapilsin.

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for (Double w:salary
             ) {

            if (w<10000){
                System.out.println(salary.indexOf(w));
                salary.set(salary.indexOf(w),w= w+ (w*20/100));
            }else if (w>=10000){
                salary.set(salary.indexOf(w), w= w+ (w*10/100));
            }

        }
        System.out.println(salary);

        // Example 4: iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz.

        List<Character> m =new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');


        List<Character> n = new ArrayList<>();

        n.add('x');
        n.add('y');
        n.add('z');

        //1.yol
        int couter =0; // flag!!!

        for (int i = 0; i <m.size() ; i++) {

            if (m.size()!= n.size()){
                couter++;
                System.out.println("List'ler esit degildir");
                break;
            }else if (!m.get(i).equals(n.get(i))){
                couter++;
                System.out.println("List'ler esit degildir");
                break;
            }


        }
        if (couter==0){
            System.out.println("Listler esittir");
        }

        //2.yol
        boolean esitMi = m.equals(n);
        if (esitMi){
            System.out.println("Listler esittir");
        }else {
            System.out.println("List'ler esit degildir");
        }


    }
}
