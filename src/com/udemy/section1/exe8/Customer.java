package section1.exe8;

import section1.exe8.Vault.Bank;
import section1.exe8.Vault.BankManager;

public class Customer {
    private String name;
    private double deposit;

    // Ensure that a Customer instance cannot be created without a name and an initial deposit
    public Customer(String name, double deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    private void accessVault(Bank bank, BankManager manager) {
        manager.accessVault(bank);
    }

    private void accessVault(Bank bank) {
    }

    public static void main(String[] args) {
        Bank yoma = new Bank(); // Bank Instance

        BankManager manager = new BankManager(); // Bank Manager Instance
        System.out.println("=====Manager=====");
        manager.accessVault(yoma);

        Customer customer = new Customer("Jerry", 3000.3); // Customer Instance with name and deposit

        // this one will not show no output
        System.out.println("=====Customer=====");
        customer.accessVault(yoma); // customer access to bank vault directly

        // this will show output
        System.out.println("=====Customer=====");
        customer.accessVault(yoma, manager); // customer access to bank vault via manager

        // Get Customer Name and His/Her Initial Deposit
        System.out.println("Customer name: "+customer.getName() + "Deposit Amount: "+customer.getDeposit());
    }
}
