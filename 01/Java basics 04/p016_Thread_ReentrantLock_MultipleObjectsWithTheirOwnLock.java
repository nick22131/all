import java.util.concurrent.locks.ReentrantLock;

class SharedResource1 {
    private final ReentrantLock lock = new ReentrantLock();
    void accessResource(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "is acessing "  + this);
            Thread.sleep(1000);
        }catch(InterruptedException e ){
            e.printStackTrace ();
        }finally{
            lock.unlock();
        }

    }

}
public class p016_Thread_ReentrantLock_MultipleObjectsWithTheirOwnLock {
    public static void main(String[] args){
        SharedResource1 sh = new SharedResource1();
        Thread t1 = new Thread ( ( ) -> {
            sh.accessResource();
        }, " Thread 01");

        SharedResource1 sh1 = new SharedResource1();
        Thread t2 = new Thread (( )-> {
            sh1.accessResource();
        },"Thread 02");
        t1.start();
        t2.start();
    }
}
