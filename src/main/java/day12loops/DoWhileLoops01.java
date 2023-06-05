package day12loops;

public class DoWhileLoops01 {

    public static void main(String[] args) {


        // While loop bazi durumlarda calismaz,
        // yani "zero execution" (sifir uygulama) mümkündür
        int start = 1;
        while (start<1){
            System.out.println("I'm a While Loop");
            start++;
        }

        //Note: Do-While loop kullanildiginda loop body'si en az bir kez calisir
        // do-while "zero execution" mümkün degildir

        int ilk = 1;

        do{
            System.out.println("Ben do-While Loopum");
            ilk++;

        }while(ilk<1);

        // do-while önce hareket eder sonra kontrol eder(düsünür) "karadenizliler gibi", while önce kontrol eder sonra calisir (önce düsünür)

        // Bir ondalik sayinin ondalik kismindaki toplamini bulunuz
        //  24.5673 ==> 5+6+7+3 = 21

         double num = 24.5673;
        // String.valueOf(num) methodu ile double data type'ini String data type cevirdik.
        // valueOf() method'u bütün data type'lari icin calisir.
        String str=  String.valueOf(num);

        System.out.println(str);

        // Regex icin nokta kullandiginizda önüne "\\" koyunuz. Yani"\\." seklinde kullanilabilir.
        // Cünkü regex icin "." in özel bir anlami var.
       String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);//5673

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);
        int sum = 0;

        do{
            sum = sum + decimalInt%10;

            decimalInt= decimalInt/10;

        }while(decimalInt>0);

        System.out.println(sum);//21


    }
}
