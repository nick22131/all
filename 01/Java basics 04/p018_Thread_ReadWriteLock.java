import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedResource3{
    boolean isAvailable = false ;

    void producer (ReadWriteLock lock ){
        try{
            lock.readLock().lock();
            System.out.println("Read lock acquired by : " + Thread.currentThread().getName());
            Thread.sleep(8900);
        }catch(Exception e) {
        }finally{
            lock.readLock().unlock();
            System.out.println("Read lock Released by: " + Thread.currentThread().getName());
        }
    }

    void consumer (ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by :  " + Thread.currentThread().getName());
            isAvailable = false ;
            Thread.sleep(3000);
        }catch(Exception e ){

        }finally{
            lock.writeLock().unlock();
            System.out.println("Write Lock released by : " + Thread.currentThread().getName());
        }
    }
}

public class p018_Thread_ReadWriteLock {
    public static void main(String[] args){
        SharedResource3 sh = new SharedResource3 ();
        ReadWriteLock lo = new ReentrantReadWriteLock();

        Thread t1 = new Thread ( () -> sh.producer(lo));
        Thread t2 = new Thread (() -> sh.producer(lo));

        SharedResource3 sh1 = new SharedResource3 ();
        Thread t3 = new Thread (() -> sh1.consumer(lo));

        t1.start();
        t2.start();
        t3.start();

    }
}
