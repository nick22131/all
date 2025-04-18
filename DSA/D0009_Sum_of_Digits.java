import java.util.Random;

public class D0009_Sum_of_Digits {
    public static void main(String[] args ){
        Random ran = new Random();
        int num = ran.nextInt(100000);

        System.out.print("\n randon number is : " + num);
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum = sum + digit ;
            num = num / 10;
        }
        System.out.print("\n sum of random digit is : "   + sum);
    }
}
