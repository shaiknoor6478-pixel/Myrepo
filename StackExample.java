import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after push operations: " + stack);
        String topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);
        System.out.println("Stack after peek: " + stack);
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop operation: " + stack);
        int position = stack.search("Apple");
        System.out.println("Position of 'Apple' (from top): " + position);
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Popping all remaining elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println("Stack after popping all elements: " + stack);
        System.out.println("Is the stack empty now? " + stack.isEmpty());
    }
}