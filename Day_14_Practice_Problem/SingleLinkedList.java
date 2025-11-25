package Day_14_Practice_Problem;

public class SingleLinkedList {

    private Node head;
    private Node tail;
    private int length;

    //Constructor
    public SingleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head : " + head.value);
    }

    public void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }

    //Append Method
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node prev = head;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

//    public LinkedList(int value){}
//    //Create a new Node
//    public void append(int value){}
//    //Create a new Node
//    //Add node to end
//    public void prepend(int value){}
//    //Create a new Node
//    //Add node to beginning
//    public boolean insert(int index,int value){}
//    //Create a new Node
//    //insert node in particular index

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }


    /*NOTES :
            1 ) static method can't access the not static global variable





    */
}
