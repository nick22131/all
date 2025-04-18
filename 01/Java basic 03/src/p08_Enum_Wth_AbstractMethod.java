enum Operation{
    ADD{
        public int apply(int a, int b){
            return a + b;
        }
    },
    Subtract{
        public int apply(int a , int b){
            return a - b ;
        }
    },
    MUlTIPLY{
        public int apply(int a, int b){
            return a * b;
        }
    };
    // Abstract method that each enum constant must implement
    public abstract int apply (int a, int b);
}

// Main Class
public class p08_Enum_Wth_AbstractMethod {
    public static void main(String[] args){
        int result  = Operation.ADD.apply(5,6);
        System.out.print("Addition Resuly:  " + result);
    }
}
