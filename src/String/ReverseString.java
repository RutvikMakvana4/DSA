package String;

public class ReverseString {
    public static void main(String[] args) {


        //1. using + (String concatenation) operator

        String str = "ABCD";
        String rev=" ";


//        int len = str.length();
//
//        for(int i=len-1; i>=0; i--)
//        {
//            rev=rev+str.charAt(i);
//        }




        // 2. using character array

//        char a[]= str.toCharArray();
//        int len = a.length;
//
//        for(int i=len-1; i>=0; i--)
//        {
//            rev=rev+a[i];
//         }
//        System.out.println("Reversed string is :" + rev);




         //3. Using String Buffer class

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
