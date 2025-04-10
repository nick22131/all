import java.util.Scanner;

public class p06MultipleCatchExample {
    public static void main(String[] args){
        System.out.print(" give array size and number to divide : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int[] array = new int[a];
            array[10] = 50/b;
        }
        catch (ArithmeticException e){
            System.out.print("can't divide by zero ");

        }
        catch(IndexOutOfBoundsException e ){
            System.out.print(" index out of bound");
        }
        catch (Exception e){
            System.out.print("General exception  " + e );
        }
    }
}
