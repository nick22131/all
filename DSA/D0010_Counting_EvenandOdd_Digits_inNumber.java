import java.util.Random;

public class D0010_Counting_EvenandOdd_Digits_inNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1000000);
        System.out.print("\n random num is : " + num);
        int oddCounter = 0;
        int evenCounter= 0;
        while (num > 0){
            int digit = num % 10;
            if (digit % 2 == 0 ){
                evenCounter ++;
            }else{
                oddCounter++;
            }
          num =   num /10;
        }
        System.out.print("\n Even digits are : " + evenCounter + "\n odd digits are : " + oddCounter );
    }
}
