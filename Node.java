/**
 * Since I will be implementing a stack using Singly linkedList. We need a node class so we can create node objects
 * each node will hold a value and hold a reference to the next node.
 */

public class Node {
    private int value; // the value that the node will hold
    private Node next; //this is a reference variable that will store address of the next node object

    //create a constructor

    public Node (int value) {
        this.value = value;
        this.next = null; //We will initially point the next reference to null
    }

    // Create getters and setters

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

