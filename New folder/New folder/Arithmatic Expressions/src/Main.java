public class Main {
    public static void main(String[] args){
        int result = 10 + 3;
        System.out.println(result);
        int result1 = 10 - 3;
        System.out.println(result1);
        int result2 = 10 * 3;
        System.out.println(result2);
        int result3 = 10 / 3;
        System.out.println(result3);
        double result4 =(double) 10 /(double) 3;
        System.out.println(result4);
        int x = 1;
        x++; //or use   x = x + 1
        // post or prefix
        System.out.println(x);
        int a = 1;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        int c = 1;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
        int e = 1;
        e += 2 ; // same as e = e+2   this is called augmented operator e += 2/e -= 2/e *= 2
        System.out.println(e);
        // BODMAS
        int f = 1 + 2 * 3;
        System.out.println(f);

    }
}
