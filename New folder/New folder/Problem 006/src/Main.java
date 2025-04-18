import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse : ");
                String str= sc.next();
        String rev= "";
        // Using + (String Concatnation) operator
        int len = str.length();
        for(int i = len -1 ; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("reversed string is : " +  rev);

        // using character array
        char a[]= str.toCharArray();
        len = a.length;
        rev =  "";
        for(int i = len -1 ; i>=0; i--){
          rev = rev + a[i];
        }
        System.out.println("reveresed string by array :" + rev );

        // using StringBuffer class
        StringBuffer sb = new StringBuffer(str);
        rev = sb.reverse().toString();
        System.out.println("reversed string by StringBuffer :" + rev);

    }


    }
