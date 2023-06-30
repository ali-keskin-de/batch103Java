package day33exceptions;

public class E03 {


    public static void main(String[] args) {
        System.out.println(getNumChars("Java"));
        System.out.println(getNumChars("Bayram"));
        System.out.println(getNumChars(null));

    }


    // Bir String'teki character sayisini veren method olusturunuz.

    public static int getNumChars(String s){
        int result = 0;

        try{
            result= s.length();

        }catch(NullPointerException e){
            System.out.println("Some String methods do not work with null...");// developer'in ürettigi mesaj.
            System.out.println(e.getMessage());// bu  javanin teknik mesaji varsa verir.
        }
        return result;
    }




}
