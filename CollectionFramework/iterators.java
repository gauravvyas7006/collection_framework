import java.util.*;

public class iterators {

    public static void main(String[] args) {
        List<Integer> noo = new ArrayList<>();
        noo.add(10);
        noo.add(20);
        noo.add(30);
        noo.add(40);
        noo.add(50);
        noo.add(60);
        noo.add(70);
        noo.add(80);
        noo.add(90);
        noo.add(100);

        Iterator<Integer> it = noo.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
