package Patterns;

import java.util.regex.Pattern;

public class Pattern7 {
    public static void main(String[] args) {
        Pattern(4);
    }
    public static void Pattern(int n){
        for (int i = 0; i <= 4; i++) {
            for (int j = 3; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = 3; k >=i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}



//           *
//           **
//           ***
//           ****
//           ***
//           **
//           *