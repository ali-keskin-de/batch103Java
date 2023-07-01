package day34exceptions;

public class E02 {

    public static void main(String[] args) {

        System.out.println(getCharFromString("Java", 2)); //v
        System.out.println(getCharFromString("Java", 8));//StringIndexOutOfBoundsException

    }

    // Bir String'teki character'i index alarak döndüren method'u yaziniz.

    public static char getCharFromString(String str,int idx) {


        try {
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){

            idx = Math.abs(idx);

            idx= idx % str.length();

            return str.charAt(idx);

        }

    }
}
