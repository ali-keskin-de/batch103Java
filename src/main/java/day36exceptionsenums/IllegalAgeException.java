package day36exceptionsenums;

public class IllegalAgeException extends  RuntimeException {
    /*
        Eger Runtime Custom Exception üretmek istersek RuntimeException Class'a extend etmeliyiz.
     */

    public IllegalAgeException(){
        super();
    }
    public IllegalAgeException(String message){
        super(message);
    }

}
