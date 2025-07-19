import java.util.LinkedList;
import java.util.Queue;

public class ThreadConsumerProducer {
    public static void main (String [] args ){
     SharedResources sharedResources = new SharedResources(3);

     Thread producerThread = new Thread(()-> {
         try{
             for(int i = 1 ; i <=6 ; i++  ){
                 sharedResources.produce(i);
                 Thread.sleep(399);
             }
         }catch(Exception e ){
             e.printStackTrace();
         }
     });

     Thread consumerThread = new Thread(()-> {
         try {
             for (int i = 1 ; i<= 6 ; i++){
                 sharedResources.consume();
                 Thread.sleep(500);

             }
         }catch(Exception e ){
             e.printStackTrace();
         }
     }) ;
     producerThread.start();
     consumerThread.start();

    }

}


class SharedResources {
    private Queue<Integer> buffer;
    private int bufferSize;

    public SharedResources(int bufferSize ){
        this.buffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException{
        while (buffer.size() == bufferSize){
            System.out.println("Buffer is full, producer is waiting for consumer  ");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced : " + item);
        notify();
    }

    public synchronized int consume()throws InterruptedException {
        while (buffer.isEmpty()){
            System.out.println("Buffer is Empty , Consumer is waiting for producer");
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notify();
        return item;

    }

}
