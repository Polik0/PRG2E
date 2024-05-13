package oop.references;

public class BankAccount {
    long bankID;
    double balance;
    Person owner;

    public BankAccount(long bankID, double balance, Person owner) {
        this.bankID = bankID;
        this.balance = balance;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    void deposit (double balance) {
        System.out.println(owner.getFullName() + " na ucet ulozil " + balance);
        this.balance += balance;
    }

    boolean withdraw (double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    boolean transaction(BankAccount other, double amount) {
        if (withdraw(amount)) {
            other.deposit(amount);
            System.out.println(owner.getFullName() + " poslal " + amount + " na ucet uzivatele " + other.owner.getFullName());
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Person o1 = new Person("Karel", "CZE");
        Person o2 = new Person("Pepe", "ESP");
        BankAccount acc1 = new BankAccount(54856, 5000, o1);
        BankAccount acc2 = new BankAccount(54859, 1000, o2);

        acc1.deposit(800);
        System.out.println(acc1.owner.getFullName() + " ma na uctu " + acc1.balance);

    }
}
