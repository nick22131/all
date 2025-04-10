import java.util.LinkedList;
import java.util.Queue;

class Shared2{
  private Queue<Integer> buffer;
  private int bufferSize;
  public Shared2(int bufferSize){
      this.buffer = new LinkedList<>();
      this.bufferSize = bufferSize;
  }
  // produce method to add an item to the buffer
    synchronized void produce (int item )   throws InterruptedException{
      while ( buffer.size ( ) == bufferSize ){
          System.out.println("Buffer is  full , producer is waiting for consumer "  );
          wait();
      }
      buffer.add(item);
      System.out.println("produced : " + item );
      notifyAll();
    }
    // Consumer method to remove an item from the buffer
    synchronized int consume()throws InterruptedException {
      while (buffer.isEmpty()){
          System.out.println("Buffer is empty, Consumer is waiting for Producer ");
          wait();
      }
        int item = buffer.poll();
      System.out.println("Consumed : " + item ) ;
      notifyAll();
      return item ;
    }
  }

public class p015_Thread_Join {
    public static void main(String[ ] args){
        System.out.println("Main thread has started " + Thread.currentThread().getName());
        Shared2 shr = new Shared2(3);
        // producer thread
        Thread pro = new Thread (() -> {
            try {
                for (int i = 1 ; i <= 8; i++){
                    shr.produce(i) ;
                    Thread.sleep(200);
                }
            }catch (Exception e ){
                e.printStackTrace();
            }
        });
        // Consumer Thread
        Thread con = new Thread (() -> {
            try{
                for (int i = 1 ; i <= 8; i++ )  {
                    shr.consume ();
                    Thread.sleep(600);}

            }catch(Exception e ){
                e.printStackTrace();
            }
        });
        pro.start();
        con.start();
        // using Join to wait for both thread to finish
        try {
            pro.join();
            con.join();
            System.out.println("Consumer thread has finished" + Thread.currentThread().getName());
        }catch(Exception e ) {
            e.printStackTrace();
        }
        System.out.println("main thread has finished " + Thread.currentThread().getName());

    }
}
