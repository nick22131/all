class SharedResources{
    private boolean itemAvailable = false;
    synchronized void addItem(){
        System.out.println("Item added by : " + Thread.currentThread().getName() +"and invoking all threads which are waiting ");
        itemAvailable = true ;
        notifyAll();
    }
    synchronized void consumeItem(){
        System.out.println("Consumer thread invoked by : " + Thread.currentThread().getName());
       while(!itemAvailable){
           try{
               System.out.println("Consumer Thread " + Thread.currentThread().getName());
               wait();
           }
           catch(InterruptedException e ){
               e.printStackTrace();
           }
       }
       System.out.println("Item consumed by :" + Thread.currentThread().getName());
       itemAvailable = false;
    }
}
class ProduceTask implements Runnable {
    private SharedResources shr;
    ProduceTask(SharedResources shr){
        this.shr = shr;
    }
    @Override
    public void run() {
        System.out.println("Produced thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shr.addItem();
    }
}
class ConsumeTask implements Runnable {
    private SharedResources shr;
    ConsumeTask(SharedResources shr){
        this.shr = shr;
    }
    @Override
    public void run(){
        System.out.println("Consumer Thread : " + Thread.currentThread().getName());
        shr.consumeItem();
    }
}


public class p011_Threads_MonitorLock_ConsumerProducer {
    public static void main(String[] args){
      System.out.println("Main method Started ");
      SharedResources shr = new SharedResources();
      // Producer thread
        Thread prot = new Thread(new ProduceTask(shr));
        // Consumer thread
        Thread cont = new Thread(new ConsumeTask(shr));

        // Start thread
        prot.start();
        cont.start();

        System.out.println("Main Method End"    );

    }
}
