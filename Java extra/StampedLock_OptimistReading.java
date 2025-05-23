import java.util.concurrent.locks.StampedLock;

class SharedResources{
    int a = 10;
    StampedLock lock = new StampedLock();
    public void producer(){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Taken Optimistic lock");
            a = 11 ;
            //Thread.sleep(1000);
            if(lock.validate(stamp)){
                System.out.println("updated value successfully");
            }else{
                System.out.println("rollback of work");
                a = 10;
            }
        }catch(Exception e ){
            e.printStackTrace();
        }
    }

    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("write lock acquired by: "  + Thread.currentThread().getName());
        try{
            System.out.println("performing work");
            a = 9;
        }finally{
            lock.unlockWrite(stamp);
            System.out.println("write lock released by : " + Thread.currentThread().getName());
        }
    }
}



public class StampedLock_OptimistReading {
  public static void main (String[ ] args){
      SharedResources resource = new SharedResources();
      Thread th1 = new Thread(() -> {
          resource.producer();
      });

      Thread th2 = new Thread(()-> {
          resource.consumer();
      } );

      th1.start();
      th2.start();
      try{
          th1.join();
          th2.join();
      }catch (Exception e ){
          e.printStackTrace();
      }
  }

}
