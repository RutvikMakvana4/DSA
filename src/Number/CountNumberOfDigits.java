package Number;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int num = 123456789;
        int count=0;

        while (num>0)
        {
            num = num/10;
            count++;
        }
        System.out.println("Number og Digitd is : "+count);
    }
}