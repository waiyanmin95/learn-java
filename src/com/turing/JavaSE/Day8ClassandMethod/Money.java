package turing.JavaSE.Day8ClassandMethod;

public class Money {
    int amount;

    Money(int amount) {
        this.amount = amount;
    }

    // Immutable
    Money Add(Money another) {
        int total = another.amount + this.amount;
        // Return Objects
        return new Money(total);
    }

    public static void main(String[] args) {
        Money a = new Money(10);
        System.out.println(a);
        Money b = new Money(5);
        System.out.println(b);
        Money c = a.Add(b);
        System.out.println(c);

        System.out.println("Amount c = " + c.amount);
    }

}
