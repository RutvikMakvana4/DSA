//Searching element in Array [Linear Search]

package Searching;

public class LinearSearch {
    public static void main(String[] args) {

        int a[] = {10,20,40,50,30};

        int serach_element=50;
        boolean flag=false;

        for(int i=0; i<a.length; i++)
        {
            if(serach_element==a[i])
            {
                System.out.println("Elememt found at: " +i);
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("Element Not found");
        }
    }
}
