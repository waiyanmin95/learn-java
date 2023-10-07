package JavaSE.Day11Exceptions;

class StackOverFlowException extends Exception {
    public StackOverFlowException(String message) {
        super(message);
    }
}

class StackUnderFlowException extends Exception {
    public StackUnderFlowException(String message) {
        super(message);
    }
}

class Stack {
    private int[] items = new int[10];
    private int top = -1;

    public void push(int element) throws StackOverFlowException {
        if (top >= items.length - 1) {
            throw new StackOverFlowException("StackOverFlow E");
        } else {
            this.items[++top] = element;
        }
        System.out.println("Top = " + top);
    }

    public int pop() throws StackUnderFlowException {
        if (top == -1) {
            throw new StackUnderFlowException("StackUnderFlow E");
        }
        return this.items[top--];
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        try {
            for (int i = 0; i < 10; i++) {
                s.push(i);
            }
            for (int i = 0; i < 16; i++) {
                System.out.println("Pop = " + s.pop());
            }
        } catch (StackOverFlowException | StackUnderFlowException e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
    }
}
