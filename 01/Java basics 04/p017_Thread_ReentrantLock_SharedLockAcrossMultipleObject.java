import java.util.concurrent.locks.ReentrantLock;

class SharedResource2{
    private static final ReentrantLock lock = new ReentrantLock();
    void accessResource (){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()  + "  is Accessing resource");
            Thread.sleep(10000);
        }catch(InterruptedException e ){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
}

public class p017_Thread_ReentrantLock_SharedLockAcrossMultipleObject {
    public static void main(String [] args){
       SharedResource2 sh1 = new SharedResource2();
       Thread t1 = new Thread (()-> sh1.accessResource(), " Thread t1");

       SharedResource2 sh2 = new SharedResource2();
       Thread t2 = new Thread (( ) -> sh2.accessResource(), "Thread t2");

       t1.start();
       t2.start();
    }
}
