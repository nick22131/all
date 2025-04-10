class MonitorLockExample{

    //Method 1
    synchronized void method1()  {
        try{
            System.out.println("Inside method 1 "+ Thread.currentThread().getName() );
            Thread.sleep(3000);
        }catch(Exception e )   {
            e.printStackTrace();
        }
    }

    // Method 2
     void method2(){
        System.out.println("Method 2 , but before Sychronized  " + Thread.currentThread().getName() );
       synchronized(this) {
           try {
               Thread.sleep(2000);
               System.out.println("Method 2 , Inside Synchronized  " + Thread.currentThread().getName());
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
    }

    // Method 3
    void method3() {
        System.out.println("Method 3 " + Thread.currentThread().getName());

    }
}

public class p01_MonitorLock_Synchroniziton {
    public static void main(String[] args){
        MonitorLockExample obj = new MonitorLockExample();

        // Threads
        Thread t1 = new Thread (() -> {
            obj.method1();
            obj.method2();
            obj.method3();
        },"t1");
        Thread t2 = new Thread (() -> {
            obj.method1();
            obj.method2();
            obj.method3();
        }, "t2");
        Thread t3 = new Thread (() -> {
            obj.method1();
            obj.method2();
            obj.method3();
        },"t3");

        // Running Thread
        t1.start();
        t2.start();
        t3.start();


    }
}
