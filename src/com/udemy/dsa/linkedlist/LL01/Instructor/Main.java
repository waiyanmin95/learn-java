package dsa.linkedlist.LL01.Instructor;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(33);

        myLinkedList.append(11);
        myLinkedList.append(22);

        myLinkedList.printList();

        System.out.println("=======");
//        System.out.println("Remove Value: "+myLinkedList.removeFirst().value);
//        System.out.println("Remove Value: "+myLinkedList.removeFirst());
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("Index Value: "+myLinkedList.get(0).value);

        System.out.println("=======");
        System.out.println("Setting: "+myLinkedList.set(1, 100));
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.printList();

        System.out.println("=======");
        myLinkedList.remove(2);

        System.out.println("=======");
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
