package dsa.linkedlist.LL01;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.append(5);
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.append(23);
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.append(7);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.append(4);
        myLinkedList.getLength();



        System.out.println("\nNew Linked List:");
        System.out.println("Removed Last Value: "+myLinkedList.removeLast().value);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("=======");
        myLinkedList.prepend(3);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();


        System.out.println("=======");
        myLinkedList.getLength();
        System.out.println("Remove Value: "+myLinkedList.removeFirst().value);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
    }
}
