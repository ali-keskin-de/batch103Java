package day34exceptions;

public class E03 {
    /*
   1) try-bloc’tan sonra çoklu catch-block kullanilabilir.
      i)catch-block’lar arasında parent-child iliskisi yoksa istenilen sirada catch-block’lar yazılabilir.
      ii)catch-block’lar arasında parent-child iliskisi varsa
      child catch-block’lar parent exception catch-block’lardan önce yazilmalidir.                                                       		 catch-block’lar parent exception catch-block’lardan önce yazilmalidir.

   2) Exception class tüm Exception’larin parent’dir çoklu catch-block kullanmak yerine tekli catch-block kullanilabilir.
   3) try-block tek başına kullanilamaz.
      Peki try-block, catch-block olmadan kullanilabilir mi?
      try-block + finally kullanilabilir.

     */


    public static void main(String[] args) {

        System.out.println(convertOfStringToIntDivideByLength1("6"));
        System.out.println(convertOfStringToIntDivideByLength2("6"));
        System.out.println(convertOfStringToIntDivideByLength3("6"));
    }

   // Example 1 : Bir String'i Integer'a ceviren ve bu integer'i String'in length'nin 1 eksigine bölen method'u olusturunuz.

    public static int convertOfStringToIntDivideByLength1(String str) {
       int result = 0;

       try {
           int a = Integer.valueOf(str);
           result = a / (str.length() -1);
       }catch (NumberFormatException e){

           System.out.println("Non-digit character cannot be used in valueOf()");

       }catch(ArithmeticException e){

           System.out.println(e.getMessage());
       }
       return result;
    }


    public static int convertOfStringToIntDivideByLength2(String str) {
        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() -1);
        }catch (Exception e){

            System.out.println(e.getMessage());

        }
        return result;
    }
    public static int convertOfStringToIntDivideByLength3(String str) {
        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() -1);
        }catch (ArithmeticException e) {

            System.out.println("Jump");

        }catch (Exception e){

            System.out.println(e.getMessage());

        }
        return result;
    }
}

