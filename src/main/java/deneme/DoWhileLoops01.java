package deneme;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        double sayi = 23.9812;
        String decimalSayi = String.valueOf(sayi);

        System.out.println(sayi);
        System.out.println(decimalSayi);
        String decimalSayiPart = decimalSayi.split("\\.")[1];

        System.out.println(decimalSayiPart);
        //int decimalSayiInt = Integer.parseInt(decimalSayiPart);

        int decimalSayiInt = Integer.valueOf(decimalSayiPart);

        System.out.println(decimalSayiInt);


    }

}
