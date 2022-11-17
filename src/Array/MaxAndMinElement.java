// How to find Maximum and Minimum Values in Array.

package Array;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int a[] = {50, 100, 40, 20, 60};

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum Element in array is :" + max);


        int b[] = {50, 100, 40, 20, 60};

        int min = a[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        System.out.println("Minimum Element in array is :" + min);

    }
}
