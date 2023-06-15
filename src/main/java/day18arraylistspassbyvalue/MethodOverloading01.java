package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    /*
    Method Overloading nasil yapilir?
    1) Method isimleri ayni olmali.
    2) Method Parametreleri farkli olmalidir
         i) Parametre sayilari degistrilebilir.
         ii) Parametre data type degistrilebilir.
         iii) Parametre yerleri degistrilebilir, Ancak data type farkli olur yoksa anlamsiz kalir.

    3) Method isimi + parametreler ==> Method Signature ==> public static void add(int a, int b)
    Method Signature disinda ne değiştirirseniz değiştirin java onu farkli bir method olarak kabul etmez.
     */

    public static void main(String[] args) {

        add(2,3);
        add(2,5.0);



    }

    public static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a + b+ c);
    }

    public static void add(int a, double b){
        System.out.println(a + b);
    }

    public static void add(double a, int b){
        System.out.println(a + b);
    }


}
