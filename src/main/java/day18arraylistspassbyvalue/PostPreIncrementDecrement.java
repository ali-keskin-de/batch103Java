package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {


    public static void main(String[] args) {

        int a = 5;

        // Post Increment
        int b =a++; // burda java 'a' yi önce b'ye assign etti sonra artirdi. buna Post Increment denilmekte.

        System.out.println(b);//5
        System.out.println(a);//6

        // Pre Increment

        int c = 10;
        int d = ++c; // Burada ise Java c'i Önce arttırdı sonra d'ye assign etti. Buna Pre Increment denilir

        System.out.println(c);//11
        System.out.println(d);// 11

        // Post Decrement

        int e = 20;
        int f = e--;

        System.out.println(f);//20
        System.out.println(e);// 19

        // Pre Decrement

        int h =30;
        int g =--h;

        System.out.println(h);//29
        System.out.println(g);//29


     // Burada görüldügü gibi Increment'e oldugu gibi Decrement'e de gecerlidir.




    }
}
