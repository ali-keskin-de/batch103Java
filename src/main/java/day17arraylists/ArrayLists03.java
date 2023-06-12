package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {
        // Example 1: Bir list'eki bir birne en yakin olan iki elemani bulunuz.
        //            [12, 19, 15, 30, 21] ==> 19 ve 21

        List<Integer> nums= new ArrayList<>();
        nums.add(12);
        nums.add(19);
        nums.add(15);
        nums.add(30);
        nums.add(21);
        System.out.println(nums);

        // List'te ki elemanlarin kücükten büyüge dogru siralamak icin "Collections" lara önce gitmek gerekir.
        Collections.sort(nums);
        System.out.println(nums);
        int minFark = Integer.MAX_VALUE; // Bu bize Integer class'indaki en büyük sayiyi verir.
                                        // böylelikle kücük sayilari arar iken her hangi bir degeri atlamamis oluruz.

        for (int i = 1; i <nums.size() ; i++) {
            minFark = Math.min(minFark, nums.get(i)-nums.get(i-1));

        }
        System.out.println(minFark);

        // Math.min() ==> iki int degerden bize kücük olanini veren method
        // Math.max() ==> iki int degerden bize büyük olanini veren method
        // Math.abs() ==> degerin bize mutlak degerini verir.








    }
}
