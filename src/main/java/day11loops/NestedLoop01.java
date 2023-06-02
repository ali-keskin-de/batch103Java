package day11loops;

public class NestedLoop01 {
    public static void main(String[] args) {


        /*
        Example 1: Asagidaki ciktiyi verecek kodu yazdirin


                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....

         */

        for (int i = 1; i < 5 ; i++) {

            System.out.println("Week :" + i);

            for (int j = 1; j <8 ; j++) {
                System.out.println("   Day : " + j);

            }

        }

        // Nested-loops da en önce distaki loop'ta baslanarak yazilir.
        // Scoop : kapsam demektir
        // her iki süslü parantez arasi javada bir scoop'tir  ici ice  scooplarda icteki kendi icinde calisir disarda calismaz ama distaki
        // veriable ic scoopta calisir.

        // scoop’un kapsadigi alanı görmek isterseniz o zaman scoop’un süslü parantezine gelip çift tiklariz
        int b =12;
        {
            int a =10;
            System.out.println(a + b);
        }



    }
}
