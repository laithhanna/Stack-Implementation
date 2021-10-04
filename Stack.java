import java.util.EmptyStackException;

/**
 * This is the Stack class. our stack will be implemented using singly linked list
 * our class will have 2 fields: int size field to keep track of the size of the stack
 * and a Node top field which will keep track of the top element in the stack (the last node we added)
 * Remember a stack follows the principle of LIFO = Last In First Out
 */

public class Stack {
    private int size; //to keep track of the size if our stack. Initially initialized to 0
    private Node top; //reference variable that will store the address of the top node (last inserted) that holds the top element

    //Create the constructor

    public Stack() {
        this.top = null; //since at the start the stack is empty, the top reference will point to null
    }

    /**
     * this method will return is the stack is empty
     * @return True of the stack is empty
     */
    public Boolean isEmpty() {
        return top == null; //if the top refers ti null then the stack is empty!
    }

    /**
     * this method will return the size of the stack
     * @return the size of the stack
     */
    public int size() {
        return size;
    }

    /**\
     * this method will add a new value to the stack.
     * Since we are implementing this stack using a Singly LinkedList then we need to create a node to hold this value.
     * When the node is created we will make sure that the top reference will point to the new node that holds the most recent inserted element
     * @param value to be added to the stack
     */
    public void push(int value) {
        //first create the node that will hold the value
        Node n = new Node(value); //note that the next reference of the node will be null by default!
        n.setNext(top);
        top = n;
        size++;
    }

    /**
     * this method will pop the last inserted node to the linked list and will return the value it holds
     * @return the value held in the node that has been popped
     */
    public int pop() throws Exception {
        //make sure that the stack is NOT empty
        if (!isEmpty()) {
            //hold the value of that node that you want to pop in a temp variable
            int temp = top.getValue();
            //top.setNext(null);
            top = top.getNext();
            size--;
            return temp;
        }
        throw new Exception("Stack is empty!"); //if the stack is empty and I try to pop a node an exception will be thrown
    }

    /**
     * this method will return the value of the top node value (most recent value that was added)
     * This method do not remove the node; it just return its value.
     * @return the value of the to node (the most recent node that was added).
     */
    public int peek() {
        //first, check if the stack is empty
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    /**
     * this method will print the elements of the stack
     */
    public void printStack() {
        //check if stack is empty
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Printing the stack...");
            Node temp = top; //Created a temp reference variable that will start at the top of the stack
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
            System.out.println("The size of the stack: " + size);
        }
    }
}
