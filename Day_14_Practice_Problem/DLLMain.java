package Day_14_Practice_Problem;

public class DLLMain {

    public static void main(String[] args) {

            DoublyLinkedList myDLL = new DoublyLinkedList(1);
            myDLL.append(2);
            myDLL.append(3);
            myDLL.append(4);
            myDLL.getHead();
            myDLL.getTail();
            myDLL.getLength();

            System.out.println("\nDoubly Linked List:");
            myDLL.printList();

            System.out.println("\n\nRemoved Last value : " + myDLL.removeLast().value);
            myDLL.printList();
            System.out.println();
            myDLL.getHead();
            myDLL.getTail();
            myDLL.getLength();

    }
}
