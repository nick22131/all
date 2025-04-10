class Multithreading1 extends Thread{
    @Override
    public void run(){
        System.out.println("Code executed by thread : " + Thread.currentThread().getName());
    }
}
public class p009_ThreadCreation_02 {
    public static void main(String[] args){
        System.out.println("Going inside main thread / method : " + Thread.currentThread().getName());
        Multithreading1 ml = new Multithreading1();
        ml.start();
        System.out.println("Finished main method : " + Thread.currentThread().getName());



    }
}
