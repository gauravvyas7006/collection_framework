import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Tiger");
        animal.push("Bear");
        animal.push("Zebra");
        animal.push("Giraffe");
        System.out.println(animal);
        System.out.println(animal.peek());
        System.out.println(animal.pop());
        System.out.println(animal.peek());

    }
}
