package JavaSE.Day8;

public class Money {
    int amount;

    Money(int amount) {
        this.amount = amount;
    }

    Money Add(Money another) {
        int total = another.amount + this.amount;
        return new Money(total);
    }

    public static void main(String[] args) {
        Money a = new Money(10);
        Money b = new Money(5);
        Money c = a.Add(b);

        System.out.println("Amount c = " + c.amount);
    }

}
