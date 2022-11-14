// How to find Duplicate Elements in array :

package array;

import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {

        String arr[] = {"java","C","C++","Python","java"};

        //approach 1

        boolean flag = false;
        for(int i=0; i< arr.length; i++)
        {
            for (int j=i+1; j< arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Found Duplicate Elements :" +arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("Duplicate Element Not Found");
        }



        //Approach 2 - HashSet

        String arr1[] = {"java","C","C++","Python","java"};
        HashSet <String>langs = new HashSet();

        /* System.out.println(langs.add("java"));
        System.out.println(langs.add("Python"));
        System.out.println(langs.add("java"));
        output : true true false
        */

        boolean flag1 = false;

        for(String l:arr1)
        {
            if(langs.add(l)==false)
            {
                System.out.println("Found Duplicate Element:" + l);
                flag1 = true;
            }
        }

        if(flag1==false)
        {
            System.out.println("Not found Duplicate Element");
        }
    }
}
