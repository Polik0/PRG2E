package oop;

public class SlotMachine {
    int balance, debt;
    public SlotMachine(int balance, int debt) {
        this.balance = balance;
        this.debt = debt;
    }

    public void bet () {
        int a1 = (int)(Math.random() * 7 + 1);
        int a2 = (int)(Math.random() * 7 + 1);
        int a3 = (int)(Math.random() * 7 + 1);
        if (balance < 150) {
            System.out.println("No money");
            return;
        } else if (a1 == a2 && a1 == a3) {
            System.out.println("Vyhra!");
            balance += 1500 - 150;
        } else {
            balance -= 150;
            System.out.println(":(");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void loan(int money) {
        balance += money;
        debt += (int)(money*1.5);
    }
}
