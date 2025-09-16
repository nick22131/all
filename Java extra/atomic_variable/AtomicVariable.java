package atomic_variable;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicCounter = new AtomicInteger(0);
        int numThreads = 5;
        Thread [] threads = new Thread[numThreads]  ;
        for (int i = 0 ; i < numThreads; i++){
            threads[i] = new Thread(new CounterThread(atomicCounter));
            threads[i].start();
        }

        for (Thread thread : threads){
            thread.join();
        }
        System.out.println("final Atomic Counter : " + atomicCounter.get());
    }


}


class CounterThread implements Runnable{
    private AtomicInteger counter ;

    public CounterThread(AtomicInteger counter ) {
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i =  0 ; i < 1000; i++){
            counter.incrementAndGet();
        }
    }

}
