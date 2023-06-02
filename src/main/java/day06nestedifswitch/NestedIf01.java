package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        Password'un ilk harfi büyük harf ise
          A olursa gecerli Password aksi halde gecersiz
        Password'un ilk harfi kücük harf ise
          z olursa gecerli password aksi halde gecersiz password.

            Note : Java Nested kodlari calistirir iken cok zaman harcar buna; "Time Complexity" denir.
                Bu yüzden mümkünse "nested" kod yazmamaya calisiriz.

         */



        String pwd = "Axy12!";

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("Password gecerlidir");
            } else {
                System.out.println("Password gecersiz");
            }

        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
            if (pwd.charAt(0) == 'z') {
                System.out.println("Password gecerlidir");
            } else {
                System.out.println("Password gecersiz");

            }

        }
    }
}

