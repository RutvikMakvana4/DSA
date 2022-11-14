package NumberAndString;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.next();

        String newstr  = str;

        String rev="";

        int len = str.length();

        for(int i=len-1; i>=0; i--)
        {
            rev=rev + str.charAt(i);
        }

        if(newstr.equals(rev))
        {
            System.out.println(newstr+ " is palindrome String");
        }
        else
        {
            System.out.println(newstr + " is not palindrome String");

        }

    }
}
