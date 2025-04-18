import java.util.concurrent.locks.ReentrantLock;

class Shared3{
    boolean isAvailable = false;
    void producer (ReentrantLock lock){
        try {
            lock.lock();
            System.out.println("Lock acquired by "  + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4800);
        }catch(InterruptedException e ){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
            System.out.println("Lock released by : " + Thread.currentThread().getName());
        }
    }
}

public class p016_Thread_ReentrantLock_SimpleExample {
    public static void main(String [] args){
        ReentrantLock lo = new ReentrantLock();
        Shared3 sh = new Shared3 ();
        Thread th1 = new Thread (() -> sh.producer(lo));

        Shared3 sh1 = new Shared3 ();
        Thread th2 = new Thread (()-> sh1.producer(lo));

        th1.start();
        th2.start();
    }
}
