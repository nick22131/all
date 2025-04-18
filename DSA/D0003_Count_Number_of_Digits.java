import java.util.Scanner;

public class D0003_Count_Number_of_Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++ ;
        }
        System.out.println("\n number of digits are: " + count   );
    }
}
