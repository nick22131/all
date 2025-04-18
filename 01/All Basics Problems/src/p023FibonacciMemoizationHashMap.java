import java.util.HashMap;
import java.util.Scanner;

public class p023FibonacciMemoizationHashMap {
      static HashMap<Integer,Integer> molu= new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num for a series upto: ");
        int n = sc.nextInt();
        System.out.print("fibonacci series upto " + n + " terms(with memoization):  \n");
        for (int i = 0; i < n; i++) {
            System.out.print(fibmemo(i) + " ");
        }
    }
        private static int fibmemo(int m ){
        if( m <= 1 ){
            return m ;
        }
        if(molu.containsKey(m)){
            return molu.get(m);
        }
        int result = fibmemo(m-1) + fibmemo(m-2);
         molu.put(m,result);
         return result;
        

        }


}
