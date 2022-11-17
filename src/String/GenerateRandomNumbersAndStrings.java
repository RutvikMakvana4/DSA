// How to generate Random Numbers and strings :

package String;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args) {

        //Approch 1 - using Random Onjects

        Random rand = new Random();

        int rand_int = rand.nextInt(1000);   // 0 to 999
        System.out.println(rand_int);

        double rand_db = rand.nextDouble();    //range 0.0 and less than 1.0
        System.out.println(rand_db);


        //Approch 2 - Math
        System.out.println(Math.random());

    }
}
