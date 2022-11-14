package Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9,10};     // should be in sorted order


        // Approach 1 : Logic

        boolean flag=false;


        int key=5;
        int l=0;  // lower bound
        int h=a.length-1;   // higher bound

        while(l<=h)
        {
            int mid=(l+h)/2;

            if(a[mid]==key)
            {
                System.out.println("Element found...");
                flag=true;
                break;
            }

            if(a[mid]<key)
            {
                l=mid+1;
            }

            if(a[mid]>key)
            {
                h=mid-1;
            }

        }

        if(flag==false)
        {
            System.out.println("Element not found...");
        }




        //Approach 2 : Array.binarySearch()

        // System.out.println(Arrays.binarySearch(a, 8));


    }
}
