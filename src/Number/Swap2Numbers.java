package Number;

public class Swap2Numbers {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("Before swapping values are :" + a +" "+ b);


//Logic 1 - Third Variable

        // int temp=a;
        // a=b;
        // b=temp;


//Logic 2 - (use + and - operator) without using third variables

        // a=a+b;
        // b=a-b;
        // a=a-b;


// Logic 3 - (use * and / ) and here a and b values should not be zero

        // a=a*b;
        // b=a/b;
        // a=a/b;


// logic 4 - bitwise XOR (^)

        // a=a^b;
        // b=a^b;
        // a=a^b;


// Logic 5 - single statment

        b=a+b-(a=b);


        System.out.println("After swapping values are :" + a +" "+ b);


    }
}
