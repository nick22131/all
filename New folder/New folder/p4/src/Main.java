//Problem statement
//You have been given a number 'N'. Your task is to find the sum of all even numbers from 1 to 'N' (both inclusive).

//Example :

//Given 'N' : 6
//Sum of all even numbers till 'N' will be : 2 + 4 + 6 = 12
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input 1 :
//        2
//        6
//        2
//Sample Output 1 :
 //       12
 //       2
//Explanation For Sample Input 1 :
//For test case 1 :
//Sum of all even numbers till 6 will be : 2 + 4 + 6 = 12

//For test case 2 :
//Sum of all even numbers till 2 will be : 2
//Sample Input 2 :
//        2
 //       4
//        5
//Sample Output 2 :
//        6
//        6
//Explanation For Sample Input 2 :
//For test case 1 :
//Sum of all even numbers till 4 will be : 2 + 4 = 6

//For test case 2 :
//Sum of all even numbers till 5 will be : 2 + 4 = 6  //


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sum = sum + i;//or  sum += i;
            }
            }
        System.out.println(sum);


        }
    }



//                                OR
// import java.util.*;
//
//public class Solution {
//    public static long evenSumTillN(int n) {
//        long sum = 0;
//        for (long i = 2; i <= n; i += 2) {
//            sum += i;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        // Example usage
//        int n = 10; // You can change this value or take input from the user
//        System.out.println("Sum of even numbers till " + n + " is: " + evenSumTillN(n));
//    }
//}