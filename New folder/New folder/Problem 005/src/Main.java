// reversing the number

import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number : ") ;
        int num = sc.nextInt();
/*       int rev = 0 ;
        while (num!= 0){
            rev = rev * 10 + num % 10 ;
            num = num / 10 ;
        }
        System.out.println("reverse : " + rev  ); */


  // using SringBuilder method
       /* StringBuilder sb = new StringBuilder(String.valueOf(num));
        System.out.println("reverse : " + sb.reverse() );  */


  // using StringBuffer
  StringBuffer sb = new StringBuffer(String.valueOf(num));
  sb.reverse();
  int rev = Integer.parseInt(sb.toString());

  System.out.println("reverse      :  " + rev );

    }
}
