package NumberAndString;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num = sc.nextInt();


        //1. Using Algorithm

//        int rev=0;
//
//        while(num != 0)
//        {
//            rev = rev*10 + num%10;
//            num=num/10;
//        }
//


        //2. using stringBuffer class

//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();



        //3. using StringBuilder class

        StringBuilder sbr = new StringBuilder();
        sbr.append(num);
        StringBuilder rev = sbr.reverse();



        System.out.println("Reverse Number is :" +rev);
    }
}
