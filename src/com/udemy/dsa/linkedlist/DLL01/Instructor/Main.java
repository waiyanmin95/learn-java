package dsa.linkedlist.DLL01.Instructor;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDDLinkedList = new DoublyLinkedList(1);
        myDDLinkedList.getHead();
        myDDLinkedList.getTail();
        myDDLinkedList.getLength();
        myDDLinkedList.printAll();
        System.out.println("=======");
        myDDLinkedList.append(2);
        myDDLinkedList.append(3);
        myDDLinkedList.getHead();
        myDDLinkedList.getTail();
        myDDLinkedList.getLength();
        myDDLinkedList.printAll();
        System.out.println("=======");
        System.out.println("Removed Node Value: "+myDDLinkedList.removeLast().value);
        System.out.println("Removed Node Value: "+myDDLinkedList.removeLast().value);
        System.out.println("Removed Node Value: "+myDDLinkedList.removeLast().value);
        System.out.println("Removed Node Value: "+myDDLinkedList.removeLast()); // null case
        myDDLinkedList.getHead();
        myDDLinkedList.getTail();
        myDDLinkedList.getLength();
        myDDLinkedList.printAll();
        System.out.println("=======");
        myDDLinkedList.append(3);
        myDDLinkedList.getLength();
        myDDLinkedList.append(4);
        myDDLinkedList.append(5);
        myDDLinkedList.getHead();
        myDDLinkedList.getTail();
        myDDLinkedList.getLength();
        myDDLinkedList.printAll();

        System.out.println("=======");
        myDDLinkedList.removeFirst();
        myDDLinkedList.getHead();
        myDDLinkedList.getTail();
        myDDLinkedList.getLength();
        myDDLinkedList.printAll();
        System.out.println("=======");
        myDDLinkedList.removeFirst();
        myDDLinkedList.getHead();
        myDDLinkedList.getTail();
        myDDLinkedList.getLength();
        myDDLinkedList.printAll();
        System.out.println("=======");
        myDDLinkedList.removeFirst();
        myDDLinkedList.getHead();
        myDDLinkedList.getTail();
        myDDLinkedList.getLength();
        myDDLinkedList.printAll();
        myDDLinkedList.removeFirst();
        myDDLinkedList.printAll();
    }
}
