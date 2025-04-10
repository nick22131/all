import java.util.concurrent.locks.StampedLock;

class SharedResource4{
    int a = 10;
    StampedLock stl = new StampedLock();

     void producer() {
         long stamp = stl.tryOptimisticRead();
         try {
             System.out.println("Taken Optimistic lock");
             a = 11;
             Thread.sleep(6000);
             if (stl.validate(stamp)) {
                 System.out.println("update a value successfully ");

             } else {
                 System.out.println("rollback of work");
                 a = 10;
             }
         } catch (Exception e) {
         }
     }
    void consumer(){
            long stamp = stl.writeLock();
            System.out.println("write Lock acquired by : "  + Thread.currentThread().getName());

            try{
                System.out.println("performing work");
                a= 9;
            }finally{
                stl.unlockWrite(stamp);
                System.out.println("Write lock released by :  "  + Thread.currentThread().getName());
            }
        }
}

public class p019_Thread_StampedLock_OptimusLocking {
    public static void main(String[ ] args){
        SharedResource4 sh = new SharedResource4();

        Thread t1 = new Thread (() -> sh.producer());
        Thread t2 = new Thread (() -> sh.consumer());

        t1.start();
        t2.start();
    }
}
