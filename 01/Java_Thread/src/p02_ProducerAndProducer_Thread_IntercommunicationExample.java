class SharedResources{
    private boolean itemAvailable = false;

    // add item
    synchronized void addItem(){
        System.out.println(" Item added by : "+ Thread.currentThread().getName()
        + " and Invoking all the threads are which are waiting " );

        itemAvailable = true;
        notifyAll();
    }

    // Consume Item
    synchronized void consumeItem(){
        System.out.println("Consumer Thread invoked by " + Thread.currentThread().getName());
        while(!itemAvailable){
            try{
                System.out.println("Consumer Thread " + Thread.currentThread().getName()+"  is waiting ");
                wait();
            }catch(Exception e ){
                e.printStackTrace();
            }
        }
        System.out.println(" Item Consumed by :" + Thread.currentThread().getName());
        itemAvailable = false;
    }
}

class ProduceTask implements Runnable {
    private SharedResources sR ;
    ProduceTask(SharedResources sR){
        this.sR = sR;
    }
    @Override
    public void run() {
        System.out.println("Producer Thread : "  + Thread.currentThread().getName() );
        try{
            Thread.sleep(2000 );
        }catch(Exception e ){
            e.printStackTrace ();
        }
        sR.addItem();

    }
}
class ConsumerTask implements Runnable{
    private SharedResources sR ;
    ConsumerTask(SharedResources sR){
        this.sR = sR ;
    }
    @Override
    public void run(){
        System.out.println("Consumer thread : " + Thread.currentThread().getName());
        sR.consumeItem();
    }
}

// Main class
public class p02_ProducerAndProducer_Thread_IntercommunicationExample {
    public static void main(String[] args){
  System.out.println("Main Method Start " + Thread.currentThread().getName());
  SharedResources sr = new SharedResources ();

    //Producer Thread
        Thread pT = new Thread (new ProduceTask(sr),"pT");

        // consumer Thread
        Thread cT = new Thread (new ConsumerTask(sr),"cT");

        // starting Threads
        pT.start();
        cT.start();

        System.out.println("Main method end");
    }
}
