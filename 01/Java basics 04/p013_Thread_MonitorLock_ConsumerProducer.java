class SharedResources1{
    private int item = 0;
    private boolean available = false ;
    synchronized void produceItem(){
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            item++ ;
            System.out.println("produced item : " + item + "by " + Thread.currentThread().getName());
            available = true ;
            notifyAll();

    }
    synchronized void consumeItem(){
        while (!available ) {
            try{
                wait();
            }catch(InterruptedException e ){
                e.printStackTrace();
            }
        }
        System.out.println("Consumed item : " + item + " by " + Thread.currentThread().getName() );
        available = false ;
        notifyAll();
    }
}

public class p013_Thread_MonitorLock_ConsumerProducer {
    public static void main(String [] args ){
        System.out.println("Main thread start .");
     SharedResources1 sr = new SharedResources1 ();
      // Producer Thread
        Thread prot = new Thread (() -> {
            System.out.println(" Producer Thread " + Thread.currentThread().getName()    );
        sr.produceItem();
        });
        // consumer Thread
        Thread con= new Thread (() -> {
            System.out.println("Consumer Thread : " + Thread.currentThread().getName());
            sr.consumeItem();
        });
        prot.start();
        con.start();

        System.out.println(" Main method ends ");
    }

}
