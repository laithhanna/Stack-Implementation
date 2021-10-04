import java.util.EmptyStackException;
/**
 * this class will be used to test our stack!
 * Notes: our stack was implemented using a singly linkedList. Also, remember that any stack follows the principle of LIFO = Last In First Out
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();

        System.out.printf("\n%d has been popped from the stack\n\n", stack.pop());
        stack.printStack();

        try {
            for (int i = 0; i < 5; i++) {
                stack.pop();
            }
        } catch (Exception E) {
            System.out.println("\nStack is empty. There are no elements to pop");
        }

        try {
            stack.peek();
        } catch (EmptyStackException E) {
            System.out.printf("\nThe stack is empty!\nThe size of the Stack: %d", stack.size());
        }
    }
}
