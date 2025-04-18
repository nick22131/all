// sum of digits in a num
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num : ");
        int num = sc.nextInt();
        int sum = 0 ;
        while (num > 0 ){
            sum = sum + num %10;
            num = num/10;

        }
        System.out.println("sum of digits is : " + sum);

    }
}
