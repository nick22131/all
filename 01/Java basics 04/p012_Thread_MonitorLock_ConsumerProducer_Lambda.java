class SharedResource {
    private boolean isItemAvailable  = false;
    synchronized void addItem(){
        isItemAvailable = true;
        System.out.println("Producer Thread calling the notify method ");
        notifyAll();
    }
    synchronized void consumeItem(){
        System.out.println("Consumer thread inside consumeItem Method ");
        while (!isItemAvailable )   {
            try{
                System.out.println("Consumer Thread is waiting ");
                wait();
            }
            catch(Exception e ){
                e.printStackTrace();
            }
        }
        isItemAvailable = false;
        System.out.println("Consumer thread consume the item");
    }
}

// Main class
public class p012_Thread_MonitorLock_ConsumerProducer_Lambda {
    public static void main(String [] args){
        SharedResource shr = new SharedResource()   ;
        // Producer thread
        Thread prot = new Thread (() -> {
            try {
                Thread.sleep(3000);
            }catch(InterruptedException e  ) {
                e.printStackTrace();
            }
            shr.addItem();
        });

        //Consumer Thread
        Thread cot = new Thread (()-> {
            shr.consumeItem();
        });
            prot.start();
            cot.start();
    }
}
