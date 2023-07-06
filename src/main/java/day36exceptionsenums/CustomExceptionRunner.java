package day36exceptionsenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {
    /*

   1) try kullandigimizda her senaryoda calismasini istedigimiz kodlari finally block icerisinie koyariz.

   2) "final", "finally" ve "finalize" keyword'larini aciklayiniz.
        "final" : yapilan datalar olusturulurken atamasi(assingn) yapilmalidir. Cünkü daha sonra bu datalarin degerleri degistirilemez.
        "finally" : aciklandi.
        "finalize" : "Garbage Collector" memory'i temiz tutmak icin sürekli memory'i tarar ve silinmesi gerekenleri siler.
                     "Garbage Collector" silmeden önce silecegi datalari finalize eder sonra siler.

     */



    public static void main(String[] args) throws IllegalGradeException {
       // System.out.println(getGrades());
        try  {
            printAge(-1);
        }catch (IllegalAgeException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("I always work" );
        }
    }
    // Example 1: Öğrenci notlarını bir list'e ekleyen metodu oluşturunuz.

    public static List<String> getGrades() throws IllegalGradeException {
        List<String> grades = new ArrayList<>();

        Scanner  input= new Scanner(System.in);

        String grade= " ";


        do{
            System.out.println("Pleas enter the grade. To stop entering press q");
             grade =input.next();

             int intGrade = 0;
             if (!grade.equals("q")){
                  intGrade= Integer.valueOf(grade);// String ifadeyi int dönüstürdük
             }

             if (grade.equals("q")){
                 break;
             }else if (intGrade>=0 && intGrade<=100 ) {
                grades.add(grade);
            }else {
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid");
            }

        }while(!grade.equals("q"));// Kullanicinin girdigi q degilse döngü devam edecek.
        return grades;

    }

    // Example 2: Kullanicinin yasini konsola yazdiran kodu yaziniz.

    public static void printAge(int age){

        if (age<0){
            throw new IllegalAgeException("Age cannot be negative");
        }
        System.out.println(age);


    }
}
