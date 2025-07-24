import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExample {
    public static void main (String [] args ){
        ThreadPoolExecutor ex = new ThreadPoolExecutor(2,
                5,
                100,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                new CustomThreadFactory("workingThreads"),
                new CustomRejectionHandler());
        ex.allowCoreThreadTimeOut(true);
        for (int i = 1 ; i < 23 ; i ++){
            ex.submit(()->{
                try{
                    Thread.sleep(300);
                    System.out.println("Thread Name : " + Thread.currentThread().getName());

                }catch(Exception e ){
                    e.printStackTrace();
                }
            });

        }
        ex.shutdown();
    }

}


class CustomRejectionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r , ThreadPoolExecutor executor ){
        System.out.println("task rejected : "  + r.toString());
    }
}

class CustomThreadFactory implements ThreadFactory{
   private AtomicInteger threadCount  = new AtomicInteger(0) ;
   private String namePrefix;

   public CustomThreadFactory (String namePrefix){
       this.namePrefix = namePrefix;

   }

    @Override
    public Thread newThread(Runnable r ){
        Thread th = new Thread (r);
        th.setName(namePrefix + " -Thread- " + threadCount.incrementAndGet());
        th.setDaemon(false);
        th.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Created new Thread :  " + th.getName());
        return th;
    }
}