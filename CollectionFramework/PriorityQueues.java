import java.util.*;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Integer> qs = new PriorityQueue<>();
        qs.offer(25);
        qs.offer(15);
        qs.offer(5);
        qs.offer(45);
        System.out.println(qs);
        System.out.println(qs.poll());
        System.out.println(qs.peek());
        System.out.println(qs);

    }
}
