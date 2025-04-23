import java.util.Random;

public class D0011_Counting_EvenOdd_until_Number {
    public static void main(String[] args ){
        Random ran = new Random();
        int input = ran.nextInt(10000);
        int oddCount = 0;
        int evenCount = 0;
        System.out.println("Random number is : " + input);
        for(int i = 1; i <= input; i++){
            if (i % 2 == 0){
                evenCount ++;
            }else {
                oddCount++;
            }
        }

        System.out.println("even: " + evenCount + "   odd: " + oddCount );
    }

}
