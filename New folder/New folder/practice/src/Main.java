import java.util.Scanner;

class Calu {
    int num;
    public int add(int n1, int n2){
        return n1 + n2 ;
    }
}
public class Main {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        Calu obj = new Calu();
        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();
       int r1 = obj.add(n1, 5);


       System.out.println(r1);
    }
}
