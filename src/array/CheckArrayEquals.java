// how to check both Arrays are equal or not

package array;

import java.util.Arrays;

public class CheckArrayEquals {
    public static void main(String[] args) {

        int a1[] = {1,2,3,4,5};
        int a2[]= {1,2,3,4,5};


//Approch 1 -- Using equals method

        /*
        boolean status = Arrays.equals(a1,a2);

        if (status==true)
        {
            System.out.println("Array are Equals");
        }
        else
        {
            System.out.println("Array are Not Equal");
        }
         */



//Approch 2 --

        boolean status =true;
        if(a1.length == a2.length)
        {
            for(int i=0; i<a1.length; i++)
            {
                if(a1[i] != a2[i])
                {
                    status =false;
                }
            }
        }
        else
        {
            status=false;
        }

        if(status == true)
        {
            System.out.println("Array are Equal");
        }
        else
        {
            System.out.println("Array are not Equal");
        }

    }
}
