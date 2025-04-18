import java.util.Scanner;

public class p08ThrowExample {
    public static void main(String[] args){
         System.out.print(" enter age to check : ");
        Scanner sc = new Scanner( System.in ) ;
        int a = sc.nextInt();
        try{
            checkAge(a);
        }
        catch (Exception e ){
            System.out.print( e);
        }
    }
    public static void checkAge(int age ){
        if(age < 18 ){
            throw new IllegalArgumentException(" age must be older than 18 or greater");
        }
    }
}
