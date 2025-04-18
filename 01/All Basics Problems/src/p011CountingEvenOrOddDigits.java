import java.util.Scanner;

public class p011CountingEvenOrOddDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:  ");
        int num = sc.nextInt();
        int ecount = 0;
        int ocount = 0;
        while(num > 0 ){
            int rem = num % 10;
            if(rem % 2 == 0 ){
                ecount++;
            }
            else{
                ocount++;
            }
          num = num/10;
        }
        System.out.print("even : "+ ecount + "  odd:" + ocount );
        sc.close();

    }
}
