import java.util.Random;

public class D0012_SumOfAll_Even_Number_untilThatNumber {
    public static void main(String[] args) {
        Random ran = new Random();
        int inpu = ran.nextInt(1000);
        System.out.println("Random Input is : " + inpu);
        int sum = 0;
        for(int i = 0; i <= inpu; i++){
            if (i % 2 == 0 ){
                sum = sum + i;
            }
        }
        System.out.println("sum all the even number upto " + inpu + " is : " + sum);
    }
}
