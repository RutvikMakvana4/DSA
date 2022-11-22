package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        Pattern(4);
    }
    public static void Pattern(int n){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=4; k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//        ****
//         ***
//          **
//           *