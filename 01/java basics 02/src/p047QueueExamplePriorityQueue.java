import java.util.PriorityQueue;
import java.util.Queue;

public class p047QueueExamplePriorityQueue {
    public static void main(String[] args){
        Queue <Integer> q = new PriorityQueue<>();
        q.add(56);
        q.add(4);
        q.add(3);
        System.out.print(q.poll());
    }
}
