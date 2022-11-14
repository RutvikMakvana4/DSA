package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class BuiltInMethod {
    public static void main(String[] args) {


        //Approach 1
        int a[] = {30,50,20,10,60};

       System.out.println("Array elements before sorting :" + Arrays.toString(a));
       Arrays.parallelSort(a);
       System.out.println("Array elements after sorting :" + Arrays.toString(a));


        //Approach 2
        System.out.println("Array elements before sorting :" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array elements after sorting :" + Arrays.toString(a));


        //Approach 3
        Integer a1[] = {30,50,20,10,60};
        System.out.println("Array elements before sorting :" + Arrays.toString(a1));
        Arrays.sort(a1, Collections.reverseOrder());
        System.out.println("Array elements After sorting :" + Arrays.toString(a1));
        //output : [60,50,30,20,10]

    }
}
