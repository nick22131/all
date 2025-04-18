import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int eve_cou = 0 ;
        int odd_cou = 0 ;
        /* for (int i = 1 ; i <= num ; i++){
            if (i % 2 == 0){
                eve_cou++;
            }else {
                odd_cou++;
            }
        }
        System.out.println("even numbers : " + eve_cou);
        System.out.println("odd numbers : " + odd_cou); */
                    // OR
        while(num > 0){
            int rem = num % 10;
            if(rem % 2 == 0){
                eve_cou++;
            }
            else{
                odd_cou++;

            }
            num = num /10;

        }
        System.out.println("even numbers : " + eve_cou);
        System.out.println("odd numbers : " + odd_cou  );
    }

}
