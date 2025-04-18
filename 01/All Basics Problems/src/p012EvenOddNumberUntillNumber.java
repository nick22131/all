import java.util.Scanner;

public class p012EvenOddNumberUntillNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number untill to \n find out how may even or odd numbers: ");
        int num = sc.nextInt();
        int odd_count = 0;
        int even_count = 0;
        for(int i= 1; i <= num; i++ ){
            if (i % 2==0){
                even_count ++;
            }
            else {
                odd_count++;

            }

        }
        System.out.print("even: " + even_count + "  odd:" + odd_count);
    }
}
