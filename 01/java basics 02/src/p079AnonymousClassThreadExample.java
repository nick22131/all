public class p079AnonymousClassThreadExample {
    public static void main(String[] args ){
        // Creating a threag using an anonymous class
        Thread th = new Thread (new Runnable(){
            @Override
            public void run(){
                System.out.println("Thread is running");
            }
        });
        th.start();
    }
}
