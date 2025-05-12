import java.util.LinkedList;
import java.util.Queue;

class SharedResource{
    private Queue<Integer> buffer;
    private int bufferSize;
    public SharedResource(int bufferSize){
        this.buffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }
    public synchronized void produce (int item)throws InterruptedException{
        while (buffer.size() == bufferSize){
            System.out.println("Buffer is full, Producer is waiting for Consumer");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized int consume() throws InterruptedException{
        while (buffer.isEmpty()){
            System.out.println("Buffer is empty , consumer is waiting for Producer");
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumed : " + item);
        notify();
        return item;
    }

}


public class Thread_Consumer_Producer {
    public static void main(String[] args ){
        SharedResource sharedResource = new SharedResource(3);
        Thread producerThread = new Thread(()-> {
            try{
                for(int i = 1 ; i <= 6 ; i++){
                    sharedResource.produce(i);
                    Thread.sleep(1000);
                }
            }catch(Exception e ){
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(()-> {
            try{
                for(int i = 1 ; i<= 6 ; i++){
                    sharedResource.consume();
                    Thread.sleep(2000);
                }
            }catch(Exception e ){
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();

    }
}
