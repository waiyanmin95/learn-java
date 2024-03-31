package turing.JavaSE.Day7Class;

public class Stack {
    int[] xi = new int[5];
    int top = -1;

    public void push(int e) {
        xi[++top] = e;
        // Debug Purpose
        for (int v : xi) {
            System.out.println("PUSH Value: " + v + " PUSH Top: " + top);
        }
    }

    public int pop() {
        for (int v : xi) {
            System.out.println("POP Value: " + v + " POP Top: " + top);
        }
        return xi[top--];
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
