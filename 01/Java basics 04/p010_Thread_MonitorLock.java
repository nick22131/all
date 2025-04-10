class MonitorLock{
    synchronized void method1 (){
        try{
            System.out.println("Inside Method 1 ");
            Thread.sleep(10000);
        }
        catch(Exception e ){
            System.out.print(e);
        }
    }
    void method2 (){
        System.out.println("Method2,but before synchronised  ");
        synchronized (this){
            System.out.println("Method2 , inside synchronised ");
        }
    }
    void method3 (){
        System.out.println("Method 3");
    }
}

// Main class
public class p010_Thread_MonitorLock {
    public static void main(String [] args){
        MonitorLock ml = new MonitorLock ();
        Thread t1 = new Thread (()->ml.method1());
        Thread t2 = new Thread (()-> ml.method2());
        Thread t3 = new Thread (() -> ml.method3());

        t1.start();
        t2.start();
        t3.start();
    }
}
