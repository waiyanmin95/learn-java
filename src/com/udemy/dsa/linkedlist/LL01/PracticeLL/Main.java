package dsa.linkedlist.LL01.PracticeLL;

public class Main {
    public static void main(String[] args) {
        PracticeLL myLinkedList = new PracticeLL(33);
        myLinkedList.append(22);
        myLinkedList.append(44);
        myLinkedList.append(55);
        myLinkedList.printAll();

        myLinkedList.makeEmpty();

        myLinkedList.append(55);
        myLinkedList.append(88);
        myLinkedList.append(99);
        myLinkedList.append(100);
        myLinkedList.append(88);
        myLinkedList.append(99);
        myLinkedList.append(33);
        myLinkedList.printAll();
        System.out.println("Middle Value: "+myLinkedList.findMiddleNode().value);
    }

}
