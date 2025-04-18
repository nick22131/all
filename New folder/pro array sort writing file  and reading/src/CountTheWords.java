import java.util.Scanner;

public class CountTheWords {
    public static void main(String[] args){
        System.out.print(" enter a string : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("String :" + s);
        int count = 1 ;
        for ( int i = 0 ; i < s.length()- 1 ; i++){
            if ((s.charAt(i)==' ') && (s.charAt(i+1)!= ' ' ) ) {
                count++;
            }
        }
    System.out.println("\n number of charcter are : " + count);


    }
}
