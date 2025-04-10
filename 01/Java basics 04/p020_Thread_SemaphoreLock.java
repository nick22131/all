import java.util.concurrent.Semaphore;

class SharedResource5{
    boolean isAvailable = false;
    Semaphore lo = new Semaphore(2);

    void producer (){
        try{
            lo.acquire();
            System.out.println("Lock acquired by:  " +  Thread.currentThread().getName());
            isAvailable = true ;
            Thread.sleep(4000);
        }catch(Exception e )    {
    }finally {
            lo.release();
            System.out.println("Lock Released by : " + Thread.currentThread().getName());
        }
}}
// Main class
public class p020_Thread_SemaphoreLock {
    public static void main(String[] args){
  SharedResource5 sh = new SharedResource5 ();
  Thread t1 =  new Thread (() -> sh.producer());
  Thread t2 = new Thread (() -> sh.producer());
  Thread t3 = new Thread (() -> sh.producer());
  Thread t4 = new Thread (() -> sh.producer());

  t1.start();
  t2.start();
  t3.start();
  t4.start();
    }
}
