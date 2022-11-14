package NumberAndString;

import java.util.Scanner;

public class FindLargestOf3Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = sc.nextInt();

        System.out.println("Enter Second Number :");
        int b = sc.nextInt();

        System.out.println("Enter Third Number :");
        int c = sc.nextInt();

        //Approch-1  -  Logic

//        if(a>b && a>c)
//        {
//            System.out.println(a+ " is largest Number");
//        }
//        else if (b>a && b>c)
//        {
//            System.out.println(b+ " is largest Number");
//        }
//        else
//        {
//            System.out.println(c+ " is largest Number");
//        }



        //Approch 2 - ternary operator

        int largest1 = a>b?a:b;     // largest of a & b
        int largest2 = c>largest1?c:largest1;      // largest of c & largest1

        System.out.println(largest2+ " is a largest Number");
    }
}
