package oop;

public class BankAccount {
    long bid = 123456445546614L;
    int balance;
    String owner;

    void insert(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Malo penez");
            return;
        }
        balance -= amount;
    }
    void transaction(int amount, BankAccount receiver) {
        if (balance > amount) {
            balance -= amount;
            receiver.balance += amount;
        } else {
            System.out.println(":/");
        }
    }
}
