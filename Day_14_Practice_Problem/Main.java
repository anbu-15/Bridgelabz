package Day_14_Practice_Problem;

public class Main {

    public static void main(String[] args) {
        SingleLinkedList myLinkedList = new SingleLinkedList(4);
        myLinkedList.append(10);
        myLinkedList.append(11);
        myLinkedList.append(14);

        //      PRINT LIST
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();
        System.out.println("\nRemoved value : " + myLinkedList.removeLast().value);
        myLinkedList.printList();


    }
}
