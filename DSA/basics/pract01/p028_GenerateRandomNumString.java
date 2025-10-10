package basics.pract01;

import java.util.Random;

public class p028_GenerateRandomNumString {
    public static void main(String [] args){
        Random random = new Random();
        int ranInt = random.nextInt(1000);
        System.out.print("random number is : " + ranInt);
    }
}
