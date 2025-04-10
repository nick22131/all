class Calculator{
    int add (int a, int b){
        return a+b;
    }
    int add(int a, int b, int c ){
        return a+b+c;
    }
    double add(double a , double b){
        return a+b;
    }
}

public class p013PolymorphismMethodOverloading {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println( cal.add(9,8));
        System.out.println(cal.add(6,7,8));
        System.out.println(cal.add(9.89,8.9));

    }
}
