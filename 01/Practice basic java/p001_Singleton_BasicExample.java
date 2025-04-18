class Singleton{
    private static Singleton instance ;
    private Singleton (){};
    public static Singleton getInstance(){
        if(instance == null ){
            instance = new Singleton ();
        }
        return instance ;
    }
    void showMessage(){
        System.out.println("Hello from singleton" );
    }
}

public class p001_Singleton_BasicExample {
    public static void main (String[] args ){
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();
        ob1.showMessage();

        System.out.println(ob1 == ob2 ) ;

    }
}
