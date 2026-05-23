import java.util.*;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<String> foo = new ArrayList<>();

        foo.add("apple");
        foo.add("banana");
        foo.add("cherry");
        foo.add("date");
        foo.add("fig");
        System.out.println(foo);

        List<Integer> goo = new ArrayList<>();
        goo.add(1);
        goo.add(2);
        goo.add(3);
        goo.add(4);
        goo.add(5);
        goo.add(0, 200);
        System.out.println(goo);

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
        System.out.println(noo);

        noo.addAll(goo);
        System.out.println(noo);

        System.out.println(noo.get(3));
        System.out.println(noo.remove(10));
        System.out.println(noo);

    }

}