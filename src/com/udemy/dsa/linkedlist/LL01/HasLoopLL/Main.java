package dsa.linkedlist.LL01.HasLoopLL;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(33);
        myLinkedList.append(44);
        myLinkedList.append(55);
        myLinkedList.append(66);
        myLinkedList.append(77);
        myLinkedList.append(88);
        myLinkedList.append(88);
        myLinkedList.makeLoop();
        System.out.println(myLinkedList.hasLoop()); // true case

        myLinkedList.makeEmpty();
        System.out.println(myLinkedList.hasLoop()); // false case
    }
}
