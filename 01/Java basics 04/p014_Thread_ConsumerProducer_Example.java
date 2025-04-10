import java.util.LinkedList;
import java.util.Queue;

class Shared1{
    private Queue<Integer > buffer;
    private int bufferSize ;
    public Shared1(int bufferSize ){
        this.buffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }
    // Produce method to add an item to the buffer
    synchronized void produce (int item)throws InterruptedException{
        while (buffer.size() == bufferSize  ){
            System.out.println("Buffer is full , producer is waiting for consumer ");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced : " + item)    ;
        notify();
    }
    // Consumer method to remove an item from the buffer
    synchronized int consume ( ) throws InterruptedException{
        while (buffer.isEmpty()){
            System.out.println("Buffer is empty , Consumer is waiting for Producer ");
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumed :  " + item )  ;
        notify();
        return item;

    }
}


public class p014_Thread_ConsumerProducer_Example {
    public static void main (String [ ] args){
    Shared1 sh = new Shared1 (3);
    Thread pro = new Thread (()-> {
        try {
            for (int i = 1; i <= 9; i++) {
                sh.produce(i);
                Thread.sleep(400);
            }
        }catch (Exception e ){
            e.printStackTrace() ;
        }
    });
    // Consumer Thread
        Thread con = new Thread( ( )-> {
            try{
                for ( int i = 1 ; i <= 9 ; i++) {
                    sh.consume();
                    Thread.sleep(1000);
                }
            }catch (Exception e ){
                e.printStackTrace();}
        });
        pro.start();
        con.start();
    }

}
