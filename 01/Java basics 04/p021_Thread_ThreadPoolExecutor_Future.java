import java.util.concurrent.*;

public class p021_Thread_ThreadPoolExecutor_Future {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1, 1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<?> fuO = pool.submit(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("this is the task , which thread will execute");
            } catch (Exception e) {
            }
        });
        System.out.println("is Done : " + fuO.isDone());
        try {
            fuO.get(2, TimeUnit.SECONDS);

        } catch (TimeoutException e) {
            System.out.println("Timeout Exection Happened ");
        } catch (Exception e) {

        }
        try {
            fuO.get();
        } catch (Exception e) {

        }
        System.out.println("is Done :" + fuO.isDone());
        System.out.println("is cancelled: " + fuO.isCancelled());

    }
}
