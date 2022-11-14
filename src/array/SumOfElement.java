// Find Sum of Elements in Array

package array;

public class SumOfElement {
    public static void main(String[] args) {
        int a[] = {5,2,7,9,6};
        int sum=0;

        for(int i=0; i<=a.length-1; i++)
        {
            sum=sum+a[i];
        }


        // Using Enhanced for loop

        /*
        for(int value: a){
            sum = sum+ value;
        }
         */


        System.out.println("Sum of Array element : " + sum);
    }
}
