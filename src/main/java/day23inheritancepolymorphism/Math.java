package day23inheritancepolymorphism;

public class Math extends Courses {

    public void practice(){
        System.out.println("Solve questions");
    }
    public Math(){
        super("x"); // Bu bizi parent Class'taki (Courses) icinde String olan Constructor götürecek. ve Constructor kullanacagiz
        System.out.println("Constructor 1");

    }
    public Math(int a){
       this();// Ayni Class icindeki diger parametresiz Constructor'i kullan demektir
        System.out.println("Constructor 2");

    }
}
