package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
    1) Farkli sayilardaki parametrelerle calisabilen bir method olusturmak istiyorsaniz "varargs" kullanmalisiniz.
    2) "varargs" arka tarafta "array" kullanir, bu yüzden "varargs"larla calisirken "Array" lerle calisiyormus gibi davranabiliriz.
    3) "varargs" olusturmak icin "<data type>... <varargs ismi> yada "<data type> ...<varargs ismi> seklinde olusturulur
    4) Bir method'da "varargs" in yaninda baska bir parametre kullaninir, Ancak "varargs" en sonda olmak sarti ile kullanilir.
    5) Bir method'ta birden fazla "varargs" Kullanılabilir mi?
      "varargs" en sonda olmak zorunda oldudugundan, Birden fazla kullanırsanız en az biri en sonda olmayacaktır.
       Bu da 4. madde ile çelişmektedir
     */
    public static void main(String[] args) {

       int r1 = add(2, 3);
        System.out.println(r1);
        int r2 = add(2, 3, 4);
        System.out.println(r2);
        int r3 = add(2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(r3);


    }

    // Iki sayinin toplamini return eden method'u creat ediniz.
 // public static int add(int a, int b){

 //     return a + b;
 // }

 // // Üc sayiyi toplamini veren methodu creat ediniz.

 // public static int add(int a, int b, int c){

 //     return a + b + c;
 // }
 // // dört sayiyi toplamini veren methodu creat ediniz.

 // public static int add(int a, int b, int c, int d){

 //     return a + b + c;
 // }

    // Istedigimiz kadar sayiyi toplayacak methodu creat ediniz.
    public static int add(int...a){
        int sum = 0;

        for (int w:a
             ) {
            sum += w;

        }
        return sum;
    }


}
