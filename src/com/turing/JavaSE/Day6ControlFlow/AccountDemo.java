package JavaSE.Day6ControlFlow;

class Account {

    // Without Private == Open Access to Populate Data
    // long balanace = 0;

    // Encapsulated
    // Access Controlled
    private long balance = 0;

    void debit(int amount) {
        if (amount >= 0 && amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Invalid debit operation");
        }
    }

    void credit(int amount) {
        if (amount >= 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid credit operation");
        }
    }

    public String toString() {
        return "Balance = " + balance;
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.credit(5000);
        acc.debit(2000);
        acc.credit(5000);
        acc.credit(5000);
        // Test Invalid Operations
        acc.debit(100000);
        acc.credit(-5000);
        System.out.println("Account " + acc);
    }
}
