package oop;

public class Banking {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.balance = 1000;
        acc1.bid = 123456;
        acc1.owner = "Karel";

        acc1.insert(1000);
        System.out.println(acc1.balance);
        acc1.withdraw(599);
        System.out.println(acc1.balance);
        acc1.withdraw(1500);

    }
}
