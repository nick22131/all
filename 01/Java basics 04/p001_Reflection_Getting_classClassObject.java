public class p001_Reflection_Getting_classClassObject {
    public static void main(String[] args ) throws ClassNotFoundException {
        class Birds{}
        // 1
        Class birdclasso = Class.forName("Bird");
        // 2

        Class birdcl02 = Birds.class;

        // 3
        Class birdobj = new Birds().getClass();

    }
}
