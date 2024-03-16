package dsa.linkedlist.DLL01.Instructor;

public class DoublyLinkedList {
    private Node head;
private Node tail;
    private int length;
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    public void getHead() {
        if ( head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " +head.value);
        }
    }

    public void getTail() {
        if ( tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " +tail.value);
        }
    }

    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getLength() {
        System.out.println("Length: "+length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if ( length == 0 ) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if ( length == 0 ) {
            return null;
        }
        Node temp = tail;
        if ( length == 1 ) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if ( length == 0 ) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {

        if ( length == 0 ) {
            return null;
        }
        Node temp = head;
        if ( length == 1 ) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
