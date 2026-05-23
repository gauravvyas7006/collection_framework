import java.util.LinkedList;
import java.util.Queue;

public class LinkedLists {
    public static void main(String[] args) {
        Queue<Integer> qoo = new LinkedList<>();
        qoo.offer(10);
        qoo.offer(20);
        qoo.offer(30);
        System.out.println(qoo);
        System.out.println("-----------------");
        System.out.println(qoo.poll());
        System.out.println(qoo);
        System.out.println(qoo.peek());

    }
}
