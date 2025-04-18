class Multithreading implements Runnable{
    @Override
    public void run(){
        System.out.println("code executed by thread: " +  Thread.currentThread().getName() );

    }

}

public class p008_Thread_creation_01 {
    public static void main (String[] args){
          System.out.println("Going inside the main method thread: " + Thread.currentThread().getName());
          Multithreading ml = new Multithreading ();
          Thread th = new Thread(ml)    ;
          th.start();
          System.out.println("Finish main method: " + Thread.currentThread().getName());
         }
}
